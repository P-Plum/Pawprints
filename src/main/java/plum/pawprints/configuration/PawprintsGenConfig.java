package plum.pawprints.configuration;

import net.minecraftforge.common.config.Config;
import net.minecraftforge.common.config.Config.Comment;
import plum.pawprints.util.Reference;

@Config(modid = Reference.MODID, name = "Pawprints-" + Reference.VERSION +"/"+ "Pawprints_worldgen")
@Config.LangKey("config.pawprints.title")
public class PawprintsGenConfig {
	
	@Config.Name("Billy Buttons world generation")
    @Comment("Enables natural generation of Billy Buttons.")
    public static boolean enableBillyButtons = true;
	
	@Config.Name("Papyrus world generation")
    @Comment("Enables natural generation of Papyrus.")
    public static boolean enablePapyrus = true;
	
	@Config.Name("Bush world generation")
    @Comment("Enables natural generation of Bush.")
    public static boolean enableBush = true;
	
	@Config.Name("Aloe bulbillifera world generation")
    @Comment("Enables natural generation of Aloe bulbillifera.")
    public static boolean enableAloe = true;
	
	@Config.Name("Red Natal Grass world generation")
    @Comment("Enables natural generation of Red Natal Grass.")
    public static boolean enableRedNatal = true;
	
	@Config.Name("Farmer's Friends world generation")
    @Comment("Enables natural generation of Farmer's Friends.")
    public static boolean enableFarmersFriends = true;
	
	@Config.Name("Kangaroo Grass world generation")
    @Comment("Enables natural generation of Kangaroo Grass.")
    public static boolean enableRooGrass = true;
	
	@Config.Name("Persian Carpet Flower world generation")
    @Comment("Enables natural generation of Persian Carpet Flower.")
    public static boolean enablePersianCarp = true;
	
	@Config.Name("Caralluma socotrana world generation")
    @Comment("Enables natural generation of Caralluma socotrana.")
    public static boolean enableCaralluma = true;
	
	@Config.Name("Yesterday, Today and Tomorrow world generation")
    @Comment("Enables natural generation of Yesterday, Today and Tomorrow.")
    public static boolean enableYesterday = true;
	
	@Config.Name("Venus Flytrap world generation")
    @Comment("Enables natural generation of Venus Flytrap.")
    public static boolean enableFlytrap = true;
	
	@Config.Name("Codiaeum variegatum world generation")
    @Comment("Enables natural generation of Codiaeum variegatum.")
    public static boolean enableCodiaeum = true;
	
	@Config.Name("Inky Cap Mushroom world generation")
    @Comment("Enables natural generation of Inky Cap Mushroom.")
    public static boolean enableInky = true;
	
	@Config.Name("Bleeding Tooth Fungus world generation")
    @Comment("Enables natural generation of Bleeding Tooth Fungus.")
    public static boolean enableTooth = true;
	
	@Config.Name("Devil's Cigar Fungus world generation")
    @Comment("Enables natural generation of Devil's Cigar Fungus.")
    public static boolean enableDevilsCigar = true;
	
	@Config.Name("Stinkhorn Fungus world generation")
    @Comment("Enables natural generation of Stinkhorn Fungus.")
    public static boolean enableStinkhorn = true;
}