  package plum.pawprints.proxy;

  import net.minecraft.item.Item;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import plum.pawprints.event.PawprintsEventHandler;

  @Mod.EventBusSubscriber
  public class CommonProxy {
	  
	  @Mod.EventHandler
	  	public void preInit(FMLPreInitializationEvent event) {
	  		MinecraftForge.EVENT_BUS.register(new PawprintsEventHandler());
	  	}

	  public void registerModel(Item item, int metadata) {}
	  public void registerItemRenderer(Item item, int meta, String id) {}
	  
	  
  }