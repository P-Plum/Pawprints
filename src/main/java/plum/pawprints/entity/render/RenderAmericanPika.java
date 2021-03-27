package plum.pawprints.entity.render;

import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import plum.pawprints.entity.EntityAmericanPika;
import plum.pawprints.entity.model.ModelAmericanPika;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

@SideOnly(Side.CLIENT)
public class RenderAmericanPika extends GeoEntityRenderer<EntityAmericanPika>
{
	public RenderAmericanPika(RenderManager manager)
	{
		super(manager, new ModelAmericanPika());
		this.shadowSize = 0.075F; //change to the desired shadow size.
	}
	
	@Override
	protected void applyRotations(EntityAmericanPika entityLiving, float p_77043_2_, float rotationYaw, float partialTicks)
	{
		super.applyRotations(entityLiving, p_77043_2_, rotationYaw, partialTicks);
	}
	
	@Override
	public void renderEarly(EntityAmericanPika animatable, float ticks, float red, float green, float blue, float partialTicks)
	{
		GlStateManager.scale(0.3F, 0.3F, 0.3F);
	}
}