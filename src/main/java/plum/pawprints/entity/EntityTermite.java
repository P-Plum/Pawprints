package plum.pawprints.entity;

import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIPanic;
import net.minecraft.entity.ai.EntityAIWanderAvoidWater;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumHand;
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

public class EntityTermite extends EntityAnimal implements IAnimatable
{	
	public AnimationFactory factory = new AnimationFactory(this);
	public EntityTermite(World worldIn)
	{
		super(worldIn);
        this.ignoreFrustumCheck = true;
		setSize(0.4F, 0.4F);
	}
	
	@Override
	protected void initEntityAI()
	{
        this.tasks.addTask(1, new EntityAIPanic(this, 1.0D));
        this.tasks.addTask(2, new EntityAIWanderAvoidWater(this, 0.8D));
        this.tasks.addTask(4, new EntityAILookIdle(this));
	}
	
	@Override
	protected void applyEntityAttributes()
	{
		super.applyEntityAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(1.0D);
		this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.2D);
	}
	
	@Override
	public float getEyeHeight()
	{
		return 0.1F;
	}
	
	@Override
	public EntityAnimal createChild(EntityAgeable ageable)
    {
		return null;
    }
	
	@Override
	protected ResourceLocation getLootTable() 
	{		
		return LootTableHandler.TERMITE;
	}
	
	public boolean isBreedingItem(ItemStack stack)
    {
        return false;
    }
	
	public boolean canMateWith(EntityAnimal otherAnimal)
    {
        return false;
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