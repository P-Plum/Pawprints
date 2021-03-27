package plum.pawprints.util.handlers;

import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import plum.pawprints.util.Reference;

public class SoundHandler {
	
	public static SoundEvent ENTITY_GOAWAYBIRD_AMBIENT;
	public static SoundEvent ENTITY_BILBY_AMBIENT;
	public static SoundEvent ENTITY_FERRETBADGER_AMBIENT;
	public static SoundEvent ENTITY_PIKA_AMBIENT;
	public static SoundEvent ENTITY_TENREC_AMBIENT;
	public static SoundEvent ENTITY_PACA_AMBIENT;
	public static SoundEvent ENTITY_PACA_HURT;
	
	public static void registerSounds()
	{
		ENTITY_GOAWAYBIRD_AMBIENT = registerSound("entity.goawaybird.ambient");
		ENTITY_BILBY_AMBIENT = registerSound("entity.bilby.ambient");
		ENTITY_FERRETBADGER_AMBIENT = registerSound("entity.ferretbadger.ambient");
		ENTITY_PIKA_AMBIENT = registerSound("entity.pika.ambient");
		ENTITY_TENREC_AMBIENT = registerSound("entity.tenrec.ambient");
		ENTITY_PACA_AMBIENT = registerSound("entity.lowlandpaca.ambient");
		ENTITY_PACA_HURT = registerSound("entity.lowlandpaca.hurt");
	}
    
	private static SoundEvent registerSound(String name)
	{
		ResourceLocation location = new ResourceLocation(Reference.MODID, name);
		SoundEvent event = new SoundEvent(location);
		event.setRegistryName(name);
		ForgeRegistries.SOUND_EVENTS.register(event);
		return event;
	}
}