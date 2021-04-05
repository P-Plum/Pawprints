package plum.pawprints.util.handlers;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import plum.pawprints.init.BlockInit;
import plum.pawprints.init.EntityInit;
import plum.pawprints.init.ItemInit;
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
	}
	
	@SubscribeEvent
	public static void onModelRegister(ModelRegistryEvent event)
	{
		
		
		for(Item item : ItemInit.ITEMS)
		{
			ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
		}
		
		for(Block block : BlockInit.BLOCKS)
		{
			ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0, new ModelResourceLocation(block.getRegistryName(), "inventory"));
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