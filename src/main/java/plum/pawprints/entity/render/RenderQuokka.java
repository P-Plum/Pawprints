package plum.pawprints.entity.render;

import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import plum.pawprints.entity.EntityQuokka;
import plum.pawprints.entity.model.ModelQuokka;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

@SideOnly(Side.CLIENT)
public class RenderQuokka extends GeoEntityRenderer<EntityQuokka>
{
	public RenderQuokka(RenderManager manager)
	{
		super(manager, new ModelQuokka());
		this.shadowSize = 0.2F; //change to the desired shadow size.
	}
	
	@Override
	protected void applyRotations(EntityQuokka entityLiving, float p_77043_2_, float rotationYaw, float partialTicks)
	{
		super.applyRotations(entityLiving, p_77043_2_, rotationYaw, partialTicks);
	}
	
	@Override
	public void renderEarly(EntityQuokka animatable, float ticks, float red, float green, float blue, float partialTicks)
	{
		GlStateManager.scale(0.55F, 0.55F, 0.55F);
	}
}