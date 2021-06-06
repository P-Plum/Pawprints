package plum.pawprints.entity.move;

import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityMoveHelper;
import net.minecraft.util.math.MathHelper;
import plum.pawprints.entity.base.EntityBird;

public class EntityAIBirdFly extends EntityMoveHelper
{
    public EntityAIBirdFly(EntityLiving p_i47418_1_)
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

                    float angle = (float) (MathHelper.atan2(d1, d0) * (180D / Math.PI)) - 360.0F;
                    this.entity.rotationYaw = this.limitAngle(this.entity.rotationYaw, angle, 90.0F);
                    this.entity.setAIMoveSpeed((float) (this.speed * this.entity.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).getAttributeValue()));
                    
                } else {
                    this.action = EntityMoveHelper.Action.WAIT;
                    this.entity.setNoGravity(true);
                    
                    double d0 = this.posX - this.entity.posX;
                    double d1 = this.posY - this.entity.posY;
                    double d2 = this.posZ - this.entity.posZ;
                    
                    float f = (float) (MathHelper.atan2(d2, d0) * 30D) - 90.0F;
                    this.entity.rotationYaw = limitAngle(this.entity.rotationYaw, f, 10.0F);
                    
                    float f1;
                    if (this.entity.onGround) {
                        f1 = (float) (this.speed * this.entity.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).getAttributeValue());
                    } else {
                        f1 = (float) (20 * this.entity.getEntityAttribute(SharedMonsterAttributes.FLYING_SPEED).getAttributeValue());
                    }
                    
                    this.entity.setAIMoveSpeed(f1);
                    
                    double d4 = MathHelper.sqrt(d0 * d0 + d2 * d2);
                    float f2 = (float) -(MathHelper.atan2(d1, d4) * 30D);
                    
                    this.entity.rotationPitch = limitAngle(this.entity.rotationPitch, f2, 2.0F);
                    this.entity.setMoveVertical((float) 0.4);
                    
                    if (d1 > (double) this.entity.stepHeight && d0 * d0 + d1 * d1 < (double) Math.max(1.0F, this.entity.width)) {
                        this.entity.getJumpHelper().setJumping();
                        this.action = EntityMoveHelper.Action.JUMPING;
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