package plum.pawprints.init;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.item.Item;
import plum.pawprints.objects.items.ItemBase;
import plum.pawprints.objects.items.food.ItemCrispyCaterpillar;
import plum.pawprints.objects.items.food.ItemCustomFood;

public class ItemInit {
	
	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	//BREEDING
	public static final Item DEAD_TERMITE = new ItemBase("dead_termite");
	public static final Item ACACIA_BUDS = new ItemBase("acacia_buds");
	public static final Item CATERPILLAR = new ItemBase("caterpillar");
	public static final Item NECTAR = new ItemBase("nectar");
	
	//FOOD
	public static final Item SMALL_WILD_MEAT = new ItemCustomFood("small_wild_meat", 1, true);
	public static final Item LARGE_WILD_MEAT = new ItemCustomFood("large_wild_meat", 3, true);
	public static final Item SMALL_WILD_MEAT_COOKED = new ItemCustomFood("small_wild_meat_cooked", 4, true);
	public static final Item LARGE_WILD_MEAT_COOKED = new ItemCustomFood("large_wild_meat_cooked", 8, true);
	public static final Item PACA_THIGH = new ItemCustomFood("paca_thigh", 5, true);
	public static final Item PACA_THIGH_COOKED = new ItemCustomFood("paca_thigh_cooked", 9, true);
	public static final Item CRISPY_CATERPILLAR = new ItemCrispyCaterpillar("caterpillar_cooked", 3, false);
	
	//SPECIAL
	public static final Item ARMADILLO_PLATE = new ItemBase("armadilloplate");
	public static final Item BILBYSCARF = new ItemBase("bilbyscarf");
}