package plum.pawprints.util.handlers;

import net.minecraftforge.fml.client.registry.RenderingRegistry;
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
import plum.pawprints.entity.butterfly.EntityDaintyButterfly;
import plum.pawprints.entity.butterfly.EntityDeathsMoth;
import plum.pawprints.entity.butterfly.EntityLunaMoth;
import plum.pawprints.entity.butterfly.EntityOldWorldButterfly;
import plum.pawprints.entity.butterfly.EntityOrangeOakleafButterfly;
import plum.pawprints.entity.butterfly.EntityPaperKiteButterfly;
import plum.pawprints.entity.butterfly.EntityPussMoth;
import plum.pawprints.entity.butterfly.EntitySunsetMoth;
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
import plum.pawprints.entity.render.RenderAmericanPika;
import plum.pawprints.entity.render.RenderBilby;
import plum.pawprints.entity.render.RenderFerretBadger;
import plum.pawprints.entity.render.RenderFrilledLizard;
import plum.pawprints.entity.render.RenderGoAwayBird;
import plum.pawprints.entity.render.RenderIliPika;
import plum.pawprints.entity.render.RenderLowlandPaca;
import plum.pawprints.entity.render.RenderMongoose;
import plum.pawprints.entity.render.RenderPinkfairy;
import plum.pawprints.entity.render.RenderQuokka;
import plum.pawprints.entity.render.RenderTenrec;
import plum.pawprints.entity.render.RenderTermite;
import plum.pawprints.entity.render.butterfly.RenderDaintyButterfly;
import plum.pawprints.entity.render.butterfly.RenderDeathsMoth;
import plum.pawprints.entity.render.butterfly.RenderLunaMoth;
import plum.pawprints.entity.render.butterfly.RenderOldWorldButterfly;
import plum.pawprints.entity.render.butterfly.RenderOrangeOakleafButterfly;
import plum.pawprints.entity.render.butterfly.RenderPaperKiteButterfly;
import plum.pawprints.entity.render.butterfly.RenderPussMoth;
import plum.pawprints.entity.render.butterfly.RenderSunsetMoth;
import plum.pawprints.entity.render.nudibranch.RenderNudibranchAnnae;
import plum.pawprints.entity.render.nudibranch.RenderNudibranchAnnulata;
import plum.pawprints.entity.render.nudibranch.RenderNudibranchBullocki;
import plum.pawprints.entity.render.nudibranch.RenderNudibranchCristata;
import plum.pawprints.entity.render.nudibranch.RenderNudibranchKuniei;
import plum.pawprints.entity.render.nudibranch.RenderNudibranchKuroshimae;
import plum.pawprints.entity.render.nudibranch.RenderNudibranchPacifica;
import plum.pawprints.entity.render.nudibranch.RenderNudibranchParva;
import plum.pawprints.entity.render.nudibranch.RenderNudibranchRuthae;
import plum.pawprints.entity.render.nudibranch.RenderNudibranchSinuata;

public class RenderHandler
{
	public static void registerEntityRenders()
	{
		
		RenderingRegistry.registerEntityRenderingHandler(EntityBilby.class, RenderBilby::new);
		RenderingRegistry.registerEntityRenderingHandler(EntityPinkfairy.class, RenderPinkfairy::new);
		RenderingRegistry.registerEntityRenderingHandler(EntityQuokka.class, RenderQuokka::new);
		RenderingRegistry.registerEntityRenderingHandler(EntityTermite.class, RenderTermite::new);
		RenderingRegistry.registerEntityRenderingHandler(EntityGoAwayBird.class, RenderGoAwayBird::new);
		RenderingRegistry.registerEntityRenderingHandler(EntityFerretBadger.class, RenderFerretBadger::new);
		RenderingRegistry.registerEntityRenderingHandler(EntityLowlandPaca.class, RenderLowlandPaca::new);
		RenderingRegistry.registerEntityRenderingHandler(EntityAmericanPika.class, RenderAmericanPika::new);
		RenderingRegistry.registerEntityRenderingHandler(EntityIliPika.class, RenderIliPika::new);
		RenderingRegistry.registerEntityRenderingHandler(EntityFrilledLizard.class, RenderFrilledLizard::new);
		RenderingRegistry.registerEntityRenderingHandler(EntityTenrec.class, RenderTenrec::new);
		RenderingRegistry.registerEntityRenderingHandler(EntityMongoose.class, RenderMongoose::new);
		
		//Butterfly
		RenderingRegistry.registerEntityRenderingHandler(EntityLunaMoth.class, RenderLunaMoth::new);
		RenderingRegistry.registerEntityRenderingHandler(EntityPussMoth.class, RenderPussMoth::new);
		RenderingRegistry.registerEntityRenderingHandler(EntityDeathsMoth.class, RenderDeathsMoth::new);
		RenderingRegistry.registerEntityRenderingHandler(EntitySunsetMoth.class, RenderSunsetMoth::new);
		RenderingRegistry.registerEntityRenderingHandler(EntityDaintyButterfly.class, RenderDaintyButterfly::new);
		RenderingRegistry.registerEntityRenderingHandler(EntityOldWorldButterfly.class, RenderOldWorldButterfly::new);
		RenderingRegistry.registerEntityRenderingHandler(EntityPaperKiteButterfly.class, RenderPaperKiteButterfly::new);
		RenderingRegistry.registerEntityRenderingHandler(EntityOrangeOakleafButterfly.class, RenderOrangeOakleafButterfly::new);
		
		//Nudibranch
		RenderingRegistry.registerEntityRenderingHandler(EntityNudibranchAnnae.class, RenderNudibranchAnnae::new);
		RenderingRegistry.registerEntityRenderingHandler(EntityNudibranchSinuata.class, RenderNudibranchSinuata::new);
		RenderingRegistry.registerEntityRenderingHandler(EntityNudibranchAnnulata.class, RenderNudibranchAnnulata::new);
		RenderingRegistry.registerEntityRenderingHandler(EntityNudibranchBullocki.class, RenderNudibranchBullocki::new);
		RenderingRegistry.registerEntityRenderingHandler(EntityNudibranchKuniei.class, RenderNudibranchKuniei::new);
		RenderingRegistry.registerEntityRenderingHandler(EntityNudibranchKuroshimae.class, RenderNudibranchKuroshimae::new);
		RenderingRegistry.registerEntityRenderingHandler(EntityNudibranchCristata.class, RenderNudibranchCristata::new);
		RenderingRegistry.registerEntityRenderingHandler(EntityNudibranchPacifica.class, RenderNudibranchPacifica::new);
		RenderingRegistry.registerEntityRenderingHandler(EntityNudibranchParva.class, RenderNudibranchParva::new);
		RenderingRegistry.registerEntityRenderingHandler(EntityNudibranchRuthae.class, RenderNudibranchRuthae::new);
	}
}

