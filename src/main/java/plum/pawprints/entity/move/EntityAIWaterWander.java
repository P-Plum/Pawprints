package plum.pawprints.entity.move;

import net.minecraft.entity.ai.EntityAIBase;
import net.minecraft.entity.passive.EntityWaterMob;

public class EntityAIWaterWander extends EntityAIBase
{
    protected final EntityWaterMob entity;
    protected double x;
    protected double y;
    protected double z;
    protected final double speed;
    protected int executionChance;
    protected boolean mustUpdate;

    public EntityAIWaterWander(EntityWaterMob creatureIn, double speedIn)
    {
        this(creatureIn, speedIn, 120);
    }

    public EntityAIWaterWander(EntityWaterMob creatureIn, double speedIn, int chance)
    {
        this.entity = creatureIn;
        this.speed = speedIn;
        this.executionChance = chance;
        this.setMutexBits(1);
    }

    /**
     * Returns whether the EntityAIBase should begin execution.
     */
    public boolean shouldExecute()
    {
        if (!this.mustUpdate)
        {
            if (this.entity.getIdleTime() >= 100)
            {
                return false;
            }

            if (this.entity.getRNG().nextInt(this.executionChance) != 0)
            {
                return false;
            }
        }
		return true;
    }

    /**
     * Returns whether an in-progress EntityAIBase should continue executing
     */
    public boolean shouldContinueExecuting()
    {
        return !this.entity.getNavigator().noPath();
    }

    /**
     * Execute a one shot task or start executing a continuous task
     */
    public void startExecuting()
    {
        this.entity.getNavigator().tryMoveToXYZ(this.x, this.y, this.z, this.speed);
    }

    /**
     * Makes task to bypass chance
     */
    public void makeUpdate()
    {
        this.mustUpdate = true;
    }

    /**
     * Changes task random possibility for execution
     */
    public void setExecutionChance(int newchance)
    {
        this.executionChance = newchance;
    }
}