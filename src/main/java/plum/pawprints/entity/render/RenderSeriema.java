package plum.pawprints.entity.render;

import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import plum.pawprints.entity.EntitySeriema;
import plum.pawprints.entity.model.ModelSeriema;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

@SideOnly(Side.CLIENT)
public class RenderSeriema extends GeoEntityRenderer<EntitySeriema>
{
	public RenderSeriema(RenderManager manager)
	{
		super(manager, new ModelSeriema());
		this.shadowSize = 0.2F;
	}
	
	@Override
	protected void applyRotations(EntitySeriema entityLiving, float p_77043_2_, float rotationYaw, float partialTicks)
	{
		super.applyRotations(entityLiving, p_77043_2_, rotationYaw, partialTicks);
	}
	
	@Override
	public void renderEarly(EntitySeriema animatable, float ticks, float red, float green, float blue, float partialTicks)
	{
		GlStateManager.scale(0.55F, 0.55F, 0.55F);
	}
}