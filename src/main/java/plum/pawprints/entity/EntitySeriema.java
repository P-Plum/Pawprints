package plum.pawprints.entity;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIAttackMelee;
import net.minecraft.entity.ai.EntityAIFollowParent;
import net.minecraft.entity.ai.EntityAILeapAtTarget;
import net.minecraft.entity.ai.EntityAIMate;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAIOcelotAttack;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWanderAvoidWater;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.util.DamageSource;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraft.world.World;
import plum.pawprints.init.ItemInit;
import plum.pawprints.util.handlers.LootTableHandler;
import plum.pawprints.util.handlers.SoundHandler;
import software.bernie.geckolib3.core.IAnimatable;
import software.bernie.geckolib3.core.PlayState;
import software.bernie.geckolib3.core.builder.AnimationBuilder;
import software.bernie.geckolib3.core.controller.AnimationController;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;
import software.bernie.geckolib3.core.manager.AnimationData;
import software.bernie.geckolib3.core.manager.AnimationFactory;

public class EntitySeriema extends EntityAnimal implements IAnimatable
{
	public AnimationFactory factory = new AnimationFactory(this);
    protected static final DataParameter<Boolean> SLEEPING = EntityDataManager.createKey(EntityBilby.class, DataSerializers.BOOLEAN);
    
	public EntitySeriema(World worldIn)
	{
		super(worldIn);
		setSize(0.7F, 0.7F);
        this.ignoreFrustumCheck = true;
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
			this.tasks.addTask(1, new EntityAISwimming(this));
			this.tasks.addTask(1, new EntityAIMate(this, 1.0D));
	        this.tasks.addTask(2, new EntityAIFollowParent(this, 1.25D));
	        this.tasks.addTask(8, new EntityAIWatchClosest(this, EntityPlayer.class, 8.0F));
	        this.tasks.addTask(9, new EntityAIWanderAvoidWater(this, 1.5D));
	        this.tasks.addTask(1, new EntityAIAttackMelee(this, 1.0D, true));
			this.tasks.addTask(1, new EntityAILeapAtTarget(this, 0.2F));
	        this.tasks.addTask(1, new EntityAIOcelotAttack(this));
	        this.targetTasks.addTask(1, new EntityAINearestAttackableTarget<EntityTermite>(this, EntityTermite.class, true));
	        this.targetTasks.addTask(1, new EntityAINearestAttackableTarget<EntityJumpingSpider>(this, EntityJumpingSpider.class, true));
	        this.targetTasks.addTask(1, new EntityAINearestAttackableTarget<EntityVinegaroon>(this, EntityVinegaroon.class, true));
	        this.targetTasks.addTask(1, new EntityAINearestAttackableTarget<EntityHarvestman>(this, EntityHarvestman.class, true));
	        this.targetTasks.addTask(1, new EntityAINearestAttackableTarget<EntityAmericanPika>(this, EntityAmericanPika.class, true));
	        this.targetTasks.addTask(1, new EntityAINearestAttackableTarget<EntityIliPika>(this, EntityIliPika.class, true));
	}
	
	public boolean attackEntityAsMob(Entity entityIn)
    {
        return entityIn.attackEntityFrom(DamageSource.causeMobDamage(this), 1.0F);
    }
	
	@Override
	protected void applyEntityAttributes()
	{
		super.applyEntityAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(10.0D);
        this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.20000000298023224D);
		this.getAttributeMap().registerAttribute(SharedMonsterAttributes.ATTACK_DAMAGE);
		this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(1.0D);
	}
	
	@Override
	public float getEyeHeight()
	{
		return 0.25F;
	}
	
	@Override
	public EntityAgeable createChild(EntityAgeable ageable) {
		EntitySeriema child = new EntitySeriema(this.world);
		return child;
	}
	
	@Override
	protected ResourceLocation getLootTable() 
	{		
		if(this.isBurning())
		{
			return LootTableHandler.BIRD_COOKED;
		} else {
			return LootTableHandler.BIRD_GENERIC;
		}
	}
	
	@Override
	public boolean isBreedingItem(ItemStack stack) {
		if (stack == null)
			return false;
		if (new ItemStack(ItemInit.DEAD_TERMITE, (int) (1)).getItem() == stack.getItem())
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
    protected SoundEvent getAmbientSound() 
	{
		if (!this.isSleeping()) {
            return SoundHandler.ENTITY_SERIEMA_AMBIENT;
        } else {
            return null;
        }
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
	
	public boolean isFlying()
    {
        return !this.onGround;
    }
	
    private <E extends IAnimatable> PlayState predicate(AnimationEvent<E> event)
    {
    	if (this.isSleeping() && !this.isDead) {
            event.getController().setAnimation(new AnimationBuilder().addAnimation("sleep", true));
            return PlayState.CONTINUE;
        } if(event.isMoving() && this.onGround) {
			event.getController().setAnimation(new AnimationBuilder().addAnimation("walk", true));
			return PlayState.CONTINUE;
		} if(this.onGround) {
			event.getController().setAnimation(new AnimationBuilder().addAnimation("idle", true));
			return PlayState.CONTINUE;
		} if(this.isInWater()) {
			event.getController().setAnimation(new AnimationBuilder().addAnimation("fly", true));
			return PlayState.CONTINUE;
    	} else {
			event.getController().setAnimation(new AnimationBuilder().addAnimation("fly", true));
			return PlayState.CONTINUE;
		}
    }

    @Override
    public void registerControllers(AnimationData data)
    {
        data.addAnimationController(new AnimationController<EntitySeriema>(this, "controller", 0, this::predicate));
    }

    @Override
    public AnimationFactory getFactory()
    {
        return this.factory;
    }
    
    protected void collideWithEntity(Entity entityIn)
    {
        if (!(entityIn instanceof EntityPlayer))
        {
            super.collideWithEntity(entityIn);
        }
        //Grab and throw in the air
        if (this.getAttackTarget() == entityIn && this.getHealth() > ((EntityLivingBase) entityIn).getHealth() && this.posY < 100) {
            entityIn.motionY = 0.5D;
        }
    }
}