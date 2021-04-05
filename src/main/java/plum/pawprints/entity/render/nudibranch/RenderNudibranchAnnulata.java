package plum.pawprints.entity.render.nudibranch;

import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import plum.pawprints.entity.model.nudibranch.ModelNudibranchAnnulata;
import plum.pawprints.entity.nudibranch.EntityNudibranchAnnulata;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

@SideOnly(Side.CLIENT)
public class RenderNudibranchAnnulata extends GeoEntityRenderer<EntityNudibranchAnnulata>
{
	public RenderNudibranchAnnulata(RenderManager manager)
	{
		super(manager, new ModelNudibranchAnnulata());
		this.shadowSize = 0.075F; //change to the desired shadow size.
	}
	
	@Override
	protected void applyRotations(EntityNudibranchAnnulata entityLiving, float p_77043_2_, float rotationYaw, float partialTicks)
	{
		super.applyRotations(entityLiving, p_77043_2_, rotationYaw, partialTicks);
	}
	
	@Override
	public void renderEarly(EntityNudibranchAnnulata animatable, float ticks, float red, float green, float blue, float partialTicks)
	{
		GlStateManager.scale(0.25F, 0.25F, 0.25F);
	}
}