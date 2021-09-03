package plum.pawprints.world.gen.plant;

import java.util.Random;

import net.minecraft.block.BlockHorizontal;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.fml.common.IWorldGenerator;
import plum.pawprints.objects.blocks.BlockPapyrus;

public class PapyrusGenerator implements IWorldGenerator {

    private BlockPapyrus papyrus;
    private IBlockState state;

    public PapyrusGenerator(BlockPapyrus papyrusIn) {
        this.setGeneratedBlock(papyrusIn);
    }

    public void setGeneratedBlock(BlockPapyrus papyrusIn) {
        this.papyrus = papyrusIn;
        this.state = papyrusIn.getDefaultState();
    }

    @Override
    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {
        int x = (chunkX * 16) + 8 + random.nextInt(12);
        int z = (chunkZ * 16) + 8 + random.nextInt(12);
        BlockPos blockpos = new BlockPos(x, 63, z);
        if (BiomeDictionary.hasType(world.getBiome(blockpos), BiomeDictionary.Type.SWAMP)) {
            for (int i = 0; i < 64; ++i) {
                blockpos = new BlockPos(x, i, z);

                int j = 2 + random.nextInt(random.nextInt(3) + 1);
                
                if (world.isAirBlock(blockpos) && this.papyrus.canBlockStay(world, blockpos, this.state)) {
                	for (int k = 0; k < j; ++k)
                    {
                		EnumFacing face = EnumFacing.HORIZONTALS[random.nextInt(4)];
                		world.setBlockState(blockpos, this.state.withProperty(BlockHorizontal.FACING, face));
                    }
                }
            }
        }
    }

}