package plum.pawprints.entity.move;

import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityMoveHelper;
import net.minecraft.util.math.MathHelper;
import plum.pawprints.entity.base.EntityBird;

public class EntityFlyHelper extends EntityMoveHelper
{
    public EntityFlyHelper(EntityLiving p_i47418_1_)
    {
        super(p_i47418_1_);
    }

    public void onUpdateMoveHelper()
    {
        if(this.entity instanceof EntityBird){
            if (this.action == EntityMoveHelper.Action.MOVE_TO) {
                if (this.entity.isChild()) {
                    this.action = EntityMoveHelper.Action.WAIT;
                    double d0 = this.posX - this.entity.posX;
                    double d1 = this.posZ - this.entity.posZ;
                    double d2 = this.posY - this.entity.posY;
                    double d3 = d0 * d0 + d2 * d2 + d1 * d1;

                    if (d3 < 2.500000277905201E-7D) {
                        this.entity.setMoveForward(0.0F);
                        return;
                    }

                    float f9 = (float) (MathHelper.atan2(d1, d0) * (180D / Math.PI)) - 90.0F;
                    this.entity.rotationYaw = this.limitAngle(this.entity.rotationYaw, f9, 90.0F);
                    this.entity.setAIMoveSpeed((float) (this.speed * this.entity.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).getAttributeValue()));

                    if (d2 > (double) this.entity.stepHeight && d0 * d0 + d1 * d1 < (double) Math.max(3.0F, this.entity.width)) {
                        this.entity.getJumpHelper().setJumping();
                        this.action = EntityMoveHelper.Action.JUMPING;
                    }
                } else {
                    this.action = EntityMoveHelper.Action.WAIT;
                    this.entity.setNoGravity(true);
                    double d0 = this.posX - this.entity.posX;
                    double d1 = this.posY - this.entity.posY;
                    double d2 = this.posZ - this.entity.posZ;
                    double d3 = d0 * d0 + d1 * d1 + d2 * d2;
                    if (d3 < 2.500000277905201E-7D) {
                        this.entity.setMoveVertical(0.0F);
                        this.entity.setMoveForward(0.0F);
                        return;
                    }
                    float f = (float) (MathHelper.atan2(d2, d0) * 57.29577951308232D) - 90.0F;
                    this.entity.rotationYaw = limitAngle(this.entity.rotationYaw, f, 10.0F);
                    float f1;
                    if (this.entity.onGround) {
                        f1 = (float) (this.speed * this.entity.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).getAttributeValue());
                    } else {
                        f1 = (float) (this.speed * this.entity.getEntityAttribute(SharedMonsterAttributes.FLYING_SPEED).getAttributeValue());
                    }
                    this.entity.setAIMoveSpeed(f1);
                    double d4 = MathHelper.sqrt(d0 * d0 + d2 * d2);
                    float f2 = (float) -(MathHelper.atan2(d1, d4) * 57.29577951308232D);
                    this.entity.rotationPitch = limitAngle(this.entity.rotationPitch, f2, 2.0F);
                    this.entity.setMoveVertical(d1 > 0.0D ? f1 : -f1);
                    if (d1 > 0.0D) {
                        this.entity.motionX = (MathHelper.sin(-this.entity.rotationYaw * 0.017453292F) * 0.2F);
                        this.entity.motionZ = (MathHelper.cos(this.entity.rotationYaw * 0.017453292F) * 0.2F);
                    }
                }
            } else {
                this.entity.setNoGravity(false);
                this.entity.setMoveVertical(0.0F);
                this.entity.setMoveForward(0.0F);
            }
        }
    }
}