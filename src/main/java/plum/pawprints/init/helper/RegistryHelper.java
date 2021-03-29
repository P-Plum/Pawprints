package plum.pawprints.init.helper;

import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeDictionary.Type;
import net.minecraftforge.fml.common.registry.EntityRegistry;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class RegistryHelper
{


	public static class Entities
	{

		public static void addSpawn(Class<? extends EntityLiving> entityClass, int weightedProb, int min, int max, EnumCreatureType typeOfCreature, Biome... biomes)
		{
			if (max <= 0 || weightedProb <= 0)
				return;

			EntityRegistry.addSpawn(entityClass, weightedProb, Math.min(min, max), Math.max(min, max), typeOfCreature, biomes);
		}

		/** Helper to copy spawn of creature A to a creature B */
		public static void copySpawns(Class<? extends EntityLiving> classToAdd, EnumCreatureType creatureTypeToAdd, Class<? extends EntityLiving> classToCopy, EnumCreatureType creatureTypeToCopy)
		{
			for (final Biome biome : ForgeRegistries.BIOMES)
				biome.getSpawnableList(creatureTypeToCopy).stream().filter(entry -> entry.entityClass == classToCopy).findFirst().ifPresent(spawnListEntry -> biome.getSpawnableList(creatureTypeToAdd).add(new Biome.SpawnListEntry(classToAdd, spawnListEntry.itemWeight, spawnListEntry.minGroupCount, spawnListEntry.maxGroupCount)));
		}

		public static Biome[] getBiomes(BiomeDictionary.Type type)
		{
			return BiomeDictionary.getBiomes(type).stream().toArray(Biome[]::new);
		}
	}
	
	public static Type[] getBiomeTypes(String[] types)
	{
		Type[] bt = new Type[types.length];
		for (int i = 0; i < types.length; i++)
		{
			String s = types[i].toUpperCase();
			bt[i] = Type.getType(s);
		}

		return bt;
	}
}