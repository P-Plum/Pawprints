package plum.pawprints.entity.move;

import javax.annotation.Nullable;

import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.ai.EntityAIBase;
import net.minecraft.entity.passive.EntityWaterMob;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;

public class EntityAIWaterWander extends EntityAIBase {
    protected final EntityWaterMob entity;
    protected double x;
    protected double y;
    protected double z;
    protected final double speed;
    protected int executionChance;
    protected boolean mustUpdate;

    public EntityAIWaterWander(EntityWaterMob entityIn, double speedIn) {
        this(entityIn, speedIn, 120);
    }

    public EntityAIWaterWander(EntityWaterMob entityIn, double speedIn, int chance) {
        this.entity = entityIn;
        this.speed = speedIn;
        this.executionChance = chance;
        this.setMutexBits(1);
    }

    public boolean shouldExecute() {
        if(!this.mustUpdate) {
            if(this.entity.getIdleTime() >= 100) {
                return false;
            }

            if(this.entity.getRNG().nextInt(this.executionChance) != 0) {
                return false;
            }
        }

        Vec3d vec3d = this.getPosition();

        if(vec3d == null) {
            return false;
        } else {
            this.x = vec3d.x;
            this.y = vec3d.y;
            this.z = vec3d.z;
            this.mustUpdate = false;
            return true;
        }
    }

    @Nullable
    protected Vec3d getPosition() {
        int i = 0;
        while(i < 5) {
            Vec3d pos = this.entity.getPositionVector().addVector(Math.random() * 10, Math.random() * 2, Math.random() * 10);
            IBlockState state = this.entity.world.getBlockState(new BlockPos(pos));
            if(state.getBlock() == Blocks.WATER || state.getBlock() == Blocks.FLOWING_WATER) {
                return pos;
            }
            i++;
        }
        
        
        return this.entity.getPositionVector();
    }

    public boolean shouldContinueExecuting() {
        return !this.entity.getNavigator().noPath();
    }

    public void startExecuting() {
        this.entity.getNavigator().tryMoveToXYZ(this.x, this.y, this.z, this.speed);
    }

    public void makeUpdate() {
        this.mustUpdate = true;
    }

    public void setExecutionChance(int newchance) {
        this.executionChance = newchance;
    }
}