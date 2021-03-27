package plum.pawprints.util.handlers;

import net.minecraft.util.ResourceLocation;
import net.minecraft.world.storage.loot.LootTableList;
import plum.pawprints.util.Reference;

public class LootTableHandler {
	
	public static final ResourceLocation TERMITE = LootTableList.register(new ResourceLocation(Reference.MODID, "termite"));
	public static final ResourceLocation BUTTERFLY = LootTableList.register(new ResourceLocation(Reference.MODID, "caterpillar_loot"));
	
	//ANIMALS
	public static final ResourceLocation BILBY_GENERIC = LootTableList.register(new ResourceLocation(Reference.MODID, "bilby_generic"));
	public static final ResourceLocation GOAWAYBIRD_GENERIC = LootTableList.register(new ResourceLocation(Reference.MODID, "goawaybird_generic"));
	
	//COOKED ANIMALS
	public static final ResourceLocation BILBY_COOKED = LootTableList.register(new ResourceLocation(Reference.MODID, "bilby_cooked"));
	public static final ResourceLocation GOAWAYBIRD_COOKED = LootTableList.register(new ResourceLocation(Reference.MODID, "goawaybird_cooked"));
	
	//MEAT TYPES
	public static final ResourceLocation SMALLMEAT = LootTableList.register(new ResourceLocation(Reference.MODID, "smallmeat_generic"));
	public static final ResourceLocation SMALLMEAT_COOKED = LootTableList.register(new ResourceLocation(Reference.MODID, "smallmeat_cooked"));
	public static final ResourceLocation LARGEMEAT = LootTableList.register(new ResourceLocation(Reference.MODID, "largemeat_generic"));
	public static final ResourceLocation LARGEMEAT_COOKED = LootTableList.register(new ResourceLocation(Reference.MODID, "largemeat_cooked"));

	//BUTTERFLIES
	
}
