package plum.pawprints.init;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.block.Block;
import plum.pawprints.objects.blocks.BlockAloeBulbillifera;
import plum.pawprints.objects.blocks.BlockBillyButtons;
import plum.pawprints.objects.blocks.BlockBush;
import plum.pawprints.objects.blocks.BlockCapeReed;
import plum.pawprints.objects.blocks.BlockPapyrus;
import plum.pawprints.objects.blocks.BlockPlush;

public class BlockInit
{	
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	//PLANTS
	public static final Block PAPYRUS = new BlockPapyrus("papyrus");
	public static final Block BUSH = new BlockBush("bush");
	public static final Block ALOE_BULBILLIFERA = new BlockAloeBulbillifera("aloebulbillifera");
	public static final Block BILLY_BUTTONS = new BlockBillyButtons("billybuttons");
	public static final Block CAPEREED = new BlockCapeReed("capereed");
	
	//PLUSHIES
	public static final Block BILBYPLUSH = new BlockPlush("bilbyplush");
	public static final Block PINKFAIRYPLUSH = new BlockPlush("pinkfairyplush");
	public static final Block QUOKKAPLUSH = new BlockPlush("quokkaplush");
	public static final Block LIZARDPLUSH = new BlockPlush("lizardplush");
	public static final Block MONGOOSEPLUSH = new BlockPlush("mongooseplush");
}