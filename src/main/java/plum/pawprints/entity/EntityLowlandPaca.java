package plum.pawprints.entity;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIFollowParent;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIMate;
import net.minecraft.entity.ai.EntityAIPanic;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraft.world.World;
import plum.pawprints.util.handlers.LootTableHandler;
import plum.pawprints.util.handlers.SoundHandler;
import software.bernie.geckolib3.core.IAnimatable;
import software.bernie.geckolib3.core.PlayState;
import software.bernie.geckolib3.core.builder.AnimationBuilder;
import software.bernie.geckolib3.core.controller.AnimationController;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;
import software.bernie.geckolib3.core.manager.AnimationData;
import software.bernie.geckolib3.core.manager.AnimationFactory;

public class EntityLowlandPaca extends EntityAnimal implements IAnimatable
{
	public AnimationFactory factory = new AnimationFactory(this);
	public EntityLowlandPaca(World worldIn)
	{
		super(worldIn);
		setSize(0.4F, 0.4F);
		this.ignoreFrustumCheck = true;
	}
	
	@Override
	protected void initEntityAI()
	{
		this.tasks.addTask(0, new EntityAISwimming(this));
        this.tasks.addTask(1, new EntityAIPanic(this, 1.2D));
        this.tasks.addTask(2, new EntityAIWander(this, 1.0D));
        this.tasks.addTask(3, new EntityAIWatchClosest(this, EntityPlayer.class, 6F));
        this.tasks.addTask(4, new EntityAILookIdle(this));
        this.tasks.addTask(3, new EntityAIMate(this, 1.0D));
        this.tasks.addTask(4, new EntityAIFollowParent(this, 1.25D));
	}
	
	@Override
	protected void applyEntityAttributes()
	{
		super.applyEntityAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(12.0D);
		this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.25D);
	}
	
	@Override
	public float getEyeHeight()
	{
		return 0.25F;
	}
	
	@Override
	public EntityAgeable createChild(EntityAgeable ageable) {
		EntityLowlandPaca child = new EntityLowlandPaca(this.world);
		return child;
	}
	
	@Override
	public boolean isBreedingItem(ItemStack stack) {
		if (stack == null)
			return false;
		if (new ItemStack(Blocks.LEAVES, (int) (1)).getItem() == stack.getItem())
			return true;
		if (new ItemStack(Blocks.LEAVES, (int) (1), 0).getItem() == stack.getItem()
				&& new ItemStack(Blocks.LEAVES, (int) (1), 0).getMetadata() == stack.getMetadata())
			return true;
		if (new ItemStack(Blocks.LEAVES, (int) (1), 1).getItem() == stack.getItem()
				&& new ItemStack(Blocks.LEAVES, (int) (1), 1).getMetadata() == stack.getMetadata())
			return true;
		if (new ItemStack(Blocks.LEAVES, (int) (1), 2).getItem() == stack.getItem()
				&& new ItemStack(Blocks.LEAVES, (int) (1), 2).getMetadata() == stack.getMetadata())
			return true;
		if (new ItemStack(Blocks.LEAVES, (int) (1), 3).getItem() == stack.getItem()
				&& new ItemStack(Blocks.LEAVES, (int) (1), 3).getMetadata() == stack.getMetadata())
			return true;
		if (new ItemStack(Blocks.LEAVES2, (int) (1)).getItem() == stack.getItem())
			return true;
		if (new ItemStack(Blocks.LEAVES2, (int) (1), 0).getItem() == stack.getItem()
				&& new ItemStack(Blocks.LEAVES2, (int) (1), 0).getMetadata() == stack.getMetadata())
			return true;
		if (new ItemStack(Blocks.LEAVES2, (int) (1), 1).getItem() == stack.getItem()
				&& new ItemStack(Blocks.LEAVES2, (int) (1), 1).getMetadata() == stack.getMetadata())
			return true;
		if (new ItemStack(Blocks.LEAVES2, (int) (1), 1).getItem() == stack.getItem()
				&& new ItemStack(Blocks.LEAVES2, (int) (1), 1).getMetadata() == stack.getMetadata())
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
	protected SoundEvent getAmbientSound()
	{
		return SoundHandler.ENTITY_PACA_AMBIENT;
	}
	
	@Override
	protected ResourceLocation getLootTable() 
	{		
		if(this.isBurning())
		{
			return LootTableHandler.PACA_COOKED;
		} else {
			return LootTableHandler.PACA_GENERIC;
		}
	}
	
	@Override
	protected SoundEvent getHurtSound(DamageSource damageSource) 
	{
		return SoundHandler.ENTITY_PACA_HURT;
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
        data.addAnimationController(new AnimationController(this, "controller", 0, this::predicate));
    }

    @Override
    public AnimationFactory getFactory()
    {
        return this.factory;
    }
}
