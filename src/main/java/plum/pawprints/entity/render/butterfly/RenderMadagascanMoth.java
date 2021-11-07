package plum.pawprints.entity.render.butterfly;

import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import plum.pawprints.entity.butterfly.EntityMadagascanMoth;
import plum.pawprints.entity.model.butterfly.ModelMadagascanMoth;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

@SideOnly(Side.CLIENT)
public class RenderMadagascanMoth extends GeoEntityRenderer<EntityMadagascanMoth>
{
	public RenderMadagascanMoth(RenderManager manager)
	{
		super(manager, new ModelMadagascanMoth());
		this.shadowSize = 0.2F;
	}
	
	@Override
	protected void applyRotations(EntityMadagascanMoth entityLiving, float p_77043_2_, float rotationYaw, float partialTicks)
	{
		super.applyRotations(entityLiving, p_77043_2_, rotationYaw, partialTicks);
	}
	
	@Override
	public void renderEarly(EntityMadagascanMoth animatable, float ticks, float red, float green, float blue, float partialTicks)
	{
		if(animatable.isChild()) {
			GlStateManager.scale(0.35F, 0.35F, 0.35F);
		} else {
		GlStateManager.scale(0.35F, 0.35F, 0.35F);
		}
	}
}