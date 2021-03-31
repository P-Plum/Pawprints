package plum.pawprints.init;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.block.Block;
import plum.pawprints.objects.blocks.BlockBilbyPlush;
import plum.pawprints.objects.blocks.BlockPapyrus;

public class BlockInit
{	
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	//PLANTS
	public static final Block PAPYRUS = new BlockPapyrus("papyrus");
	
	//PLUSHIES
	public static final Block BILBYPLUSH = new BlockBilbyPlush("bilbyplush");
}