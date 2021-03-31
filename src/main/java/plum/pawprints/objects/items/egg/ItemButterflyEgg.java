package plum.pawprints.objects.items.egg;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;
import plum.pawprints.main;
import plum.pawprints.entity.EntityBilby;
import plum.pawprints.entity.EntityGoAwayBird;
import plum.pawprints.entity.butterfly.EntityLunaMoth;
import plum.pawprints.objects.items.ItemBase;

public class ItemButterflyEgg extends ItemBase {

	public ItemButterflyEgg(String name) {
    	super(name);
        this.setCreativeTab(main.eggstab);
	}

	@Override
    public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer player, EnumHand hand)
    {
    	ItemStack item = player.getHeldItem(hand);
    	EntityLunaMoth entity = new EntityLunaMoth(worldIn);
    	EntityBilby entitytwo = new EntityBilby(worldIn);
    	EntityGoAwayBird entitythree = new EntityGoAwayBird(worldIn);
    	
    	entity.setPosition(player.posX, player.posY, player.posZ);
    	entitytwo.setPosition(player.posX, player.posY, player.posZ);
    	entitythree.setPosition(player.posX, player.posY, player.posZ);
    	
    	if (!player.capabilities.isCreativeMode)
        {
    		item.shrink(1);
        }
    	
    	switch(worldIn.rand.nextInt(3)) {
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
    	}
    }
}