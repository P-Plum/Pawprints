package plum.pawprints.entity.render;

import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import plum.pawprints.entity.EntityPinkfairy;
import plum.pawprints.entity.model.ModelPinkfairy;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

@SideOnly(Side.CLIENT)
public class RenderPinkfairy extends GeoEntityRenderer<EntityPinkfairy>
{
	public RenderPinkfairy(RenderManager manager)
	{
		super(manager, new ModelPinkfairy());
		this.shadowSize = 0.15F; //change to the desired shadow size.
	}
	
	@Override
	protected void applyRotations(EntityPinkfairy entityLiving, float p_77043_2_, float rotationYaw, float partialTicks)
	{
		super.applyRotations(entityLiving, p_77043_2_, rotationYaw, partialTicks);
	}
	
	@Override
	public void renderEarly(EntityPinkfairy animatable, float ticks, float red, float green, float blue, float partialTicks)
	{
		GlStateManager.scale(0.25F, 0.25F, 0.25F);
	}
}