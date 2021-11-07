package plum.pawprints.entity.render.butterfly;

import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import plum.pawprints.entity.butterfly.EntityOrangeOakleafButterfly;
import plum.pawprints.entity.model.butterfly.ModelOrangeOakleafButterfly;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

@SideOnly(Side.CLIENT)
public class RenderOrangeOakleafButterfly extends GeoEntityRenderer<EntityOrangeOakleafButterfly>
{
	public RenderOrangeOakleafButterfly(RenderManager manager)
	{
		super(manager, new ModelOrangeOakleafButterfly());
		this.shadowSize = 0.2F;
	}
	
	@Override
	protected void applyRotations(EntityOrangeOakleafButterfly entityLiving, float p_77043_2_, float rotationYaw, float partialTicks)
	{
		super.applyRotations(entityLiving, p_77043_2_, rotationYaw, partialTicks);
	}
	
	@Override
	public void renderEarly(EntityOrangeOakleafButterfly animatable, float ticks, float red, float green, float blue, float partialTicks)
	{
		if(animatable.isChild()) {
			GlStateManager.scale(0.35F, 0.35F, 0.35F);
		} else {
		GlStateManager.scale(0.35F, 0.35F, 0.35F);
		}
	}
}