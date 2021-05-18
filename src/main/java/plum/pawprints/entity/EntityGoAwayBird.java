package plum.pawprints.entity;

import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIFollowParent;
import net.minecraft.entity.ai.EntityAIMate;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWanderAvoidWater;
import net.minecraft.entity.ai.EntityAIWanderAvoidWaterFlying;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.ai.EntityMoveHelper;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraft.world.World;
import plum.pawprints.entity.base.EntityBird;
import plum.pawprints.entity.move.EntityAIBirdFly;
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

public class EntityGoAwayBird extends EntityBird implements IAnimatable
{
	public AnimationFactory factory = new AnimationFactory(this);
	
	protected EntityAIWanderAvoidWaterFlying WanderFlying;
    protected EntityAIWanderAvoidWater Wander;
    
	public EntityGoAwayBird(World worldIn)
	{
		super(worldIn);
		setSize(0.4F, 0.4F);
        this.ignoreFrustumCheck = true;
	}
	
	@Override
	protected void initEntityAI()
	{
			this.tasks.addTask(1, new EntityAISwimming(this));
			this.tasks.addTask(1, new EntityAIMate(this, 1.0D));
	        this.tasks.addTask(2, new EntityAIFollowParent(this, 1.25D));
	        this.tasks.addTask(8, new EntityAIWatchClosest(this, EntityPlayer.class, 8.0F));
	        this.tasks.addTask(9, new EntityAIWander(this, 1.0D));
	        
	        this.Wander = new EntityAIWanderAvoidWater(this, 1.0D);
		    this.WanderFlying = new EntityAIWanderAvoidWaterFlying(this, 1.0D);

	        super.initEntityAI();
	        if(this.isChild()){
	            this.moveHelper = new EntityMoveHelper(this);
	            this.tasks.addTask(3, Wander);
	        }
	        else{
	            this.moveHelper = new EntityAIBirdFly(this);
	            this.tasks.removeTask(Wander);
	            this.tasks.addTask(3, WanderFlying);
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
		EntityGoAwayBird child = new EntityGoAwayBird(this.world);
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
		if (new ItemStack(ItemInit.ACACIA_BUDS, (int) (1)).getItem() == stack.getItem())
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
		return SoundHandler.ENTITY_GOAWAYBIRD_AMBIENT;
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
	
	@Override
    public boolean isAquatic() {
        return false;
    }
	
    private <E extends IAnimatable> PlayState predicate(AnimationEvent<E> event)
    {
    	if(this.onGround)
		{
			event.getController().setAnimation(new AnimationBuilder().addAnimation("idle", true));
			return PlayState.CONTINUE;
		}
		if(this.isInWater())
		{
			event.getController().setAnimation(new AnimationBuilder().addAnimation("walk", true));
			return PlayState.CONTINUE;
		} else {
			event.getController().setAnimation(new AnimationBuilder().addAnimation("fly", true));
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