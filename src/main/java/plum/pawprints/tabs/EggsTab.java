package plum.pawprints.tabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityList;
import net.minecraft.init.Items;
import net.minecraft.item.ItemMonsterPlacer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import plum.pawprints.util.Reference;

public class EggsTab extends CreativeTabs {

	public EggsTab(String label) {
		super("eggstab");
	}

	@Override
    @SideOnly(Side.CLIENT)
    public ItemStack getTabIconItem() {
    	return new ItemStack(Items.SPAWN_EGG);
    }
	
	
    @Override
    @SideOnly(Side.CLIENT)
    public void displayAllRelevantItems(NonNullList<ItemStack> itemList) {
        super.displayAllRelevantItems(itemList);
        for (EntityList.EntityEggInfo eggInfo : EntityList.ENTITY_EGGS.values()) {
            if (eggInfo.spawnedID.getResourceDomain().equals(Reference.MODID)) {
                ItemStack itemstack = new ItemStack(Items.SPAWN_EGG, 1);
                ItemMonsterPlacer.applyEntityIdToItemStack(itemstack, eggInfo.spawnedID);
                itemList.add(itemstack);
            }
        }
    }
}