package plum.pawprints.entity.render;

import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import plum.pawprints.entity.EntityVinegaroon;
import plum.pawprints.entity.model.ModelVinegaroon;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

@SideOnly(Side.CLIENT)
public class RenderVinegaroon extends GeoEntityRenderer<EntityVinegaroon>
{
    
    public RenderVinegaroon(RenderManager manager)
	{
		super(manager, new ModelVinegaroon());
		this.shadowSize = 0.1F; //change to the desired shadow size.
	}
	
	@Override
	protected void applyRotations(EntityVinegaroon entityLiving, float p_77043_2_, float rotationYaw, float partialTicks)
	{
		super.applyRotations(entityLiving, p_77043_2_, rotationYaw, partialTicks);
	}
	
	@Override
	public void renderEarly(EntityVinegaroon animatable, float ticks, float red, float green, float blue, float partialTicks)
	{
		GlStateManager.scale(0.4F, 0.4F, 0.4F);
	}
}