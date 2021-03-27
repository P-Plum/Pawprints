package plum.pawprints.entity.render;

import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import plum.pawprints.entity.EntityLowlandPaca;
import plum.pawprints.entity.model.ModelLowlandPaca;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

@SideOnly(Side.CLIENT)
public class RenderLowlandPaca extends GeoEntityRenderer<EntityLowlandPaca>
{
	public RenderLowlandPaca(RenderManager manager)
	{
		super(manager, new ModelLowlandPaca());
		this.shadowSize = 0.3F; //change to the desired shadow size.
	}
	
	@Override
	protected void applyRotations(EntityLowlandPaca entityLiving, float p_77043_2_, float rotationYaw, float partialTicks)
	{
		super.applyRotations(entityLiving, p_77043_2_, rotationYaw, partialTicks);
	}
	
	@Override
	public void renderEarly(EntityLowlandPaca animatable, float ticks, float red, float green, float blue, float partialTicks)
	{
		GlStateManager.scale(0.55F, 0.55F, 0.55F);
	}
}