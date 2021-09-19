package plum.pawprints.entity;

import javax.annotation.Nullable;

import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.IEntityLivingData;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIWanderAvoidWater;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.util.DamageSource;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.world.World;
import plum.pawprints.util.handlers.LootTableHandler;
import software.bernie.geckolib3.core.IAnimatable;
import software.bernie.geckolib3.core.PlayState;
import software.bernie.geckolib3.core.builder.AnimationBuilder;
import software.bernie.geckolib3.core.controller.AnimationController;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;
import software.bernie.geckolib3.core.manager.AnimationData;
import software.bernie.geckolib3.core.manager.AnimationFactory;

public class EntityHermitCrab extends EntityAnimal implements IAnimatable
{	
	public AnimationFactory factory = new AnimationFactory(this);
	private static final DataParameter<Integer> CRAB_VARIANT = EntityDataManager.<Integer>createKey(EntityHermitCrab.class, DataSerializers.VARINT);
	public EntityHermitCrab(World worldIn)
	{
		super(worldIn);
        this.ignoreFrustumCheck = true;
		setSize(0.4F, 0.4F);
	}
	
	@Override
	protected void initEntityAI()
	{
        this.tasks.addTask(2, new EntityAIWanderAvoidWater(this, 0.35D));
        this.tasks.addTask(4, new EntityAILookIdle(this));
	}
	
	//Beyond this point -- Related to variant code
	
		public void writeEntityToNBT(NBTTagCompound compound)
	    {
	        super.writeEntityToNBT(compound);
	        compound.setInteger("CrabType", this.getSkin());
	    }
		
		public void readEntityFromNBT(NBTTagCompound compound)
	    {
	        super.readEntityFromNBT(compound);
	        this.setSkin(compound.getInteger("CrabType"));
	    }
		
		public int getSkin()
	    {
	        return ((Integer)this.dataManager.get(CRAB_VARIANT)).intValue();
	    }

	    public void setSkin(int skinId)
	    {
	        this.dataManager.set(CRAB_VARIANT, Integer.valueOf(skinId));
	    }
		//Beyond this point -- Unrelated to variant code
	
	@Override
	protected void applyEntityAttributes()
	{
		super.applyEntityAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(5.0D);
		this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.4D);
	}
	
	@Override
	public float getEyeHeight()
	{
		return 0.25F;
	}
	
	@Override
	protected ResourceLocation getLootTable() 
	{		
		if(this.isBurning())
		{
			return LootTableHandler.CRAB_COOKED;
		} else {
			return LootTableHandler.CRAB_GENERIC;
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
	
	//Related to variant code
	
		public int getVariant()
	    {
	        return MathHelper.clamp(((Integer)this.dataManager.get(CRAB_VARIANT)).intValue(), 0, 2);
	    }
		
		public void setVariant(int p_191997_1_)
	    {
	        this.dataManager.set(CRAB_VARIANT, Integer.valueOf(p_191997_1_));
	    }

		protected void entityInit()
	    {
	        super.entityInit();
	        this.dataManager.register(CRAB_VARIANT, Integer.valueOf(0));
	    }
		
		@Nullable
	    public IEntityLivingData onInitialSpawn(DifficultyInstance difficulty, @Nullable IEntityLivingData livingdata)
	    {
	        this.setVariant(this.rand.nextInt(6));
	        return super.onInitialSpawn(difficulty, livingdata);
	    }
		//Beyond this point -- Unrelated to variant code
	
	private <E extends IAnimatable> PlayState predicate(AnimationEvent<E> event)
    {
    	if(event.isMoving())
    	{
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
        data.addAnimationController(new AnimationController<EntityHermitCrab>(this, "controller", 0, this::predicate));
    }

    @Override
    public AnimationFactory getFactory()
    {
        return this.factory;
    }

	@Override
	public EntityAgeable createChild(EntityAgeable ageable) {
		return null;
	}
}