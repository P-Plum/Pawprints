package plum.pawprints.recipes;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import plum.pawprints.init.ItemInit;

public class SmeltingRecipes 

{
	
	public static void init()
	{
		GameRegistry.addSmelting(new ItemStack(ItemInit.SMALL_WILD_MEAT), new ItemStack(ItemInit.SMALL_WILD_MEAT_COOKED), 0.25F);
		GameRegistry.addSmelting(new ItemStack(ItemInit.LARGE_WILD_MEAT), new ItemStack(ItemInit.LARGE_WILD_MEAT_COOKED), 0.35F);
	}

}
