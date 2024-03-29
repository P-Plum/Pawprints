package plum.pawprints.entity;

import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIFollowParent;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIMate;
import net.minecraft.entity.ai.EntityAIPanic;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWanderAvoidWater;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.util.DamageSource;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraft.world.World;
import plum.pawprints.util.handlers.LootTableHandler;
import plum.pawprints.util.handlers.SoundHandler;
import software.bernie.geckolib3.core.IAnimatable;
import software.bernie.geckolib3.core.PlayState;
import software.bernie.geckolib3.core.builder.AnimationBuilder;
import software.bernie.geckolib3.core.controller.AnimationController;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;
import software.bernie.geckolib3.core.manager.AnimationData;
import software.bernie.geckolib3.core.manager.AnimationFactory;

public class EntityAmericanPika extends EntityAnimal implements IAnimatable
{
	public AnimationFactory factory = new AnimationFactory(this);
    protected static final DataParameter<Boolean> SLEEPING = EntityDataManager.createKey(EntityBilby.class, DataSerializers.BOOLEAN);
	
	public EntityAmericanPika(World worldIn)
	{
		super(worldIn);
        this.ignoreFrustumCheck = true;
		setSize(0.2F, 0.2F);
	}
	
	public void onLivingUpdate()
    {
        if (this.onGround) {
            setSleeping(world.getWorldTime() >= 13000 && world.getWorldTime() <= 23000);
        }
        if (this.inWater || this.isInWater() || this.isBurning()) {
            setSleeping(false);
        }
        super.onLivingUpdate();
    }
	
	protected void entityInit()
    {
        super.entityInit();
        this.dataManager.register(SLEEPING, Boolean.valueOf(false));
    }

    public void writeEntityToNBT(NBTTagCompound compound)
    {
        super.writeEntityToNBT(compound);
        compound.setBoolean("Sleeping", this.isSleeping());
    }

    public void readEntityFromNBT(NBTTagCompound compound) {
        super.readEntityFromNBT(compound);
        this.setSleeping(compound.getBoolean("Sleeping"));
    }

    public void setSleeping(boolean value) {
        this.dataManager.set(SLEEPING, Boolean.valueOf(value));
    }

    public boolean isSleeping() {
        return this.dataManager.get(SLEEPING);
    }

    @Override
    public boolean isMovementBlocked() {
        if (this.onGround) {
            return super.isMovementBlocked() || isSleeping();
        } else {
            return super.isMovementBlocked();
        }
    }
	
	@Override
	protected void initEntityAI()
	{
		this.tasks.addTask(0, new EntityAISwimming(this));
        this.tasks.addTask(1, new EntityAIPanic(this, 0.4D));
        this.tasks.addTask(2, new EntityAIWanderAvoidWater(this, 0.3D));
        this.tasks.addTask(3, new EntityAIWatchClosest(this, EntityPlayer.class, 6F));
        this.tasks.addTask(4, new EntityAILookIdle(this));
        this.tasks.addTask(1, new EntityAIMate(this, 1.0D));
        this.tasks.addTask(2, new EntityAIFollowParent(this, 0.4D));
	}
	
