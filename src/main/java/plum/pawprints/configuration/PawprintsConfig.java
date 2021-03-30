package plum.pawprints.configuration;

import net.minecraftforge.common.config.Config;
import net.minecraftforge.common.config.Config.Comment;
import plum.pawprints.util.Reference;

@Config(modid = Reference.MODID, name = "Pawprints-" + Reference.VERSION +"/"+ "Pawprints_general")
@Config.LangKey("config.pawprints.title")
public class PawprintsConfig {
	
	@Config.Name("Acacia Bud Drops")
    @Comment("Enables dropping of Acacia Buds.")
    public static boolean enableAcaciaBuds = true;
    @Config.Name("Acacia Bud Drop Chance")
    @Config.Comment("Probability for dropping Acacia Buds.")
    @Config.RangeDouble(min = 0.0, max = 1.0)
    public static double acaciaBudsDropChance = 0.5;
}