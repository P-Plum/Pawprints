package plum.pawprints.configuration;

import net.minecraftforge.common.config.Config;
import plum.pawprints.util.Reference;

@Config(modid = Reference.MODID, name = "Pawprints-" + Reference.VERSION +"/"+ "Pawprints_spawns")
@Config.LangKey("config.pawprints.title")
public class PawprintsSpawnConfig {
	
	
	//BILBY
		@Config.Name("Bilby spawns")
	    @Config.Comment("Enables natural spawning of Greater Bilby.")
		public static boolean bilbySpawns = true;
		
	    @Config.Name("Bilby biomes")
	    @Config.Comment("BiomeDictionary types for spawning Greater Bilby.")
		public static String[] bilbyBiomes = new String[] { "SANDY", "DRY", };
		
	    @Config.Name("Bilby generation probability")
	    @Config.Comment("Probability for spawning Greater Bilby.")
		public static int bilbyRate = 5;
	    
	  //ARMADILLO
	  		@Config.Name("Pink Fairy Armadillo spawns")
	  	    @Config.Comment("Enables natural spawning of Pink Fairy Armadillo.")
	  		public static boolean fairySpawns = true;
	  		
	  	    @Config.Name("Pink Fairy Armadillo biomes")
	  	    @Config.Comment("BiomeDictionary types for spawning Pink Fairy Armadillo.")
	  		public static String[] fairyBiomes = new String[] { "SANDY", "DRY", "SAVANNA", };
	  		
	  	    @Config.Name("Pink Fairy Armadillo generation probability")
	  	    @Config.Comment("Probability for spawning Pink Fairy Armadillo.")
	  		public static int fairyRate = 10;
	  	    
	  	//QUOKKA
			@Config.Name("Quokka spawns")
		    @Config.Comment("Enables natural spawning of Quokka.")
			public static boolean quokkaSpawns = true;
			
		    @Config.Name("Quokka biomes")
		    @Config.Comment("BiomeDictionary types for spawning Quokka.")
			public static String[] quokkaBiomes = new String[] { "SWAMP", "PLAINS", "SAVANNA", };
			
		    @Config.Name("Quokka generation probability")
		    @Config.Comment("Probability for spawning Quokka.")
			public static int quokkaRate = 15;
		    
		  //GO-AWAY BIRD
			@Config.Name("White-bellied Go-away-bird spawns")
		    @Config.Comment("Enables natural spawning of White-bellied Go-away-bird.")
			public static boolean goawaybirdSpawns = true;
			
		    @Config.Name("White-bellied Go-away-bird biomes")
		    @Config.Comment("BiomeDictionary types for spawning White-bellied Go-away-bird.")
			public static String[] goawaybirdBiomes = new String[] { "DRY", "SAVANNA", };
			
		    @Config.Name("White-bellied Go-away-bird generation probability")
		    @Config.Comment("Probability for spawning White-bellied Go-away-bird.")
			public static int goawaybirdRate = 15;
		    
		  //FERRET-BADGER
			@Config.Name("Ferret-badger spawns")
		    @Config.Comment("Enables natural spawning of Ferret-badger.")
			public static boolean ferretbadgerSpawns = true;
			
		    @Config.Name("Ferret-badger biomes")
		    @Config.Comment("BiomeDictionary types for spawning Ferret-badger.")
			public static String[] ferretbadgerBiomes = new String[] { "FOREST", "JUNGLE", };
			
		    @Config.Name("Ferret-badger generation probability")
		    @Config.Comment("Probability for spawning Ferret-badger.")
			public static int ferretbadgerRate = 25;
		    
		  //LOWLAND PACA
			@Config.Name("Lowland Paca spawns")
		    @Config.Comment("Enables natural spawning of Lowland Paca.")
			public static boolean pacaSpawns = true;
			
		    @Config.Name("Lowland Paca biomes")
		    @Config.Comment("BiomeDictionary types for spawning Lowland Paca.")
			public static String[] pacaBiomes = new String[] { "SWAMP", "FOREST", "JUNGLE", };
			
		    @Config.Name("Lowland Paca generation probability")
		    @Config.Comment("Probability for spawning Lowland Paca.")
			public static int pacaRate = 15;
		    
		  //AMERICAN PIKA
			@Config.Name("American Pika spawns")
		    @Config.Comment("Enables natural spawning of American Pika.")
			public static boolean amerpikaSpawns = true;
			
		    @Config.Name("American Pika biomes")
		    @Config.Comment("BiomeDictionary types for spawning American Pika.")
			public static String[] amerpikaBiomes = new String[] { "MOUNTAIN", "HILLS", };
			
