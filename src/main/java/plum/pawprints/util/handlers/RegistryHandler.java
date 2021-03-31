package plum.pawprints.util.handlers;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import plum.pawprints.init.BlockInit;
import plum.pawprints.init.EntityInit;
import plum.pawprints.init.ItemInit;
import plum.pawprints.util.interfaces.IHasModel;
import plum.pawprints.world.gen.WorldGenCustomStructure;

@EventBusSubscriber
public class RegistryHandler
{
	@SubscribeEvent
	public static void registerItems(RegistryEvent.Register<Item> event)
	{
		event.getRegistry().registerAll(ItemInit.ITEMS.toArray(new Item[0]));
	}
	
	@SubscribeEvent
	public static void registerBlocks(RegistryEvent.Register<Block> event)
	{
		event.getRegistry().registerAll(BlockInit.BLOCKS.toArray(new Block[0]));
		TileEntityHandler.registerTileEntities();
		
		
		//Individual tile entity renderers
		//ClientRegistry.bindTileEntitySpecialRenderer(TileEntityPapyrus.class, new PapyrusRenderer());
	}
	
	@SubscribeEvent
	public static void onModelRegister(ModelRegistryEvent event)
	{
		
		//Individual item getters for blocks
		//main.proxy.registerModel(Item.getItemFromBlock(BlockInit.PAPYRUS), 0);
		
		
		for(Item item : ItemInit.ITEMS)
		{
			if(item instanceof IHasModel)
			{
				((IHasModel)item).registerModels();
			}
		}
		RenderHandler.registerEntityRenders();
	}
	
	public static void InitRegistries()
	{
		SoundHandler.registerSounds();
	}
	
	public static void preInitRegistries()
	{
		EntityInit.registerEntities();
		GameRegistry.registerWorldGenerator(new WorldGenCustomStructure(), 0);
	}
}