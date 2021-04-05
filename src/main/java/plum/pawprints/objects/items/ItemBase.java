package plum.pawprints.objects.items;

import net.minecraft.item.Item;
import plum.pawprints.main;
import plum.pawprints.init.ItemInit;

public class ItemBase extends Item
{
	public ItemBase(String name) {
		
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(main.itemsblockstab);
		
		
		ItemInit.ITEMS.add(this);
	}

	public void registerModels() {
		
		main.proxy.registerItemRenderer(this, 0, "inventory");
		
	}
}
