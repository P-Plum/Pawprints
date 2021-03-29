package plum.pawprints.init;

import java.util.List;
import java.util.Set;

import com.google.common.collect.Lists;

import net.minecraft.entity.EnumCreatureType;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.translation.I18n;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeDictionary.Type;
import net.minecraftforge.fml.common.registry.EntityRegistry;
import plum.pawprints.main;
import plum.pawprints.configuration.PawprintsConfig;
import plum.pawprints.entity.EntityAmericanPika;
import plum.pawprints.entity.EntityBilby;
import plum.pawprints.entity.EntityFerretBadger;
import plum.pawprints.entity.EntityFrilledLizard;
import plum.pawprints.entity.EntityGoAwayBird;
import plum.pawprints.entity.EntityIliPika;
import plum.pawprints.entity.EntityLowlandPaca;
import plum.pawprints.entity.EntityMongoose;
import plum.pawprints.entity.EntityPinkfairy;
import plum.pawprints.entity.EntityQuokka;
import plum.pawprints.entity.EntityTenrec;
import plum.pawprints.entity.EntityTermite;
import plum.pawprints.entity.butterfly.EntityLunaMoth;
import plum.pawprints.init.helper.RegistryHelper;
import plum.pawprints.util.Reference;

@SuppressWarnings("deprecation")
public class EntityInit {
	private static int id = 0;
	
