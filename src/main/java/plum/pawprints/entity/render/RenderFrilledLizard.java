package plum.pawprints.entity.render;

import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import plum.pawprints.entity.EntityFrilledLizard;
import plum.pawprints.entity.model.ModelFrilledLizard;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

@SideOnly(Side.CLIENT)
public class RenderFrilledLizard extends GeoEntityRenderer<EntityFrilledLizard>
{
	public RenderFrilledLizard(RenderManager manager)
	{
		super(manager, new ModelFrilledLizard());
		this.shadowSize = 0.075F; //change to the desired shadow size.
	}
	
	@Override
	protected void applyRotations(EntityFrilledLizard entityLiving, float p_77043_2_, float rotationYaw, float partialTicks)
	{
		super.applyRotations(entityLiving, p_77043_2_, rotationYaw, partialTicks);
	}
	
	@Override
	public void renderEarly(EntityFrilledLizard animatable, float ticks, float red, float green, float blue, float partialTicks)
	{
		GlStateManager.scale(0.6F, 0.6F, 0.6F);
	}
}