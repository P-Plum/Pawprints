package plum.pawprints.tabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import plum.pawprints.init.BlockInit;

public class PlantsTab extends CreativeTabs {

	public PlantsTab(String label) {
		super("plantstab");
	}

	@Override
	public ItemStack getTabIconItem() {
		
		//For an item - return new ItemStack(ItemInit.EXAMPLE);
		//For a block - return new ItemStack(Item.getItemFromBlock(BlockInit.EXAMPLE));
		
		return new ItemStack(BlockInit.PAPYRUS);
	}

}
