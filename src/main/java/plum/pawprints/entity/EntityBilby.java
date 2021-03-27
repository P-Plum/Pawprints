package plum.pawprints.entity;

import java.util.Set;

import com.google.common.collect.Sets;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIFollowParent;
import net.minecraft.entity.ai.EntityAILeapAtTarget;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIMate;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAIOcelotAttack;
import net.minecraft.entity.ai.EntityAIPanic;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAITempt;
import net.minecraft.entity.ai.EntityAIWanderAvoidWater;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
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

public class EntityBilby extends EntityAnimal implements IAnimatable
{	
	public AnimationFactory factory = new AnimationFactory(this);
	private static final Set<Item> TEMPTATION_ITEMS = Sets.newHashSet(ItemInit.DEAD_TERMITE);
	
	
	public boolean isDaytime() {
        long time = this.world.getWorldTime() % 24000L; // Time can go over values of 24000, so divide and take the
                                                        // remainder
        return !(time >= 13000L && time <= 23000L);
    }
	
	public EntityBilby(World worldIn)
	{
		super(worldIn);
		setSize(0.4F, 0.4F);
        this.ignoreFrustumCheck = true;
	}
	
	
	
	@Override
	protected void initEntityAI()
	{
		if(this.isDaytime() == false)
		{
			
			this.tasks.addTask(0, new EntityAISwimming(this));
	        this.tasks.addTask(2, new EntityAIPanic(this, 2.0D));
	        this.tasks.addTask(3, new EntityAIMate(this, 1.0D));
			this.tasks.addTask(1, new EntityAILeapAtTarget(this, 0.2F));
	        this.tasks.addTask(1, new EntityAIOcelotAttack(this));
	        this.tasks.addTask(4, new EntityAIFollowParent(this, 1.25D));
	        this.tasks.addTask(5, new EntityAITempt(this, 1.25D, false, TEMPTATION_ITEMS));
	        this.tasks.addTask(6, new EntityAIWanderAvoidWater(this, 1.0D));
	        this.tasks.addTask(7, new EntityAIWatchClosest(this, EntityPlayer.class, 6F));
	        this.tasks.addTask(8, new EntityAILookIdle(this));
	        this.targetTasks.addTask(1, new EntityAINearestAttackableTarget<EntityTermite>(this, EntityTermite.class, true));
			
		} if(this.isDaytime() == true) {
	        
	        this.tasks.addTask(0, new EntityAISwimming(this));
		
		}
	}
	
	@Override
	protected void applyEntityAttributes()
	{
		super.applyEntityAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(10.0D);
		this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.2D);
	}
	
	@Override
	public float getEyeHeight()
	{
		return 0.25F;
	}
	
	@Override
	public EntityAgeable createChild(EntityAgeable ageable) {
		EntityBilby child = new EntityBilby(this.world);
		return child;
	}
	
	@Override
	public boolean isBreedingItem(ItemStack stack) {
		if (stack == null)
			return false;
		if (new ItemStack(ItemInit.DEAD_TERMITE, (int) (1)).getItem() == stack.getItem())
			return true;
		return false;
	}
	
	public boolean attackEntityAsMob(Entity entityIn)
    {
        return entityIn.attackEntityFrom(DamageSource.causeMobDamage(this), 1.0F);
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
		return SoundHandler.ENTITY_BILBY_AMBIENT;
    }
	
	@Override
	protected SoundEvent getHurtSound(DamageSource damageSource) 
	{
	    return null;
	}
	
	@Override
	protected ResourceLocation getLootTable() 
	{		
		if(this.isBurning())
		{
			return LootTableHandler.BILBY_COOKED;
		} else {
			return LootTableHandler.BILBY_GENERIC;
		}
	}
	
	protected SoundEvent getDeathSound() 
	{
	    return null;
	}
	
    private <E extends IAnimatable> PlayState predicate(AnimationEvent<E> event)
    {
    	if(this.isDaytime() == true)
		{	
    		event.getController().setAnimation(new AnimationBuilder().addAnimation("sleep", true));
            return PlayState.CONTINUE;
			
		} if(this.isDaytime() == false) {
				
			if(event.isMoving())
				{
					event.getController().setAnimation(new AnimationBuilder().addAnimation("walk", true));
					return PlayState.CONTINUE;
				}
			if(this.isInWater())
				{
					event.getController().setAnimation(new AnimationBuilder().addAnimation("walk", true));
					return PlayState.CONTINUE;
				} else {
					event.getController().setAnimation(new AnimationBuilder().addAnimation("idle", true));
		            return PlayState.CONTINUE;
				}
			} else {
				event.getController().setAnimation(new AnimationBuilder().addAnimation("idle", true));
	            return PlayState.CONTINUE;
			}
		}

    @Override
    public void registerControllers(AnimationData data)
    {
        data.addAnimationController(new AnimationController(this, "controller", 0, this::predicate));
    }

    @Override
    public AnimationFactory getFactory()
    {
        return this.factory;
    }
	
/*	@Override
	public EntityAnimationManager getAnimationManager()
	{
		return manager;
	}
	
	private EntityAnimationManager manager = new EntityAnimationManager();
	private AnimationController controller = new EntityAnimationController(this, "moveController", 0, this::animationPredicate);
	private <E extends EntityBilby> boolean animationPredicate(AnimationTestEvent<E> event)
	{
		if(this.isDaytime() == true)
		{	
			controller.setAnimation(new AnimationBuilder().addAnimation("sleep", true));
			return true;
			
		} if(this.isDaytime() == false) {
				
			if(event.isWalking())
				{
					controller.setAnimation(new AnimationBuilder().addAnimation("walk").addAnimation("walk", true));
					return true;
				}
			if(this.isInWater())
				{
					controller.setAnimation(new AnimationBuilder().addAnimation("walk").addAnimation("walk", true));
					return true;
				} else {
					controller.setAnimation(new AnimationBuilder().addAnimation("idle", true));
					return true;
				}
			} else {
				controller.setAnimation(new AnimationBuilder().addAnimation("idle", true));
				return true;
			}
		}
	
	private void registerAnimationControllers()
	{
		manager.addAnimationController(controller);
	}*/
}