		    @Config.Name("American Pika generation probability")
		    @Config.Comment("Probability for spawning American Pika.")
			public static int amerpikaRate = 20;
		    
		  //ILI PIKA
			@Config.Name("Ili Pika spawns")
		    @Config.Comment("Enables natural spawning of Ili Pika.")
			public static boolean ilipikaSpawns = true;
			
		    @Config.Name("Ili Pika biomes")
		    @Config.Comment("BiomeDictionary types for spawning Ili Pika.")
			public static String[] ilipikaBiomes = new String[] { "MOUNTAIN", "HILLS", };
			
		    @Config.Name("Ili Pika generation probability")
		    @Config.Comment("Probability for spawning Ili Pika.")
			public static int ilipikaRate = 2;
		    
		  //FRILLED LIZARD
			@Config.Name("Frilled-neck Lizard spawns")
		    @Config.Comment("Enables natural spawning of Frilled-neck Lizard.")
			public static boolean frilledSpawns = true;
			
		    @Config.Name("Frilled-neck Lizard biomes")
		    @Config.Comment("BiomeDictionary types for spawning Frilled-neck Lizard.")
			public static String[] frilledBiomes = new String[] { "SANDY", "DRY", "SAVANNA", };
			
		    @Config.Name("Frilled-neck Lizard generation probability")
		    @Config.Comment("Probability for spawning Frilled-neck Lizard.")
			public static int frilledRate = 10;
		    
		  //TENREC
			@Config.Name("Tenrec spawns")
		    @Config.Comment("Enables natural spawning of Tenrec.")
			public static boolean tenrecSpawns = true;
			
		    @Config.Name("Tenrec biomes")
		    @Config.Comment("BiomeDictionary types for spawning Tenrec.")
			public static String[] tenrecBiomes = new String[] { "JUNGLE", "SAVANNA", };
			
		    @Config.Name("Tenrec generation probability")
		    @Config.Comment("Probability for spawning Tenrec.")
			public static int tenrecRate = 15;
		    
		  //MONGOOSE
			@Config.Name("Mongoose spawns")
		    @Config.Comment("Enables natural spawning of Mongoose.")
			public static boolean mongooseSpawns = true;
			
		    @Config.Name("Mongoose biomes")
		    @Config.Comment("BiomeDictionary types for spawning Mongoose.")
			public static String[] mongooseBiomes = new String[] { "JUNGLE", "SAVANNA", "SANDY", };
			
		    @Config.Name("Mongoose generation probability")
		    @Config.Comment("Probability for spawning Mongoose.")
			public static int mongooseRate = 20;
		    
		  //HERMIT CRAB
			@Config.Name("Hermit Crab spawns")
		    @Config.Comment("Enables natural spawning of Hermit Crab.")
			public static boolean hermitcrabSpawns = true;
			
		    @Config.Name("Hermit Crab biomes")
		    @Config.Comment("BiomeDictionary types for spawning Hermit Crab.")
			public static String[] hermitcrabBiomes = new String[] { "BEACH", };
			
		    @Config.Name("Hermit Crab generation probability")
		    @Config.Comment("Probability for spawning Hermit Crab.")
			public static int hermitcrabRate = 20;
		    
		  //BUTTERFLY
			@Config.Name("Butterfly and Moth spawns")
		    @Config.Comment("Enables natural spawning of Butterfly and Moth.")
			public static boolean mothSpawns = true;
			
		    @Config.Name("Butterfly and Moth biomes")
		    @Config.Comment("BiomeDictionary types for spawning Butterfly and Moth.")
			public static String[] mothBiomes = new String[] { "PLAINS", "JUNGLE", "FOREST", "LUSH", "MAGICAL", };
			
		    @Config.Name("Butterfly and Moth generation probability")
		    @Config.Comment("Probability for spawning Butterfly and Moth.")
			public static int mothRate = 50;
		    
		  //NUDIBRANCH
			@Config.Name("Nudibranch spawns")
		    @Config.Comment("Enables natural spawning of Nudibranch.")
			public static boolean nudiSpawns = true;
			
		    @Config.Name("Nudibranch biomes")
		    @Config.Comment("BiomeDictionary types for spawning Nudibranch.")
			public static String[] nudiBiomes = new String[] { "OCEAN", };
			
		    @Config.Name("Nudibranch generation probability")
		    @Config.Comment("Probability for spawning Nudibranch.")
			public static int nudiRate = 10;
}