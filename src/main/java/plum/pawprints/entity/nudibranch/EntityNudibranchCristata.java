package plum.pawprints.entity.nudibranch;

import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.passive.EntityWaterMob;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.pathfinding.PathNavigate;
import net.minecraft.pathfinding.PathNavigateClimber;
import net.minecraft.util.DamageSource;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.datafix.DataFixer;
import net.minecraft.world.World;
import plum.pawprints.entity.move.EntityAIWaterWander;
import software.bernie.geckolib3.core.IAnimatable;
import software.bernie.geckolib3.core.PlayState;
import software.bernie.geckolib3.core.builder.AnimationBuilder;
import software.bernie.geckolib3.core.controller.AnimationController;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;
import software.bernie.geckolib3.core.manager.AnimationData;
import software.bernie.geckolib3.core.manager.AnimationFactory;

public class EntityNudibranchCristata extends EntityWaterMob implements IAnimatable
{	
	public AnimationFactory factory = new AnimationFactory(this);
	private static final DataParameter<Byte> CLIMBING = EntityDataManager.<Byte>createKey(EntityNudibranchCristata.class, DataSerializers.BYTE);
	public EntityNudibranchCristata(World worldIn)
	{
		super(worldIn);
		setSize(0.2F, 0.2F);
        this.ignoreFrustumCheck = true;
	}
	
	public static void registerFixes(DataFixer fixer)
    {
        EntityLiving.registerFixesMob(fixer, EntityNudibranchCristata.class);
    }
	
	protected PathNavigate createNavigator(World worldIn)
    {
        return new PathNavigateClimber(this, worldIn);
    }
	
	protected void entityInit()
    {
        super.entityInit();
        this.dataManager.register(CLIMBING, Byte.valueOf((byte)0));
    }

    public void onUpdate()
    {
        super.onUpdate();

        if (!this.world.isRemote)
        {
            this.setBesideClimbableBlock(this.collidedHorizontally);
        }
    }
    
    public boolean isOnLadder()
    {
        return this.isBesideClimbableBlock();
    }
    
    public boolean isBesideClimbableBlock()
    {
        return (((Byte)this.dataManager.get(CLIMBING)).byteValue() & 1) != 0;
    }

    public void setBesideClimbableBlock(boolean climbing)
    {
        byte b0 = ((Byte)this.dataManager.get(CLIMBING)).byteValue();

        if (climbing)
        {
            b0 = (byte)(b0 | 1);
        }
        else
        {
            b0 = (byte)(b0 & -2);
        }

        this.dataManager.set(CLIMBING, Byte.valueOf(b0));
    }
	
	@Override
	protected void initEntityAI()
	{
        this.tasks.addTask(0, new EntityAILookIdle(this));
        this.tasks.addTask(1, new EntityAIWaterWander(this, 2.0D, 70));
	}
	
	@Override
	protected void applyEntityAttributes()
	{
		super.applyEntityAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(2.0D);
		this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.1D);
	}
	
	public boolean canBreatheUnderwater()
    {
        return true;
    }
	
	protected boolean canDespawn()
    {
        return true;
    }
	
	public void onEntityUpdate()
    {
        int i = this.getAir();
        super.onEntityUpdate();

        if (this.isEntityAlive() && !this.isInWater())
        {
            --i;
            this.setAir(i);

            if (this.getAir() == -20)
            {
                this.setAir(0);
                this.attackEntityFrom(DamageSource.DROWN, 2.0F);
            }
        }
        else
        {
            this.setAir(300);
        }
    }

	public boolean isPushedByWater()
    {
        return true;
    }
	
	@Override
	public float getEyeHeight()
	{
		return 0.1F;
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
        data.addAnimationController(new AnimationController<EntityNudibranchCristata>(this, "controller", 0, this::predicate));
    }

    @Override
    public AnimationFactory getFactory()
    {
        return this.factory;
    }
}
