package plum.pawprints.entity;

import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIFollowParent;
import net.minecraft.entity.ai.EntityAIMate;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWanderAvoidWaterFlying;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.ai.EntityFlyHelper;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.entity.passive.EntityFlying;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.ItemStack;
import net.minecraft.pathfinding.PathNavigate;
import net.minecraft.pathfinding.PathNavigateFlying;
import net.minecraft.util.DamageSource;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;
import plum.pawprints.entity.base.EntityBird;
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

public class EntityGoAwayBird extends EntityBird implements IAnimatable, EntityFlying
{
	public AnimationFactory factory = new AnimationFactory(this);
	public float flap;
    public float flapSpeed;
    public float oFlapSpeed;
    public float oFlap;
    public float flapping = 1.0F;
    
	public EntityGoAwayBird(World worldIn)
	{
		super(worldIn);
		setSize(0.4F, 0.4F);
		this.moveHelper = new EntityFlyHelper(this);
        this.ignoreFrustumCheck = true;
	}
	
	@Override
	protected void initEntityAI()
	{
			this.tasks.addTask(1, new EntityAISwimming(this));
			this.tasks.addTask(1, new EntityAIMate(this, 1.0D));
	        this.tasks.addTask(2, new EntityAIFollowParent(this, 1.25D));
	        this.tasks.addTask(8, new EntityAIWatchClosest(this, EntityPlayer.class, 8.0F));
	        this.tasks.addTask(9, new EntityAIWanderAvoidWaterFlying(this, 1.0D));
	}
	
	@Override
	protected void applyEntityAttributes()
	{
		super.applyEntityAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(10.0D);
        this.getEntityAttribute(SharedMonsterAttributes.FLYING_SPEED).setBaseValue(0.4000000059604645D);
        this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.20000000298023224D);
	}
	
	protected PathNavigate createNavigator(World worldIn)
    {
        PathNavigateFlying pathnavigateflying = new PathNavigateFlying(this, worldIn);
        pathnavigateflying.setCanOpenDoors(false);
        pathnavigateflying.setCanFloat(true);
        pathnavigateflying.setCanEnterDoors(true);
        return pathnavigateflying;
    }
	
	private void calculateFlapping()
    {
        this.oFlap = this.flap;
        this.oFlapSpeed = this.flapSpeed;
        this.flapSpeed = (float)((double)this.flapSpeed + (double)(this.onGround ? -1 : 4) * 0.3D);
        this.flapSpeed = MathHelper.clamp(this.flapSpeed, 0.0F, 1.0F);

        if (!this.onGround && this.flapping < 1.0F)
        {
            this.flapping = 1.0F;
        }

        this.flapping = (float)((double)this.flapping * 0.9D);

        if (!this.onGround && this.motionY < 0.0D)
        {
            this.motionY *= 0.6D;
        }

        this.flap += this.flapping * 2.0F;
    }
	
	public void onLivingUpdate()
    {
        super.onLivingUpdate();
        this.calculateFlapping();
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
	
	protected float playFlySound(float p_191954_1_)
    {
        this.playSound(SoundEvents.ENTITY_PARROT_FLY, 0.15F, 1.0F);
        return p_191954_1_ + this.flapSpeed / 2.0F;
    }
	
	public boolean isFlying()
    {
        return !this.onGround;
    }
	
    private <E extends IAnimatable> PlayState predicate(AnimationEvent<E> event)
    {
    	if(event.isMoving() && this.onGround)
		{
			event.getController().setAnimation(new AnimationBuilder().addAnimation("walk", true));
			return PlayState.CONTINUE;
		}
    	if(this.onGround)
		{
			event.getController().setAnimation(new AnimationBuilder().addAnimation("idle", true));
			return PlayState.CONTINUE;
		}
		if(this.isInWater())
		{
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
        data.addAnimationController(new AnimationController(this, "controller", 0, this::predicate));
    }

    @Override
    public AnimationFactory getFactory()
    {
        return this.factory;
    }

	@Override
	public boolean isAquatic() {
		return false;
	}
}