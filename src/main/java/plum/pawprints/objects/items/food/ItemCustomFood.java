package plum.pawprints.objects.items.food;

import net.minecraft.item.ItemFood;
import plum.pawprints.main;
import plum.pawprints.init.ItemInit;
import plum.pawprints.util.interfaces.IHasModel;

public class ItemCustomFood extends ItemFood implements IHasModel
{
	public ItemCustomFood(String name, int amount, boolean isWolfFood)
	{
		super(amount, isWolfFood);
		setUnlocalizedName(name);
		setRegistryName(name);
		
		ItemInit.ITEMS.add(this);
	}
	
	@Override
	public void registerModels()
	{
		main.proxy.registerItemRenderer(this, 0, "inventory");
	}
}
