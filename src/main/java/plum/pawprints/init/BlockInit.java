package plum.pawprints.init;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.block.Block;
import plum.pawprints.objects.blocks.BlockPapyrus;
import plum.pawprints.objects.blocks.BlockPlush;

public class BlockInit
{	
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	//PLANTS
	public static final Block PAPYRUS = new BlockPapyrus("papyrus");
	
	//PLUSHIES
	public static final Block BILBYPLUSH = new BlockPlush("bilbyplush");
	public static final Block PINKFAIRYPLUSH = new BlockPlush("pinkfairyplush");
	public static final Block QUOKKAPLUSH = new BlockPlush("quokkaplush");
	public static final Block LIZARDPLUSH = new BlockPlush("lizardplush");
	public static final Block MONGOOSEPLUSH = new BlockPlush("mongooseplush");
}