package plum.pawprints.entity.render;

import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import plum.pawprints.entity.EntityTenrec;
import plum.pawprints.entity.model.ModelTenrec;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

@SideOnly(Side.CLIENT)
public class RenderTenrec extends GeoEntityRenderer<EntityTenrec>
{
	
	private static final ResourceLocation LOWLAND = new ResourceLocation("pawprints", "textures/lowland_streaked_tenrec.png");
    private static final ResourceLocation HIGHLAND = new ResourceLocation("pawprints", "textures/highland_streaked_tenrec.png");
    private static final ResourceLocation TAILLESS = new ResourceLocation("pawprints", "textures/tailless_tenrec.png");
    private static final ResourceLocation HEDGEHOG = new ResourceLocation("pawprints", "textures/lesser_hedgehog_tenrec.png");
    
    public RenderTenrec(RenderManager manager)
	{
		super(manager, new ModelTenrec());
		this.shadowSize = 0.2F; //change to the desired shadow size.
	}
	
	@Override
	public ResourceLocation getEntityTexture(EntityTenrec entity)
    {
        switch (entity.getSkin())
        {
            case 0:
            default:
                return LOWLAND;
            case 1:
                return HIGHLAND;
            case 2:
                return TAILLESS;
            case 3:
                return HEDGEHOG;
        }
    }

	@Override
	protected void applyRotations(EntityTenrec entityLiving, float p_77043_2_, float rotationYaw, float partialTicks)
	{
		super.applyRotations(entityLiving, p_77043_2_, rotationYaw, partialTicks);
	}
	
	@Override
	public void renderEarly(EntityTenrec animatable, float ticks, float red, float green, float blue, float partialTicks)
	{
		GlStateManager.scale(0.35F, 0.35F, 0.35F);
	}
}