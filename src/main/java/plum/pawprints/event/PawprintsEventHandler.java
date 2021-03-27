package plum.pawprints.event;

import net.minecraft.block.BlockNewLeaf;
import net.minecraft.block.BlockPlanks;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.world.BlockEvent.HarvestDropsEvent;
import net.minecraftforge.event.world.WorldEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import plum.pawprints.configuration.PawprintsConfig;
import plum.pawprints.init.ItemInit;

public class PawprintsEventHandler {
    public PawprintsEventHandler() 
    {
    	
    }


    @SubscribeEvent
    public void onHarvestDrops(HarvestDropsEvent event) {
    	if (PawprintsConfig.enableAcaciaBuds) {
    		if (event.getState() == Blocks.LEAVES2.getDefaultState().withProperty(BlockNewLeaf.VARIANT, BlockPlanks.EnumType.ACACIA)) {
    			if (event.getWorld().rand.nextInt(16) == 0) {
                    event.getDrops().add(new ItemStack(ItemInit.ACACIA_BUDS, 1));
                    event.setDropChance((float) PawprintsConfig.acaciaBudsDropChance);
                }
            }
        }
    }
    
    
    
    // Server
    @SubscribeEvent
    public void onWorldUnload(WorldEvent.Unload event) {

    }

    @SubscribeEvent
    public void onWorldLoad(WorldEvent.Load event) {

    }
}