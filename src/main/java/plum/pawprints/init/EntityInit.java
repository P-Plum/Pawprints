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
import plum.pawprints.configuration.PawprintsSpawnConfig;
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
import plum.pawprints.entity.nudibranch.EntityNudibranchAnnae;
import plum.pawprints.entity.nudibranch.EntityNudibranchAnnulata;
import plum.pawprints.entity.nudibranch.EntityNudibranchBullocki;
import plum.pawprints.entity.nudibranch.EntityNudibranchCristata;
import plum.pawprints.entity.nudibranch.EntityNudibranchKuniei;
import plum.pawprints.entity.nudibranch.EntityNudibranchKuroshimae;
import plum.pawprints.entity.nudibranch.EntityNudibranchPacifica;
import plum.pawprints.entity.nudibranch.EntityNudibranchParva;
import plum.pawprints.entity.nudibranch.EntityNudibranchRuthae;
import plum.pawprints.entity.nudibranch.EntityNudibranchSinuata;
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
				EntityRegistry.registerModEntity(new ResourceLocation(Reference.MODID, "nudibranchannae"),EntityNudibranchAnnae.class, "nudibranchannae", id++, main.instance, 1024, 1, true);
				EntityRegistry.registerModEntity(new ResourceLocation(Reference.MODID, "nudibranchsinuata"),EntityNudibranchSinuata.class, "nudibranchsinuata", id++, main.instance, 1024, 1, true);
				EntityRegistry.registerModEntity(new ResourceLocation(Reference.MODID, "nudibranchannulata"),EntityNudibranchAnnulata.class, "nudibranchannulata", id++, main.instance, 1024, 1, true);
				EntityRegistry.registerModEntity(new ResourceLocation(Reference.MODID, "nudibranchbullocki"),EntityNudibranchBullocki.class, "nudibranchbullocki", id++, main.instance, 1024, 1, true);
				EntityRegistry.registerModEntity(new ResourceLocation(Reference.MODID, "nudibranchkuniei"),EntityNudibranchKuniei.class, "nudibranchkuniei", id++, main.instance, 1024, 1, true);
				EntityRegistry.registerModEntity(new ResourceLocation(Reference.MODID, "nudibranchkuroshimae"),EntityNudibranchKuroshimae.class, "nudibranchkuroshimae", id++, main.instance, 1024, 1, true);
				EntityRegistry.registerModEntity(new ResourceLocation(Reference.MODID, "nudibranchcristata"),EntityNudibranchCristata.class, "nudibranchcristata", id++, main.instance, 1024, 1, true);
				EntityRegistry.registerModEntity(new ResourceLocation(Reference.MODID, "nudibranchpacifica"),EntityNudibranchPacifica.class, "nudibranchpacifica", id++, main.instance, 1024, 1, true);
				EntityRegistry.registerModEntity(new ResourceLocation(Reference.MODID, "nudibranchparva"),EntityNudibranchParva.class, "nudibranchparva", id++, main.instance, 1024, 1, true);
				EntityRegistry.registerModEntity(new ResourceLocation(Reference.MODID, "nudibranchruthae"),EntityNudibranchRuthae.class, "nudibranchruthae", id++, main.instance, 1024, 1, true);
				
				
				//Butterflies
				EntityRegistry.registerModEntity(new ResourceLocation(Reference.MODID, "mothluna"),EntityLunaMoth.class, "mothluna", id++, main.instance, 1024, 1, true, 10280346, 15790320);
				
				
				//Spawns
				if (PawprintsSpawnConfig.bilbySpawns)
				{
					for (Type t : RegistryHelper.getBiomeTypes(PawprintsSpawnConfig.bilbyBiomes))
					{
						RegistryHelper.Entities.addSpawn(EntityBilby.class, PawprintsSpawnConfig.bilbyRate, 1, 2, EnumCreatureType.CREATURE, getBiomes(t));
					}
				}
				
				if (PawprintsSpawnConfig.fairySpawns)
				{
					for (Type t : RegistryHelper.getBiomeTypes(PawprintsSpawnConfig.fairyBiomes))
					{
						RegistryHelper.Entities.addSpawn(EntityPinkfairy.class, PawprintsSpawnConfig.fairyRate, 1, 1, EnumCreatureType.CREATURE, getBiomes(t));
					}
				}
				
				if (PawprintsSpawnConfig.quokkaSpawns)
				{
					for (Type t : RegistryHelper.getBiomeTypes(PawprintsSpawnConfig.quokkaBiomes))
					{
						RegistryHelper.Entities.addSpawn(EntityQuokka.class, PawprintsSpawnConfig.quokkaRate, 2, 3, EnumCreatureType.CREATURE, getBiomes(t));
					}
				}
				
				if (PawprintsSpawnConfig.goawaybirdSpawns)
				{
					for (Type t : RegistryHelper.getBiomeTypes(PawprintsSpawnConfig.goawaybirdBiomes))
					{
						RegistryHelper.Entities.addSpawn(EntityGoAwayBird.class, PawprintsSpawnConfig.goawaybirdRate, 2, 3, EnumCreatureType.CREATURE, getBiomes(t));
					}
				}
				
				if (PawprintsSpawnConfig.ferretbadgerSpawns)
				{
					for (Type t : RegistryHelper.getBiomeTypes(PawprintsSpawnConfig.ferretbadgerBiomes))
					{
						RegistryHelper.Entities.addSpawn(EntityFerretBadger.class, PawprintsSpawnConfig.ferretbadgerRate, 2, 2, EnumCreatureType.CREATURE, getBiomes(t));
					}
				}
				
				if (PawprintsSpawnConfig.amerpikaSpawns)
				{
					for (Type t : RegistryHelper.getBiomeTypes(PawprintsSpawnConfig.amerpikaBiomes))
					{
						RegistryHelper.Entities.addSpawn(EntityAmericanPika.class, PawprintsSpawnConfig.amerpikaRate, 1, 1, EnumCreatureType.CREATURE, getBiomes(t));
					}
				}
				
				if (PawprintsSpawnConfig.ilipikaSpawns)
				{
					for (Type t : RegistryHelper.getBiomeTypes(PawprintsSpawnConfig.ilipikaBiomes))
					{
						RegistryHelper.Entities.addSpawn(EntityIliPika.class, PawprintsSpawnConfig.ilipikaRate, 1, 1, EnumCreatureType.CREATURE, getBiomes(t));
					}
				}
				
				if (PawprintsSpawnConfig.frilledSpawns)
				{
					for (Type t : RegistryHelper.getBiomeTypes(PawprintsSpawnConfig.frilledBiomes))
					{
						RegistryHelper.Entities.addSpawn(EntityFrilledLizard.class, PawprintsSpawnConfig.frilledRate, 1, 2, EnumCreatureType.CREATURE, getBiomes(t));
					}
				}
				
				if (PawprintsSpawnConfig.tenrecSpawns)
				{
					for (Type t : RegistryHelper.getBiomeTypes(PawprintsSpawnConfig.tenrecBiomes))
					{
						RegistryHelper.Entities.addSpawn(EntityTenrec.class, PawprintsSpawnConfig.tenrecRate, 2, 3, EnumCreatureType.CREATURE, getBiomes(t));
					}
				}
				
				if (PawprintsSpawnConfig.mongooseSpawns)
				{
					for (Type t : RegistryHelper.getBiomeTypes(PawprintsSpawnConfig.mongooseBiomes))
					{
						RegistryHelper.Entities.addSpawn(EntityMongoose.class, PawprintsSpawnConfig.mongooseRate, 1, 2, EnumCreatureType.CREATURE, getBiomes(t));
					}
				}
				
				if (PawprintsSpawnConfig.pacaSpawns)
				{
					for (Type t : RegistryHelper.getBiomeTypes(PawprintsSpawnConfig.pacaBiomes))
					{
						RegistryHelper.Entities.addSpawn(EntityLowlandPaca.class, PawprintsSpawnConfig.pacaRate, 1, 2, EnumCreatureType.CREATURE, getBiomes(t));
					}
				}
				
				if (PawprintsSpawnConfig.nudiSpawns)
				{
					for (Type t : RegistryHelper.getBiomeTypes(PawprintsSpawnConfig.nudiBiomes))
					{
						RegistryHelper.Entities.addSpawn(EntityNudibranchAnnae.class, PawprintsSpawnConfig.nudiRate, 1, 1, EnumCreatureType.CREATURE, getBiomes(t));
						RegistryHelper.Entities.addSpawn(EntityNudibranchAnnulata.class, PawprintsSpawnConfig.nudiRate, 1, 1, EnumCreatureType.CREATURE, getBiomes(t));
						RegistryHelper.Entities.addSpawn(EntityNudibranchBullocki.class, PawprintsSpawnConfig.nudiRate, 1, 1, EnumCreatureType.CREATURE, getBiomes(t));
						RegistryHelper.Entities.addSpawn(EntityNudibranchCristata.class, PawprintsSpawnConfig.nudiRate, 1, 1, EnumCreatureType.CREATURE, getBiomes(t));
						RegistryHelper.Entities.addSpawn(EntityNudibranchKuniei.class, PawprintsSpawnConfig.nudiRate, 1, 1, EnumCreatureType.CREATURE, getBiomes(t));
						RegistryHelper.Entities.addSpawn(EntityNudibranchKuroshimae.class, PawprintsSpawnConfig.nudiRate, 1, 1, EnumCreatureType.CREATURE, getBiomes(t));
						RegistryHelper.Entities.addSpawn(EntityNudibranchPacifica.class, PawprintsSpawnConfig.nudiRate, 1, 1, EnumCreatureType.CREATURE, getBiomes(t));
						RegistryHelper.Entities.addSpawn(EntityNudibranchParva.class, PawprintsSpawnConfig.nudiRate, 1, 1, EnumCreatureType.CREATURE, getBiomes(t));
						RegistryHelper.Entities.addSpawn(EntityNudibranchRuthae.class, PawprintsSpawnConfig.nudiRate, 1, 1, EnumCreatureType.CREATURE, getBiomes(t));
						RegistryHelper.Entities.addSpawn(EntityNudibranchSinuata.class, PawprintsSpawnConfig.nudiRate, 1, 1, EnumCreatureType.CREATURE, getBiomes(t));
					}
				}
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