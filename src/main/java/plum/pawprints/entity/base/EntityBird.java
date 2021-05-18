package plum.pawprints.entity.base;

import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWanderAvoidWater;
import net.minecraft.entity.ai.EntityAIWanderAvoidWaterFlying;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.ai.EntityMoveHelper;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.entity.passive.EntityFlying;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.pathfinding.PathNavigate;
import net.minecraft.pathfinding.PathNavigateFlying;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import plum.pawprints.entity.move.EntityAIBirdFly;

public abstract class EntityBird extends EntityAnimal implements EntityFlying {

    public float timer;
    public int timeUntilNextFeather;

    protected EntityAIWanderAvoidWaterFlying WanderFlying;
    protected EntityAIWanderAvoidWater Wander;

	public EntityBird(World worldIn) {
        super(worldIn);
        this.timeUntilNextFeather = this.rand.nextInt(10000) + 10000;
        this.tasks.addTask(1, new EntityAISwimming(this));
        this.tasks.addTask(8, new EntityAIWatchClosest(this, EntityPlayer.class, 8.0F));
        if(!(this.isAquatic())){
            this.tasks.addTask(2, new EntityAIWanderAvoidWater(this, 1.0D));
        }
        else{
            this.tasks.addTask(2, new EntityAIWander(this, 1.0D));
        }
    }

	@Override
	public float getEyeHeight() {
		return this.height-this.height*0.1f;
	}

    @Override
    protected void initEntityAI() {
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

    //Entity stuff
    protected void applyEntityAttributes()
    {
        super.applyEntityAttributes();
        getAttributeMap().registerAttribute(SharedMonsterAttributes.FLYING_SPEED);
        getEntityAttribute(SharedMonsterAttributes.FLYING_SPEED).setBaseValue(0.25D);
        getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.19D);
    }

    //Flying code
    protected PathNavigate createNavigator(World worldIn)
    {
        if (isChild()) {
            return super.createNavigator(worldIn);
        }
        PathNavigateFlying pathnavigateflying = new PathNavigateFlying(this, worldIn);
        pathnavigateflying.setCanOpenDoors(false);
        pathnavigateflying.setCanFloat(true);
        pathnavigateflying.setCanEnterDoors(true);
        return pathnavigateflying;
    }

    public void fall(float distance, float damageMultiplier) {}

    protected void updateFallState(double y, boolean onGroundIn, IBlockState state, BlockPos pos) {}

    public boolean canBePushed()
    {
        return true;
    }

    protected void collideWithEntity(Entity entityIn)
    {
        if (!(entityIn instanceof EntityPlayer)) {
            super.collideWithEntity(entityIn);
        }
    }

    @Override
    protected void despawnEntity() {
        super.despawnEntity();
    }

    public abstract boolean isAquatic();

    @Override
    protected boolean canDespawn() {
        return false;
    }

    @Override
    @SideOnly(Side.CLIENT)
    public boolean isInRangeToRenderDist(double distance)
    {
        double d0 = this.getEntityBoundingBox().getAverageEdgeLength();

        if (Double.isNaN(d0))
        {
            d0 = 1.0D;
        }

        d0 = d0 * 64.0D * 4.0D;
        return distance < d0 * d0;
    }

    @Override
    public boolean processInteract(EntityPlayer player, EnumHand hand) {
    	return super.processInteract(player, hand);
    }
}