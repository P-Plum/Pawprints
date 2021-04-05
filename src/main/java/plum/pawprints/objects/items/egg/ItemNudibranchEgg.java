package plum.pawprints.objects.items.egg;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;
import plum.pawprints.main;
import plum.pawprints.entity.nudibranch.EntityNudibranchAnnae;
import plum.pawprints.entity.nudibranch.EntityNudibranchAnnulata;
import plum.pawprints.entity.nudibranch.EntityNudibranchBullocki;
import plum.pawprints.entity.nudibranch.EntityNudibranchCristata;
import plum.pawprints.entity.nudibranch.EntityNudibranchKuniei;
import plum.pawprints.entity.nudibranch.EntityNudibranchKuroshimae;
import plum.pawprints.entity.nudibranch.EntityNudibranchPacifica;
import plum.pawprints.entity.nudibranch.EntityNudibranchParva;
import plum.pawprints.entity.nudibranch.EntityNudibranchRuthae;
import plum.pawprints.entity.nudibranch.EntityNudibranchSinuata;
import plum.pawprints.objects.items.ItemBase;

public class ItemNudibranchEgg extends ItemBase {

	public ItemNudibranchEgg(String name) {
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
    	EntityNudibranchAnnae entity = new EntityNudibranchAnnae(worldIn);
    	EntityNudibranchAnnulata entitytwo = new EntityNudibranchAnnulata(worldIn);
    	EntityNudibranchBullocki entitythree = new EntityNudibranchBullocki(worldIn);
    	EntityNudibranchCristata entityfour = new EntityNudibranchCristata(worldIn);
    	EntityNudibranchKuniei entityfive = new EntityNudibranchKuniei(worldIn);
    	EntityNudibranchKuroshimae entitysix = new EntityNudibranchKuroshimae(worldIn);
    	EntityNudibranchPacifica entityseven = new EntityNudibranchPacifica(worldIn);
    	EntityNudibranchParva entityeight = new EntityNudibranchParva(worldIn);
    	EntityNudibranchRuthae entitynine = new EntityNudibranchRuthae(worldIn);
    	EntityNudibranchSinuata entityten = new EntityNudibranchSinuata(worldIn);
    	
    	entity.setPosition(player.posX, player.posY, player.posZ);
    	entitytwo.setPosition(player.posX, player.posY, player.posZ);
    	entitythree.setPosition(player.posX, player.posY, player.posZ);
    	entityfour.setPosition(player.posX, player.posY, player.posZ);
    	entityfive.setPosition(player.posX, player.posY, player.posZ);
    	entitysix.setPosition(player.posX, player.posY, player.posZ);
    	entityseven.setPosition(player.posX, player.posY, player.posZ);
    	entityeight.setPosition(player.posX, player.posY, player.posZ);
    	entitynine.setPosition(player.posX, player.posY, player.posZ);
    	entityten.setPosition(player.posX, player.posY, player.posZ);
    	//Entity spawn list end
    	
    	if (!player.capabilities.isCreativeMode)
        {
    		item.shrink(1);
        }
    	
    	switch(worldIn.rand.nextInt(10)) {
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
        case 7:
        	worldIn.spawnEntity(entityeight);
        	return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, item);
        case 8:
        	worldIn.spawnEntity(entitynine);
        	return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, item);
        case 9:
        	worldIn.spawnEntity(entityten);
        	return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, item);
    	}
     }
  }
}