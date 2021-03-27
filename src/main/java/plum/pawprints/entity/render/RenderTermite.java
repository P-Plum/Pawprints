package plum.pawprints.entity.render;

import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import plum.pawprints.entity.EntityTermite;
import plum.pawprints.entity.model.ModelTermite;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

@SideOnly(Side.CLIENT)
public class RenderTermite extends GeoEntityRenderer<EntityTermite>
{
	public RenderTermite(RenderManager manager)
	{
		super(manager, new ModelTermite());
		this.shadowSize = 0.055F; //change to the desired shadow size.
	}
	
	@Override
	protected void applyRotations(EntityTermite entityLiving, float p_77043_2_, float rotationYaw, float partialTicks)
	{
		super.applyRotations(entityLiving, p_77043_2_, rotationYaw, partialTicks);
	}
	
	@Override
	public void renderEarly(EntityTermite animatable, float ticks, float red, float green, float blue, float partialTicks)
	{
		GlStateManager.scale(0.15F, 0.15F, 0.15F);
	}
}