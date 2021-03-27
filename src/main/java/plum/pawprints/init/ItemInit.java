package plum.pawprints.init;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;
import plum.pawprints.objects.items.ArmourModel;
import plum.pawprints.objects.items.ItemBase;
import plum.pawprints.objects.items.food.ItemCustomFood;
import plum.pawprints.util.Reference;

public class ItemInit {
	
	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	//BREEDING
	public static final Item DEAD_TERMITE = new ItemBase("dead_termite");
	public static final Item ACACIA_BUDS = new ItemBase("acacia_buds");
	public static final Item CATERPILLAR = new ItemBase("caterpillar");
	public static final Item NECTAR = new ItemBase("nectar");
	
	//WEARABLES
	public static final ArmorMaterial WEARABLE_BILBYSCARF = EnumHelper.addArmorMaterial("wearable_bilbyscarf", Reference.MODID + ":bilbyscarf", 0, new int[] {0, 0, 0, 0}, 0, null, 0F);
	public static final Item BILBYSCARF = new ArmourModel ("bilbyscarf", CreativeTabs.COMBAT, WEARABLE_BILBYSCARF, EntityEquipmentSlot.HEAD);
	
	//FOOD
	public static final Item SMALL_WILD_MEAT = new ItemCustomFood("small_wild_meat", 1, true);
	public static final Item LARGE_WILD_MEAT = new ItemCustomFood("large_wild_meat", 3, true);
	public static final Item SMALL_WILD_MEAT_COOKED = new ItemCustomFood("small_wild_meat_cooked", 6, true);
	public static final Item LARGE_WILD_MEAT_COOKED = new ItemCustomFood("large_wild_meat_cooked", 8, true);
	
	//SPECIAL
	public static final Item GOAWAYBIRD_FEATHER = new ItemBase("goawaybird_feather");
	public static final Item ARMADILLO_PLATE = new ItemBase("armadilloplate");
}