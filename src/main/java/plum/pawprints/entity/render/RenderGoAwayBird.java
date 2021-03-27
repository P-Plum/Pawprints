package plum.pawprints.entity.render;

import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import plum.pawprints.entity.EntityGoAwayBird;
import plum.pawprints.entity.model.ModelGoAwayBird;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

@SideOnly(Side.CLIENT)
public class RenderGoAwayBird extends GeoEntityRenderer<EntityGoAwayBird>
{
	public RenderGoAwayBird(RenderManager manager)
	{
		super(manager, new ModelGoAwayBird());
		this.shadowSize = 0.2F;
	}
	
	@Override
	protected void applyRotations(EntityGoAwayBird entityLiving, float p_77043_2_, float rotationYaw, float partialTicks)
	{
		super.applyRotations(entityLiving, p_77043_2_, rotationYaw, partialTicks);
	}
	
	@Override
	public void renderEarly(EntityGoAwayBird animatable, float ticks, float red, float green, float blue, float partialTicks)
	{
		GlStateManager.scale(0.4F, 0.4F, 0.4F);
	}
}