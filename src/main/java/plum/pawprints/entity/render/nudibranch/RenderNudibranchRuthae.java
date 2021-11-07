package plum.pawprints.entity.render.nudibranch;

import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import plum.pawprints.entity.model.nudibranch.ModelNudibranchRuthae;
import plum.pawprints.entity.nudibranch.EntityNudibranchRuthae;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

@SideOnly(Side.CLIENT)
public class RenderNudibranchRuthae extends GeoEntityRenderer<EntityNudibranchRuthae>
{
	public RenderNudibranchRuthae(RenderManager manager)
	{
		super(manager, new ModelNudibranchRuthae());
		this.shadowSize = 0.075F; //change to the desired shadow size.
	}
	
	@Override
	protected void applyRotations(EntityNudibranchRuthae entityLiving, float p_77043_2_, float rotationYaw, float partialTicks)
	{
		super.applyRotations(entityLiving, p_77043_2_, rotationYaw, partialTicks);
	}
	
	@Override
	public void renderEarly(EntityNudibranchRuthae entity, float ticks, float red, float green, float blue, float partialTicks)
	{
		GlStateManager.scale(0.25F, 0.25F, 0.25F);
		
		if (entity.isBesideClimbableBlock()) {
			GlStateManager.rotate(90, 1, 0, 0);
			GlStateManager.translate(0F, -0.4F, -0.5F);
		}
	}
}