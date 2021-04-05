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
import plum.pawprints.event.PawprintsEventHandler;
import plum.pawprints.proxy.CommonProxy;
import plum.pawprints.recipes.SmeltingRecipes;
import plum.pawprints.tabs.EggsTab;
import plum.pawprints.tabs.ItemsBlocksTab;
import plum.pawprints.tabs.PlantsTab;
import plum.pawprints.util.Reference;
import plum.pawprints.util.handlers.RegistryHandler;
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
	}
	
	@EventHandler
	public static void postInit(FMLPostInitializationEvent event) {
		
	}
}