package plum.pawprints.tabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import plum.pawprints.init.ItemInit;

public class ItemsBlocksTab extends CreativeTabs {

	public ItemsBlocksTab(String label) {
		super("itemsblockstab");
	}

	@Override
	public ItemStack getTabIconItem() {
		
		//For an item - return new ItemStack(ItemInit.EXAMPLE);
		//For a block - return new ItemStack(Item.getItemFromBlock(BlockInit.EXAMPLE));
		
		return new ItemStack(ItemInit.SEWINGNEEDLE);
	}

}
