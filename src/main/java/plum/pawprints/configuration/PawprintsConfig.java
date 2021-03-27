package plum.pawprints.configuration;

import net.minecraftforge.common.config.Config;
import plum.pawprints.util.Reference;

@Config(modid = Reference.MODID, name = "Pawprints-" + Reference.VERSION +"/"+ Reference.MODID)
@Config.LangKey("config.pawprints.title")
public class PawprintsConfig {
	
	@Config.Name("Acacia Bud Drops")
    @Config.Comment("If you would like Acacia Buds to stop dropping from Acacia leaves, set to false.")
    public static boolean enableAcaciaBuds = true;
    @Config.Name("Acacia Bud Drop Chance")
    @Config.Comment("Change to adjust Acacia Bud drop rates.")
    @Config.RangeDouble(min = 0.0, max = 1.0)
    public static double acaciaBudsDropChance = 0.5;
}