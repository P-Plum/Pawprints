package plum.pawprints.objects.items.egg;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;
import plum.pawprints.main;
import plum.pawprints.entity.butterfly.EntityDaintyButterfly;
import plum.pawprints.entity.butterfly.EntityDeathsMoth;
import plum.pawprints.entity.butterfly.EntityLunaMoth;
import plum.pawprints.entity.butterfly.EntityOldWorldButterfly;
import plum.pawprints.entity.butterfly.EntityPaperKiteButterfly;
import plum.pawprints.entity.butterfly.EntityPussMoth;
import plum.pawprints.entity.butterfly.EntitySunsetMoth;
import plum.pawprints.objects.items.ItemBase;

public class ItemButterflyEgg extends ItemBase {

	public ItemButterflyEgg(String name) {
    	super(name);
        this.setCreativeTab(main.eggstab);
	}

	@Override
    public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer player, EnumHand hand)
    {
		ItemStack itemstack = player.getHeldItem(hand);
		
		if (worldIn.isRemote)
        {
            return new ActionResult<ItemStack>(EnumActionResult.PASS, itemstack);
        } else {
		
    	ItemStack item = player.getHeldItem(hand);
    	
    	//Entity spawn list ... clean up later for sure
    	EntityLunaMoth entity = new EntityLunaMoth(worldIn);
    	EntityPussMoth entitytwo = new EntityPussMoth(worldIn);
    	EntityDaintyButterfly entitythree = new EntityDaintyButterfly(worldIn);
    	EntityDeathsMoth entityfour = new EntityDeathsMoth(worldIn);
    	EntityOldWorldButterfly entityfive = new EntityOldWorldButterfly(worldIn);
    	EntityPaperKiteButterfly entitysix = new EntityPaperKiteButterfly(worldIn);
    	EntitySunsetMoth entityseven = new EntitySunsetMoth(worldIn);
    	
    	entity.setPosition(player.posX, player.posY, player.posZ);
    	entitytwo.setPosition(player.posX, player.posY, player.posZ);
    	entitythree.setPosition(player.posX, player.posY, player.posZ);
    	entityfour.setPosition(player.posX, player.posY, player.posZ);
    	entityfive.setPosition(player.posX, player.posY, player.posZ);
    	entitysix.setPosition(player.posX, player.posY, player.posZ);
    	entityseven.setPosition(player.posX, player.posY, player.posZ);
    	
    	if (!player.capabilities.isCreativeMode)
        {
    		item.shrink(1);
        }
    	
    	switch(worldIn.rand.nextInt(7)) {
        default:
        case 0:
        	worldIn.spawnEntity(entity);
        	return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, item);
        case 1:
        	worldIn.spawnEntity(entitytwo);
        	return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, item);
        case 2:
        	worldIn.spawnEntity(entitythree);
        	return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, item);
        case 3:
        	worldIn.spawnEntity(entityfour);
        	return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, item);
        case 4:
        	worldIn.spawnEntity(entityfive);
        	return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, item);
        case 5:
        	worldIn.spawnEntity(entitysix);
        	return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, item);
        case 6:
        	worldIn.spawnEntity(entityseven);
        	return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, item);
    	}
     }
  }
}