	@Override
	protected void applyEntityAttributes()
	{
		super.applyEntityAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(5.0D);
		this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.5D);
	}
	
	@Override
	public float getEyeHeight()
	{
		return 0.25F;
	}
	
	@Override
	public EntityAgeable createChild(EntityAgeable ageable) {
		EntityAmericanPika child = new EntityAmericanPika(this.world);
		return child;
	}
	
	@Override
	public boolean isBreedingItem(ItemStack stack) {
		if (stack == null)
			return false;
		if (new ItemStack(Blocks.YELLOW_FLOWER, (int) (1)).getItem() == stack.getItem())
			return true;
		if (new ItemStack(Blocks.RED_FLOWER, (int) (1), 0).getItem() == stack.getItem()
				&& new ItemStack(Blocks.RED_FLOWER, (int) (1), 0).getMetadata() == stack.getMetadata())
			return true;
		if (new ItemStack(Blocks.RED_FLOWER, (int) (1), 3).getItem() == stack.getItem()
				&& new ItemStack(Blocks.RED_FLOWER, (int) (1), 3).getMetadata() == stack.getMetadata())
			return true;
		if (new ItemStack(Blocks.RED_FLOWER, (int) (1), 8).getItem() == stack.getItem()
				&& new ItemStack(Blocks.RED_FLOWER, (int) (1), 8).getMetadata() == stack.getMetadata())
			return true;
		if (new ItemStack(Blocks.RED_FLOWER, (int) (1), 2).getItem() == stack.getItem()
				&& new ItemStack(Blocks.RED_FLOWER, (int) (1), 2).getMetadata() == stack.getMetadata())
			return true;
		if (new ItemStack(Blocks.RED_FLOWER, (int) (1), 1).getItem() == stack.getItem()
				&& new ItemStack(Blocks.RED_FLOWER, (int) (1), 1).getMetadata() == stack.getMetadata())
			return true;
		if (new ItemStack(Blocks.RED_FLOWER, (int) (1), 4).getItem() == stack.getItem()
				&& new ItemStack(Blocks.RED_FLOWER, (int) (1), 4).getMetadata() == stack.getMetadata())
			return true;
		if (new ItemStack(Blocks.RED_FLOWER, (int) (1), 5).getItem() == stack.getItem()
				&& new ItemStack(Blocks.RED_FLOWER, (int) (1), 5).getMetadata() == stack.getMetadata())
			return true;
		if (new ItemStack(Blocks.RED_FLOWER, (int) (1), 6).getItem() == stack.getItem()
				&& new ItemStack(Blocks.RED_FLOWER, (int) (1), 6).getMetadata() == stack.getMetadata())
			return true;
		if (new ItemStack(Blocks.RED_FLOWER, (int) (1), 7).getItem() == stack.getItem()
				&& new ItemStack(Blocks.RED_FLOWER, (int) (1), 7).getMetadata() == stack.getMetadata())
			return true;
		return false;
	}


	public boolean canMateWith(EntityAnimal otherAnimal)
    {
        if (otherAnimal == this)
        {
            return false;
        }
        else if (otherAnimal.getClass() != this.getClass())
        {
            return false;
        }
        else
        {
            return this.isInLove() && otherAnimal.isInLove();
        }
    }
	
	@Override
	protected ResourceLocation getLootTable() 
	{		
		if(this.isBurning())
		{
			return LootTableHandler.SMALLMEAT_COOKED;
		} else {
			return LootTableHandler.SMALLMEAT;
		}
	}
	
	@Override
	protected SoundEvent getAmbientSound()
	{
		if (!this.isSleeping()) {
            return SoundHandler.ENTITY_PIKA_AMBIENT;
        } else {
            return null;
        }
	}
	
	@Override
	protected SoundEvent getHurtSound(DamageSource damageSource) 
	{
		return SoundHandler.ENTITY_TERMITE_HURT;
	}
	
	protected SoundEvent getDeathSound() 
	{
		return SoundHandler.ENTITY_TERMITE_HURT;
	}
	

    private <E extends IAnimatable> PlayState predicate(AnimationEvent<E> event)
    {
    	if(event.isMoving())
    	{
    		event.getController().setAnimation(new AnimationBuilder().addAnimation("walk", true));
            return PlayState.CONTINUE;
    	} if(this.isInWater()) {
    		event.getController().setAnimation(new AnimationBuilder().addAnimation("walk", true));
    		return PlayState.CONTINUE;
    	} if (this.isSleeping() && !this.isDead) {
            event.getController().setAnimation(new AnimationBuilder().addAnimation("sleep", true));
            return PlayState.CONTINUE;
        } else {
    		event.getController().setAnimation(new AnimationBuilder().addAnimation("idle", true));
            return PlayState.CONTINUE;
    	}
    }

	@Override
    public void registerControllers(AnimationData data)
    {
        data.addAnimationController(new AnimationController<EntityAmericanPika>(this, "controller", 0, this::predicate));
    }

    @Override
    public AnimationFactory getFactory()
    {
        return this.factory;
    }
	
}