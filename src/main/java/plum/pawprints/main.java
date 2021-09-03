package plum.pawprints;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import plum.pawprints.configuration.PawprintsGenConfig;
import plum.pawprints.event.PawprintsEventHandler;
import plum.pawprints.init.BlockInit;
import plum.pawprints.objects.blocks.BlockAloeBulbillifera;
import plum.pawprints.objects.blocks.BlockBillyButtons;
import plum.pawprints.objects.blocks.BlockBush;
import plum.pawprints.objects.blocks.BlockCapeReed;
import plum.pawprints.objects.blocks.BlockPapyrus;
import plum.pawprints.proxy.CommonProxy;
import plum.pawprints.recipes.SmeltingRecipes;
import plum.pawprints.tabs.EggsTab;
import plum.pawprints.tabs.ItemsBlocksTab;
import plum.pawprints.tabs.PlantsTab;
import plum.pawprints.util.Reference;
import plum.pawprints.util.handlers.RegistryHandler;
import plum.pawprints.world.gen.plant.AloeBulbilliferaGenerator;
import plum.pawprints.world.gen.plant.BillyButtonsGenerator;
import plum.pawprints.world.gen.plant.BushGenerator;
import plum.pawprints.world.gen.plant.CapeReedGenerator;
import plum.pawprints.world.gen.plant.PapyrusGenerator;
import software.bernie.geckolib3.GeckoLib;

@Mod(modid = Reference.MODID, name = Reference.MODNAME, version = Reference.VERSION)
public class main {
	@Instance
	public static main instance;
	
	public static final CreativeTabs eggstab = new EggsTab("eggstab");
	public static final CreativeTabs plantstab = new PlantsTab("plantstab");
	public static final CreativeTabs itemsblockstab = new ItemsBlocksTab("itemsblockstab");
	
	@SidedProxy(clientSide = Reference.CLIENT, serverSide = Reference.COMMON)
	public static CommonProxy proxy;
	
	@EventHandler
	public static void preInit(FMLPreInitializationEvent event) {
		RegistryHandler.preInitRegistries();
		MinecraftForge.EVENT_BUS.register(new PawprintsEventHandler());
		
		GeckoLib.initialize();
	}
	
	@EventHandler
	public static void init(FMLInitializationEvent event) {
		RegistryHandler.InitRegistries();
	
		SmeltingRecipes.init();
		
		if (PawprintsGenConfig.enablePapyrus) { 
			GameRegistry.registerWorldGenerator(new PapyrusGenerator((BlockPapyrus) BlockInit.PAPYRUS), 1); }
		if (PawprintsGenConfig.enableBillyButtons) { 
			GameRegistry.registerWorldGenerator(new BillyButtonsGenerator((BlockBillyButtons) BlockInit.BILLY_BUTTONS), 1); }
		if (PawprintsGenConfig.enableAloe) { 
			GameRegistry.registerWorldGenerator(new AloeBulbilliferaGenerator((BlockAloeBulbillifera) BlockInit.ALOE_BULBILLIFERA), 1); }
		if (PawprintsGenConfig.enableBush) { 
			GameRegistry.registerWorldGenerator(new BushGenerator((BlockBush) BlockInit.BUSH), 1); }
		if (PawprintsGenConfig.enableCapeReed) { 
			GameRegistry.registerWorldGenerator(new CapeReedGenerator((BlockCapeReed) BlockInit.CAPEREED), 1); }
	}
	
	@EventHandler
	public static void postInit(FMLPostInitializationEvent event) {
		
	}
}