	public static void registerEntities() {
		
		//EntityRegistry.registerModEntity(registryName, entityClass, entityName, id, mod, trackingRange, updateFrequency, sendsVelocityUpdates, eggPrimary, eggSecondary);
				EntityRegistry.registerModEntity(new ResourceLocation(Reference.MODID, "bilby"),EntityBilby.class, "bilby", id++, main.instance, 1024, 1, true, 16763855, 7297124);
				EntityRegistry.registerModEntity(new ResourceLocation(Reference.MODID, "pinkfairy"),EntityPinkfairy.class, "pinkfairy", id++, main.instance, 1024, 1, true, 16118771, 16761789);
				EntityRegistry.registerModEntity(new ResourceLocation(Reference.MODID, "quokka"),EntityQuokka.class, "quokka", id++, main.instance, 1024, 1, true, 11045000, 8154213);
				EntityRegistry.registerModEntity(new ResourceLocation(Reference.MODID, "termite"),EntityTermite.class, "termite", id++, main.instance, 1024, 1, true, 5842982, 13220778);
				EntityRegistry.registerModEntity(new ResourceLocation(Reference.MODID, "goawaybird"),EntityGoAwayBird.class, "goawaybird", id++, main.instance, 1024, 1, true, 9473943, 2303014);
				EntityRegistry.registerModEntity(new ResourceLocation(Reference.MODID, "ferretbadger"),EntityFerretBadger.class, "ferretbadger", id++, main.instance, 1024, 1, true, 7954256, 4863533);
				EntityRegistry.registerModEntity(new ResourceLocation(Reference.MODID, "lowlandpaca"),EntityLowlandPaca.class, "lowlandpaca", id++, main.instance, 1024, 1, true, 9202014, 12560531);
				EntityRegistry.registerModEntity(new ResourceLocation(Reference.MODID, "americanpika"),EntityAmericanPika.class, "americanpika", id++, main.instance, 1024, 1, true, 10788242, 9142134);
				EntityRegistry.registerModEntity(new ResourceLocation(Reference.MODID, "ilipika"),EntityIliPika.class, "ilipika", id++, main.instance, 1024, 1, true, 10655369, 4604473);
				EntityRegistry.registerModEntity(new ResourceLocation(Reference.MODID, "frilledlizard"),EntityFrilledLizard.class, "frilledlizard", id++, main.instance, 1024, 1, true, 4468774, 14398058);
				EntityRegistry.registerModEntity(new ResourceLocation(Reference.MODID, "tenrec"),EntityTenrec.class, "tenrec", id++, main.instance, 1024, 1, true, 2300701, 7227954);
				EntityRegistry.registerModEntity(new ResourceLocation(Reference.MODID, "mongoose"),EntityMongoose.class, "mongoose", id++, main.instance, 1024, 1, true, 11241075, 2499621);
				
				//Nudis
				
				
				//Butterflies
				EntityRegistry.registerModEntity(new ResourceLocation(Reference.MODID, "lunamoth"),EntityLunaMoth.class, "lunamoth", id++, main.instance, 1024, 1, true, 10280346, 15790320);
				
				
				//Spawns
				if (PawprintsConfig.Spawns.bilbySpawns)
				{
					for (Type t : RegistryHelper.getBiomeTypes(PawprintsConfig.Spawns.bilbyBiomes))
					{
						RegistryHelper.Entities.addSpawn(EntityBilby.class, PawprintsConfig.Spawns.bilbyRate, 1, 2, EnumCreatureType.CREATURE, getBiomes(t));
					}
				}
				
				/*
				EntityRegistry.addSpawn(EntityBilby.class, 2, 2, 3, EnumCreatureType.CREATURE, Biomes.SAVANNA, Biomes.SAVANNA_PLATEAU, Biomes.DESERT);
				EntityRegistry.addSpawn(EntityPinkfairy.class, 2, 1, 1, EnumCreatureType.CREATURE, Biomes.DESERT);
				EntityRegistry.addSpawn(EntityQuokka.class, 5, 3, 4, EnumCreatureType.CREATURE, Biomes.SAVANNA, Biomes.SWAMPLAND, Biomes.PLAINS);
				EntityRegistry.addSpawn(EntityTermite.class, 3, 3, 5, EnumCreatureType.CREATURE, Biomes.SAVANNA, Biomes.MUTATED_SAVANNA, Biomes.SAVANNA_PLATEAU);
				EntityRegistry.addSpawn(EntityGoAwayBird.class, 8, 2, 3, EnumCreatureType.CREATURE, Biomes.SAVANNA, Biomes.SAVANNA_PLATEAU);
				EntityRegistry.addSpawn(EntityFerretBadger.class, 7, 2, 2, EnumCreatureType.CREATURE, Biomes.FOREST, Biomes.JUNGLE, Biomes.JUNGLE_EDGE);
				EntityRegistry.addSpawn(EntityAmericanPika.class, 10, 1, 2, EnumCreatureType.CREATURE, Biomes.EXTREME_HILLS, Biomes.EXTREME_HILLS_EDGE, Biomes.EXTREME_HILLS_WITH_TREES, Biomes.MUTATED_EXTREME_HILLS, Biomes.MUTATED_EXTREME_HILLS_WITH_TREES);
				EntityRegistry.addSpawn(EntityIliPika.class, 2, 1, 2, EnumCreatureType.CREATURE, Biomes.EXTREME_HILLS, Biomes.EXTREME_HILLS_EDGE, Biomes.EXTREME_HILLS_WITH_TREES, Biomes.MUTATED_EXTREME_HILLS, Biomes.MUTATED_EXTREME_HILLS_WITH_TREES);
				EntityRegistry.addSpawn(EntityFrilledLizard.class, 6, 1, 2, EnumCreatureType.CREATURE, Biomes.SAVANNA, Biomes.DESERT);
				EntityRegistry.addSpawn(EntityTenrec.class, 8, 2, 3, EnumCreatureType.CREATURE, Biomes.SAVANNA, Biomes.JUNGLE, Biomes.JUNGLE_EDGE);
				*/
	}

	private static Biome[] getBiomes(BiomeDictionary.Type type)
	{
		List<Biome> criteriaMet = Lists.newArrayList();
		for (Biome b : Biome.REGISTRY)
		{
			Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(b);
			if (types.contains(type))
			{
				criteriaMet.add(b);
			}

		}

		if (BiomeDictionary.getBiomes(type).isEmpty())
		{
			System.out.println(type.getName() + I18n.translateToLocal("text.error.invalidbiometype"));
		}

		return criteriaMet.toArray(new Biome[criteriaMet.size()]);
	}
}