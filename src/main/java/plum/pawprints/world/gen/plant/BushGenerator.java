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
import plum.pawprints.objects.blocks.BlockBush;

public class BushGenerator implements IWorldGenerator {

    private BlockBush bush;
    private IBlockState state;

    public BushGenerator(BlockBush bushIn) {
        this.setGeneratedBlock(bushIn);
    }

    public void setGeneratedBlock(BlockBush bushIn) {
        this.bush = bushIn;
        this.state = bushIn.getDefaultState();
    }

    @Override
    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {
        int x = (chunkX * 16) + 8 + random.nextInt(12);
        int z = (chunkZ * 16) + 8 + random.nextInt(12);
        BlockPos blockpos = new BlockPos(x, 80, z);
        if (BiomeDictionary.hasType(world.getBiome(blockpos), BiomeDictionary.Type.FOREST)) {
            for (int i = 0; i < 100; ++i) {
                blockpos = new BlockPos(x, i, z);

                int j = 2 + random.nextInt(random.nextInt(3) + 1);
                
                if (world.isAirBlock(blockpos) && this.bush.canBlockStay(world, blockpos, this.state)) {
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