package plum.pawprints.entity;

import java.util.Set;

import javax.annotation.Nullable;

import com.google.common.collect.Sets;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.IEntityLivingData;
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

public class EntityFerretBadger extends EntityAnimal implements IAnimatable
{	
	public AnimationFactory factory = new AnimationFactory(this);
	private static final Set<Item> TEMPTATION_ITEMS = Sets.newHashSet(ItemInit.CATERPILLAR);
	private static final DataParameter<Integer> FERRETBADGER_VARIANT = EntityDataManager.<Integer>createKey(EntityFerretBadger.class, DataSerializers.VARINT);
    protected static final DataParameter<Boolean> SLEEPING = EntityDataManager.createKey(EntityBilby.class, DataSerializers.BOOLEAN);
	
	public EntityFerretBadger(World worldIn)
	{
		super(worldIn);
		setSize(0.4F, 0.4F);
		this.ignoreFrustumCheck = true;
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
        this.tasks.addTask(1, new EntityAIPanic(this, 2.0D));
        this.tasks.addTask(2, new EntityAIWanderAvoidWater(this, 1.0D));
        this.tasks.addTask(3, new EntityAIWatchClosest(this, EntityPlayer.class, 6F));
        this.tasks.addTask(4, new EntityAILookIdle(this));
        this.tasks.addTask(3, new EntityAIMate(this, 1.0D));
        this.tasks.addTask(4, new EntityAIFollowParent(this, 1.25D));
        this.tasks.addTask(5, new EntityAITempt(this, 1.25D, false, TEMPTATION_ITEMS));
	}
	
	//Beyond this point -- Related to variant code
	
	public void writeEntityToNBT(NBTTagCompound compound)
    {
        super.writeEntityToNBT(compound);
        compound.setInteger("BadgerType", this.getSkin());
        compound.setBoolean("Sleeping", this.isSleeping());
    }
	
	public void readEntityFromNBT(NBTTagCompound compound)
    {
        super.readEntityFromNBT(compound);
        this.setSkin(compound.getInteger("BadgerType"));
        this.setSleeping(compound.getBoolean("Sleeping"));
    }
	
	public int getSkin()
    {
        return ((Integer)this.dataManager.get(FERRETBADGER_VARIANT)).intValue();
    }

    public void setSkin(int skinId)
    {
        this.dataManager.set(FERRETBADGER_VARIANT, Integer.valueOf(skinId));
    }
	//Beyond this point -- Unrelated to variant code
    
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
		EntityFerretBadger child = new EntityFerretBadger(this.world);
		child.setVariant(this.getVariant());
	    return child;
	}
	
	@Override
	public boolean isBreedingItem(ItemStack stack) {
		if (stack == null)
			return false;
		if (new ItemStack(ItemInit.CATERPILLAR, (int) (1)).getItem() == stack.getItem())
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
	protected ResourceLocation getLootTable() 
	{		
		if(this.isBurning())
		{
			return LootTableHandler.FUR_SMALLMEAT_COOKED;
		} else {
			return LootTableHandler.FUR_SMALLMEAT;
		}
	}
	
	@Override
    protected SoundEvent getAmbientSound() 
	{
		if (!this.isSleeping()) {
			return SoundHandler.ENTITY_FERRETBADGER_AMBIENT;
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
	
	//Related to variant code
	
	public int getVariant()
    {
        return MathHelper.clamp(((Integer)this.dataManager.get(FERRETBADGER_VARIANT)).intValue(), 0, 2);
    }
	
	public void setVariant(int p_191997_1_)
    {
        this.dataManager.set(FERRETBADGER_VARIANT, Integer.valueOf(p_191997_1_));
    }

	protected void entityInit()
    {
        super.entityInit();
        this.dataManager.register(FERRETBADGER_VARIANT, Integer.valueOf(0));
        this.dataManager.register(SLEEPING, Boolean.valueOf(false));
    }
	
	@Nullable
    public IEntityLivingData onInitialSpawn(DifficultyInstance difficulty, @Nullable IEntityLivingData livingdata)
    {
        this.setVariant(this.rand.nextInt(5));
        return super.onInitialSpawn(difficulty, livingdata);
    }
	//Beyond this point -- Unrelated to variant code
	
	private <E extends IAnimatable> PlayState predicate(AnimationEvent<E> event)
    {
		if (this.isSleeping() && !this.isDead) {
            event.getController().setAnimation(new AnimationBuilder().addAnimation("sleep", true));
            return PlayState.CONTINUE;
        }
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
        data.addAnimationController(new AnimationController<EntityFerretBadger>(this, "controller", 0, this::predicate));
    }

    @Override
    public AnimationFactory getFactory()
    {
        return this.factory;
    }
}
