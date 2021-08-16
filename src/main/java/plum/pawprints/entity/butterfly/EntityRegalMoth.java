package plum.pawprints.entity.butterfly;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIWanderAvoidWater;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;
import plum.pawprints.entity.base.EntityButterfly;
import plum.pawprints.init.ItemInit;
import plum.pawprints.util.handlers.LootTableHandler;

public class EntityRegalMoth extends EntityButterfly
{	
	
	private BlockPos spawnPosition;
	
	
	public EntityRegalMoth(World worldIn)
	{
		super(worldIn);
		setSize(0.4F, 0.4F);
	}
	
	protected void updateAITasks()
    {
		if(this.isChild())
		{
			this.tasks.addTask(1, new EntityAIWanderAvoidWater(this, 0.5D));
			
		} else {
        super.updateAITasks();
        if (this.spawnPosition != null && (!this.world.isAirBlock(this.spawnPosition) || this.spawnPosition.getY() < 1))
            {
                this.spawnPosition = null;
            }

            if (this.spawnPosition == null || this.rand.nextInt(30) == 0 || this.spawnPosition.distanceSq((double)((int)this.posX), (double)((int)this.posY), (double)((int)this.posZ)) < 4.0D)
            {
                this.spawnPosition = new BlockPos((int)this.posX + this.rand.nextInt(7) - this.rand.nextInt(7), (int)this.posY + this.rand.nextInt(6) - 2, (int)this.posZ + this.rand.nextInt(7) - this.rand.nextInt(7));
            }

            double d0 = (double)this.spawnPosition.getX() + 0.5D - this.posX;
            double d1 = (double)this.spawnPosition.getY() + 0.1D - this.posY;
            double d2 = (double)this.spawnPosition.getZ() + 0.5D - this.posZ;
            this.motionX += (Math.signum(d0) * 0.5D - this.motionX) * 0.10000000149011612D;
            this.motionY += (Math.signum(d1) * 0.699999988079071D - this.motionY) * 0.10000000149011612D;
            this.motionZ += (Math.signum(d2) * 0.5D - this.motionZ) * 0.10000000149011612D;
            float f = (float)(MathHelper.atan2(this.motionZ, this.motionX) * (180D / Math.PI)) - 90.0F;
            float f1 = MathHelper.wrapDegrees(f - this.rotationYaw);
            this.moveForward = 0.5F;
            this.rotationYaw += f1;
        }
    }
	
	public void onUpdate()
    {
        super.onUpdate();
        this.motionY *= 0.6000000238418579D;
    }
	
	@Override
	protected void applyEntityAttributes()
	{
		super.applyEntityAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(2.0D);
		this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.2D);
	}
	
	@Override
	public float getEyeHeight()
	{
		return 0.25F;
	}
	
	public void fall(float distance, float damageMultiplier)
    {
    }
	
	@Override
	public EntityAgeable createChild(EntityAgeable ageable) {
		EntityRegalMoth child = new EntityRegalMoth(this.world);
		return child;
	}
	
	@Override
	public boolean canBeLeashedTo(EntityPlayer player) {
		return false;
	}
	
	@Override
	public boolean isBreedingItem(ItemStack stack) {
		if (stack == null)
			return false;
		if (new ItemStack(ItemInit.NECTAR, (int) (1)).getItem() == stack.getItem())
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
		return null;
	}
	
	@Override
	protected ResourceLocation getLootTable() 
	{		
		return LootTableHandler.BUTTERFLY;
	}
	
	public boolean canBreatheUnderwater()
    {
        return true;
    }
	
	protected boolean canDespawn()
    {
        return true;
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
	
	public boolean canBePushed()
    {
        return false;
    }
	
	protected void collideWithEntity(Entity entityIn)
    {
		
    }

    protected void collideWithNearbyEntities()
    {
    	
    }
}
