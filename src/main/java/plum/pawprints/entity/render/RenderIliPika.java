package plum.pawprints.entity.render;

import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import plum.pawprints.entity.EntityIliPika;
import plum.pawprints.entity.model.ModelIliPika;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

@SideOnly(Side.CLIENT)
public class RenderIliPika extends GeoEntityRenderer<EntityIliPika>
{
	public RenderIliPika(RenderManager manager)
	{
		super(manager, new ModelIliPika());
		this.shadowSize = 0.075F; //change to the desired shadow size.
	}
	
	@Override
	protected void applyRotations(EntityIliPika entityLiving, float p_77043_2_, float rotationYaw, float partialTicks)
	{
		super.applyRotations(entityLiving, p_77043_2_, rotationYaw, partialTicks);
	}
	
	@Override
	public void renderEarly(EntityIliPika animatable, float ticks, float red, float green, float blue, float partialTicks)
	{
		GlStateManager.scale(0.3F, 0.3F, 0.3F);
	}
}