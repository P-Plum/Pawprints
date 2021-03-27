package plum.pawprints.entity.render;

import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import plum.pawprints.entity.EntityFerretBadger;
import plum.pawprints.entity.model.ModelFerretBadger;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

@SideOnly(Side.CLIENT)
public class RenderFerretBadger extends GeoEntityRenderer<EntityFerretBadger>
{
	
	private static final ResourceLocation JAVAN = new ResourceLocation("pawprints", "textures/javanferretbadger.png");
    private static final ResourceLocation CHINESE = new ResourceLocation("pawprints", "textures/chineseferretbadger.png");
    private static final ResourceLocation BURMESE = new ResourceLocation("pawprints", "textures/burmeseferretbadger.png");
	
	public RenderFerretBadger(RenderManager manager)
	{
		super(manager, new ModelFerretBadger());
		this.shadowSize = 0.2F; //change to the desired shadow size.
	}
	
	public ResourceLocation getEntityTexture(EntityFerretBadger entity)
    {
        switch (entity.getSkin())
        {
            case 0:
            default:
                return CHINESE;
            case 1:
                return JAVAN;
            case 2:
                return BURMESE;
        }
    }
	
	@Override
	protected void applyRotations(EntityFerretBadger entityLiving, float p_77043_2_, float rotationYaw, float partialTicks)
	{
		super.applyRotations(entityLiving, p_77043_2_, rotationYaw, partialTicks);
	}
	
	@Override
	public void renderEarly(EntityFerretBadger animatable, float ticks, float red, float green, float blue, float partialTicks)
	{
		GlStateManager.scale(0.35F, 0.35F, 0.35F);
	}
}