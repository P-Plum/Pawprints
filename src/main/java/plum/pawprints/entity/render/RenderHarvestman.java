package plum.pawprints.entity.render;

import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import plum.pawprints.entity.EntityHarvestman;
import plum.pawprints.entity.model.ModelHarvestman;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

@SideOnly(Side.CLIENT)
public class RenderHarvestman extends GeoEntityRenderer<EntityHarvestman>
{
	
	private static final ResourceLocation COMMON = new ResourceLocation("pawprints", "textures/harvestman_common.png");
	private static final ResourceLocation BUNNY = new ResourceLocation("pawprints", "textures/harvestman_bunny.png");
    
    public RenderHarvestman(RenderManager manager)
	{
		super(manager, new ModelHarvestman());
		this.shadowSize = 0.1F; //change to the desired shadow size.
	}
	
	@Override
	public ResourceLocation getEntityTexture(EntityHarvestman entity)
    {
        switch (entity.getSkin())
        {
            case 0:
            default:
                return COMMON;
            case 1:
                return BUNNY;
        }
    }

	@Override
	protected void applyRotations(EntityHarvestman entityLiving, float p_77043_2_, float rotationYaw, float partialTicks)
	{
		super.applyRotations(entityLiving, p_77043_2_, rotationYaw, partialTicks);
	}
	
	@Override
	public void renderEarly(EntityHarvestman animatable, float ticks, float red, float green, float blue, float partialTicks)
	{
		GlStateManager.scale(0.2F, 0.2F, 0.2F);
	}
}