package plum.pawprints.util.handlers;

import net.minecraftforge.fml.client.registry.RenderingRegistry;
import plum.pawprints.entity.EntityAmericanPika;
import plum.pawprints.entity.EntityBilby;
import plum.pawprints.entity.EntityFerretBadger;
import plum.pawprints.entity.EntityFrilledLizard;
import plum.pawprints.entity.EntityGoAwayBird;
import plum.pawprints.entity.EntityIliPika;
import plum.pawprints.entity.EntityLowlandPaca;
import plum.pawprints.entity.EntityTermite;
import plum.pawprints.entity.butterfly.EntityLunaMoth;
import plum.pawprints.entity.render.RenderAmericanPika;
import plum.pawprints.entity.render.RenderBilby;
import plum.pawprints.entity.render.RenderFerretBadger;
import plum.pawprints.entity.render.RenderFrilledLizard;
import plum.pawprints.entity.render.RenderGoAwayBird;
import plum.pawprints.entity.render.RenderIliPika;
import plum.pawprints.entity.render.RenderLowlandPaca;
import plum.pawprints.entity.render.RenderTermite;
import plum.pawprints.entity.render.butterfly.RenderLunaMoth;

public class RenderHandler
{
	public static void registerEntityRenders()
	{
		
		RenderingRegistry.registerEntityRenderingHandler(EntityBilby.class, RenderBilby::new);
		RenderingRegistry.registerEntityRenderingHandler(EntityTermite.class, RenderTermite::new);
		RenderingRegistry.registerEntityRenderingHandler(EntityGoAwayBird.class, RenderGoAwayBird::new);
		RenderingRegistry.registerEntityRenderingHandler(EntityFerretBadger.class, RenderFerretBadger::new);
		RenderingRegistry.registerEntityRenderingHandler(EntityLowlandPaca.class, RenderLowlandPaca::new);
		RenderingRegistry.registerEntityRenderingHandler(EntityAmericanPika.class, RenderAmericanPika::new);
		RenderingRegistry.registerEntityRenderingHandler(EntityIliPika.class, RenderIliPika::new);
		RenderingRegistry.registerEntityRenderingHandler(EntityFrilledLizard.class, RenderFrilledLizard::new);
		
		//Butterfly
		RenderingRegistry.registerEntityRenderingHandler(EntityLunaMoth.class, RenderLunaMoth::new);
		
		//Nudibranch
	}
}

