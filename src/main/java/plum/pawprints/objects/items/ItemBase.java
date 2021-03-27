package plum.pawprints.objects.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import plum.pawprints.main;
import plum.pawprints.init.ItemInit;
import plum.pawprints.util.interfaces.IHasModel;

public class ItemBase extends Item 	implements IHasModel
{
	public ItemBase(String name) {
		
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.MISC);
		
		
		ItemInit.ITEMS.add(this);
	}

	@Override
	public void registerModels() {
		
		main.proxy.registerItemRenderer(this, 0, "inventory");
		
	}
}
