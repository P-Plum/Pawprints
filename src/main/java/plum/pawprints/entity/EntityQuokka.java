package plum.pawprints.entity;

import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIFollowParent;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIMate;
import net.minecraft.entity.ai.EntityAIPanic;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWander;
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
import software.bernie.geckolib3.core.IAnimatable;
import software.bernie.geckolib3.core.PlayState;
import software.bernie.geckolib3.core.builder.AnimationBuilder;
import software.bernie.geckolib3.core.controller.AnimationController;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;
import software.bernie.geckolib3.core.manager.AnimationData;
import software.bernie.geckolib3.core.manager.AnimationFactory;

public class EntityQuokka extends EntityAnimal implements IAnimatable
{
	public AnimationFactory factory = new AnimationFactory(this);
    protected static final DataParameter<Boolean> SLEEPING = EntityDataManager.createKey(EntityBilby.class, DataSerializers.BOOLEAN);
	
	public EntityQuokka(World worldIn)
	{
		super(worldIn);
        this.ignoreFrustumCheck = true;
        setSize(0.4F, 0.4F);
	}
	
	public void onLivingUpdate()
    {
        if (this.onGround) {
            setSleeping(world.getWorldTime() >= 1000 && world.getWorldTime() <= 12000);
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
        	this.tasks.addTask(1, new EntityAIPanic(this, 3.5D));
        	this.tasks.addTask(2, new EntityAILookIdle(this));
        	this.tasks.addTask(3, new EntityAIWander(this, 2.5D));
        	this.tasks.addTask(4, new EntityAIWatchClosest(this, EntityPlayer.class, 6F));
        	this.tasks.addTask(3, new EntityAIMate(this, 1.0D));
        	this.tasks.addTask(4, new EntityAIFollowParent(this, 1.5D));
	}
	
	@Override
	protected void applyEntityAttributes()
	{
		super.applyEntityAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(10.0D);
		this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.1D);
	}
	
	@Override
	public float getEyeHeight()
	{
		return 0.25F;
	}
	
	@Override
	public EntityAgeable createChild(EntityAgeable ageable) {
		EntityQuokka child = new EntityQuokka(this.world);
		return child;
	}
	
	@Override
	public boolean isBreedingItem(ItemStack stack) {
		if (stack == null)
			return false;
		if (new ItemStack(Blocks.LEAVES, (int) (1)).getItem() == stack.getItem())
			return true;
		if (new ItemStack(Blocks.LEAVES, (int) (1), 0).getItem() == stack.getItem()
				&& new ItemStack(Blocks.LEAVES, (int) (1), 0).getMetadata() == stack.getMetadata())
			return true;
		if (new ItemStack(Blocks.LEAVES, (int) (1), 1).getItem() == stack.getItem()
				&& new ItemStack(Blocks.LEAVES, (int) (1), 1).getMetadata() == stack.getMetadata())
			return true;
		if (new ItemStack(Blocks.LEAVES, (int) (1), 2).getItem() == stack.getItem()
				&& new ItemStack(Blocks.LEAVES, (int) (1), 2).getMetadata() == stack.getMetadata())
			return true;
		if (new ItemStack(Blocks.LEAVES, (int) (1), 3).getItem() == stack.getItem()
				&& new ItemStack(Blocks.LEAVES, (int) (1), 3).getMetadata() == stack.getMetadata())
			return true;
		if (new ItemStack(Blocks.LEAVES2, (int) (1)).getItem() == stack.getItem())
			return true;
		if (new ItemStack(Blocks.LEAVES2, (int) (1), 0).getItem() == stack.getItem()
				&& new ItemStack(Blocks.LEAVES2, (int) (1), 0).getMetadata() == stack.getMetadata())
			return true;
		if (new ItemStack(Blocks.LEAVES2, (int) (1), 1).getItem() == stack.getItem()
				&& new ItemStack(Blocks.LEAVES2, (int) (1), 1).getMetadata() == stack.getMetadata())
			return true;
		if (new ItemStack(Blocks.LEAVES2, (int) (1), 1).getItem() == stack.getItem()
				&& new ItemStack(Blocks.LEAVES2, (int) (1), 1).getMetadata() == stack.getMetadata())
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
			return LootTableHandler.FUR_LARGEMEAT_COOKED;
		} else {
			return LootTableHandler.FUR_LARGEMEAT;
		}
	}
	
	@Override
	protected SoundEvent getAmbientSound()
	{
		return null;
	}
	
	@Override
	protected SoundEvent getHurtSound(DamageSource damageSource) 
	{
	    return null;
	}
	
	protected SoundEvent getDeathSound() 
	{
	    return null;
	}
	

	private <E extends IAnimatable> PlayState predicate(AnimationEvent<E> event)
    {
		if(this.isInLove()) {
    		event.getController().setAnimation(new AnimationBuilder().addAnimation("eat", true));
            return PlayState.CONTINUE;
		} if(event.isMoving()) {
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
        data.addAnimationController(new AnimationController<EntityQuokka>(this, "controller", 0, this::predicate));
    }

    @Override
    public AnimationFactory getFactory()
    {
        return this.factory;
    }
	
}