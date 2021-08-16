package plum.pawprints.init;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.item.Item;
import plum.pawprints.objects.items.ItemBase;
import plum.pawprints.objects.items.ItemSewingneedle;
import plum.pawprints.objects.items.egg.ItemButterflyEgg;
import plum.pawprints.objects.items.egg.ItemNudibranchEgg;
import plum.pawprints.objects.items.food.ItemCrispyCaterpillar;
import plum.pawprints.objects.items.food.ItemFoodBase;

public class ItemInit {
	
	public static final List<Item> ITEMS = new ArrayList<Item>();
    
	
	//BREEDING
	public static final Item DEAD_TERMITE = new ItemBase("dead_termite");
	public static final Item ACACIA_BUDS = new ItemBase("acacia_buds");
	public static final Item CATERPILLAR = new ItemBase("caterpillar");
	public static final Item NECTAR = new ItemBase("nectar");
	public static final Item FUR = new ItemBase("fur");
	
	//FOOD
	public static final Item SMALL_WILD_MEAT = new ItemFoodBase("small_wild_meat", 1, true);
	public static final Item LARGE_WILD_MEAT = new ItemFoodBase("large_wild_meat", 3, true);
	public static final Item BIRD_MEAT = new ItemFoodBase("bird_meat", 2, true);
	public static final Item BIRD_MEAT_COOKED = new ItemFoodBase("bird_meat_cooked", 4, true);
	public static final Item SMALL_WILD_MEAT_COOKED = new ItemFoodBase("small_wild_meat_cooked", 4, true);
	public static final Item LARGE_WILD_MEAT_COOKED = new ItemFoodBase("large_wild_meat_cooked", 8, true);
	public static final Item PACA_THIGH = new ItemFoodBase("paca_thigh", 5, true);
	public static final Item PACA_THIGH_COOKED = new ItemFoodBase("paca_thigh_cooked", 9, true);
	public static final Item CRISPY_CATERPILLAR = new ItemCrispyCaterpillar("caterpillar_cooked", 3, false);
	
	//SPECIAL
	public static final Item ARMADILLO_PLATE = new ItemBase("armadilloplate");
	public static final Item BILBYSCARF = new ItemBase("bilbyscarf");
	
	public static final Item SEWINGNEEDLE = new ItemSewingneedle("sewingneedle");
	
	public static final Item BUTTERFLY_SPAWN = new ItemButterflyEgg("butterflyspawn");
	public static final Item NUDIBRANCH_SPAWN = new ItemNudibranchEgg("nudibranchspawn");
}