package plum.pawprints.util.handlers;

import net.minecraft.util.ResourceLocation;
import net.minecraft.world.storage.loot.LootTableList;
import plum.pawprints.util.Reference;

public class LootTableHandler {
	
	public static final ResourceLocation TERMITE = LootTableList.register(new ResourceLocation(Reference.MODID, "termite"));
	public static final ResourceLocation BUTTERFLY = LootTableList.register(new ResourceLocation(Reference.MODID, "caterpillar_loot"));
	public static final ResourceLocation SPIDER = LootTableList.register(new ResourceLocation(Reference.MODID, "spider_loot"));
	
	//ANIMALS
	public static final ResourceLocation BILBY_GENERIC = LootTableList.register(new ResourceLocation(Reference.MODID, "bilby_generic"));
	public static final ResourceLocation PINKFAIRY_GENERIC = LootTableList.register(new ResourceLocation(Reference.MODID, "pinkfairy_generic"));
	public static final ResourceLocation PACA_GENERIC = LootTableList.register(new ResourceLocation(Reference.MODID, "paca_generic"));
	
	//COOKED ANIMALS
	public static final ResourceLocation BILBY_COOKED = LootTableList.register(new ResourceLocation(Reference.MODID, "bilby_cooked"));
	public static final ResourceLocation PINKFAIRY_COOKED = LootTableList.register(new ResourceLocation(Reference.MODID, "pinkfairy_cooked"));
	public static final ResourceLocation PACA_COOKED = LootTableList.register(new ResourceLocation(Reference.MODID, "paca_cooked"));
	
	//MEAT TYPES
	public static final ResourceLocation SMALLMEAT = LootTableList.register(new ResourceLocation(Reference.MODID, "smallmeat_generic"));
	public static final ResourceLocation SMALLMEAT_COOKED = LootTableList.register(new ResourceLocation(Reference.MODID, "smallmeat_cooked"));
	public static final ResourceLocation LARGEMEAT = LootTableList.register(new ResourceLocation(Reference.MODID, "largemeat_generic"));
	public static final ResourceLocation LARGEMEAT_COOKED = LootTableList.register(new ResourceLocation(Reference.MODID, "largemeat_cooked"));
	
	public static final ResourceLocation FUR_SMALLMEAT = LootTableList.register(new ResourceLocation(Reference.MODID, "fur_smallmeat_generic"));
	public static final ResourceLocation FUR_SMALLMEAT_COOKED = LootTableList.register(new ResourceLocation(Reference.MODID, "fur_smallmeat_cooked"));
	public static final ResourceLocation FUR_LARGEMEAT = LootTableList.register(new ResourceLocation(Reference.MODID, "fur_largemeat_generic"));
	public static final ResourceLocation FUR_LARGEMEAT_COOKED = LootTableList.register(new ResourceLocation(Reference.MODID, "fur_largemeat_cooked"));
	
	public static final ResourceLocation BIRD_GENERIC = LootTableList.register(new ResourceLocation(Reference.MODID, "bird_generic"));
	public static final ResourceLocation BIRD_COOKED = LootTableList.register(new ResourceLocation(Reference.MODID, "bird_cooked"));
	public static final ResourceLocation CRAB_GENERIC = LootTableList.register(new ResourceLocation(Reference.MODID, "crab_generic"));
	public static final ResourceLocation CRAB_COOKED = LootTableList.register(new ResourceLocation(Reference.MODID, "crab_cooked"));
	
	//BUTTERFLIES
	
}
