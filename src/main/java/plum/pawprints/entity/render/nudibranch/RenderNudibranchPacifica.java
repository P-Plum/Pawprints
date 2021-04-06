package plum.pawprints.entity.render.nudibranch;

import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import plum.pawprints.entity.model.nudibranch.ModelNudibranchPacifica;
import plum.pawprints.entity.nudibranch.EntityNudibranchPacifica;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

@SideOnly(Side.CLIENT)
public class RenderNudibranchPacifica extends GeoEntityRenderer<EntityNudibranchPacifica>
{
	public RenderNudibranchPacifica(RenderManager manager)
	{
		super(manager, new ModelNudibranchPacifica());
		this.shadowSize = 0.075F; //change to the desired shadow size.
	}
	
	@Override
	protected void applyRotations(EntityNudibranchPacifica entityLiving, float p_77043_2_, float rotationYaw, float partialTicks)
	{
		super.applyRotations(entityLiving, p_77043_2_, rotationYaw, partialTicks);
	}
	
	@Override
	public void renderEarly(EntityNudibranchPacifica animatable, float ticks, float red, float green, float blue, float partialTicks)
	{
		GlStateManager.scale(0.25F, 0.25F, 0.25F);
	}
}