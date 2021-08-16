package plum.pawprints.entity;

import java.util.Set;

import com.google.common.collect.Sets;

import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIFollowParent;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIMate;
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
import software.bernie.geckolib3.core.IAnimatable;
import software.bernie.geckolib3.core.PlayState;
import software.bernie.geckolib3.core.builder.AnimationBuilder;
import software.bernie.geckolib3.core.controller.AnimationController;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;
import software.bernie.geckolib3.core.manager.AnimationData;
import software.bernie.geckolib3.core.manager.AnimationFactory;

public class EntityPinkfairy extends EntityAnimal implements IAnimatable
{
	private static final Set<Item> TEMPTATION_ITEMS = Sets.newHashSet(ItemInit.DEAD_TERMITE);
	public AnimationFactory factory = new AnimationFactory(this);
	
	/*
	public boolean isDaytime() {
        long time = this.world.getWorldTime() % 24000L; // Time can go over values of 24000, so divide and take the
                                                        // remainder
        return !(time >= 13000L && time <= 23000L);
    }
	*/
	
	public EntityPinkfairy(World worldIn)
	{
		super(worldIn);
        this.ignoreFrustumCheck = true;
		setSize(0.2F, 0.2F);
	}
	
	@Override
	protected void initEntityAI()
	{
			this.tasks.addTask(0, new EntityAISwimming(this));
			this.tasks.addTask(1, new EntityAIPanic(this, 2.0D));
			this.tasks.addTask(2, new EntityAIWanderAvoidWater(this, 1.0D));
			this.tasks.addTask(3, new EntityAIWatchClosest(this, EntityPlayer.class, 6F));
			this.tasks.addTask(4, new EntityAILookIdle(this));
        	this.tasks.addTask(5, new EntityAITempt(this, 1.25D, false, TEMPTATION_ITEMS));
			this.tasks.addTask(1, new EntityAIMate(this, 1.0D));
        	this.tasks.addTask(2, new EntityAIFollowParent(this, 1.25D));
	}
	
	@Override
	protected void applyEntityAttributes()
	{
		super.applyEntityAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(6.0D);
		this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.2D);
	}
	
	@Override
	public float getEyeHeight()
	{
		return 0.25F;
	}
	
	@Override
	public EntityAgeable createChild(EntityAgeable ageable) {
		EntityPinkfairy child = new EntityPinkfairy(this.world);
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
		return null;
	}
	
	@Override
	protected ResourceLocation getLootTable() 
	{		
		if(this.isBurning())
		{
			return LootTableHandler.PINKFAIRY_COOKED;
		} else {
			return LootTableHandler.PINKFAIRY_GENERIC;
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
	

	private <E extends IAnimatable> PlayState predicate(AnimationEvent<E> event)
    {
    	if(event.isMoving())
    	{
    		event.getController().setAnimation(new AnimationBuilder().addAnimation("walk", true));
            return PlayState.CONTINUE;
    	} if(this.isInWater()) {
    		event.getController().setAnimation(new AnimationBuilder().addAnimation("walk", true));
            return PlayState.CONTINUE;
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
	
}