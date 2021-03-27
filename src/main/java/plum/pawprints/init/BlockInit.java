package plum.pawprints.init;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.block.Block;
import plum.pawprints.objects.blocks.BlockPapyrus;

public class BlockInit
{	
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	public static final Block PAPYRUS = new BlockPapyrus("papyrus");
}