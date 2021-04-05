package plum.pawprints.objects.items.food;

import net.minecraft.item.ItemFood;
import plum.pawprints.main;
import plum.pawprints.init.ItemInit;

public class ItemFoodBase extends ItemFood
{
	public ItemFoodBase(String name, int amount, boolean isWolfFood)
	{
		super(amount, isWolfFood);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(main.itemsblockstab);
		
		ItemInit.ITEMS.add(this);
	}
	
	public void registerModels()
	{
		main.proxy.registerItemRenderer(this, 0, "inventory");
	}
}
