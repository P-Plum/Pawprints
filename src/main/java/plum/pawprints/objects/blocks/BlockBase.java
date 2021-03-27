package plum.pawprints.objects.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import plum.pawprints.main;
import plum.pawprints.init.BlockInit;
import plum.pawprints.init.ItemInit;
import plum.pawprints.util.interfaces.IHasModel;

public class BlockBase extends Block implements IHasModel
{
	public BlockBase(String name, Material material, CreativeTabs tab) 
	{
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(tab);
		
		BlockInit.BLOCKS.add(this);
		ItemInit.ITEMS.add(new ItemBlock(this).setRegistryName(name));
	}
	
	@Override
	public void registerModels() 
	{
		main.proxy.registerModel(Item.getItemFromBlock(this), 0);
	}

}