package plum.pawprints.entity.render;

import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import plum.pawprints.entity.EntityJumpingSpider;
import plum.pawprints.entity.model.ModelJumpingSpider;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

@SideOnly(Side.CLIENT)
public class RenderJumpingSpider extends GeoEntityRenderer<EntityJumpingSpider>
{
	
	private static final ResourceLocation BOLD = new ResourceLocation("pawprints", "textures/jumpingspider_bold.png");
	private static final ResourceLocation GREENFEMALE = new ResourceLocation("pawprints", "textures/jumpingspider_greenfemale.png");
	private static final ResourceLocation GREENMALE = new ResourceLocation("pawprints", "textures/jumpingspider_greenmale.png");
	private static final ResourceLocation GREYWALL = new ResourceLocation("pawprints", "textures/jumpingspider_greywall.png");
	private static final ResourceLocation GRISEUSFEMALE = new ResourceLocation("pawprints", "textures/jumpingspider_griseusfemale.png");
	private static final ResourceLocation GRISEUSMALE = new ResourceLocation("pawprints", "textures/jumpingspider_griseusmale.png");
	private static final ResourceLocation KATAOKAI = new ResourceLocation("pawprints", "textures/jumpingspider_kataokai.png");
	private static final ResourceLocation LESSERTI = new ResourceLocation("pawprints", "textures/jumpingspider_lesserti.png");
	private static final ResourceLocation MASKED = new ResourceLocation("pawprints", "textures/jumpingspider_masked.png");
	private static final ResourceLocation MASSIVE = new ResourceLocation("pawprints", "textures/jumpingspider_massive.png");
	private static final ResourceLocation NEMO = new ResourceLocation("pawprints", "textures/jumpingspider_nemo.png");
	private static final ResourceLocation NIGROMACULATUS = new ResourceLocation("pawprints", "textures/jumpingspider_nigromaculatus.png");
	private static final ResourceLocation SIMAETHA = new ResourceLocation("pawprints", "textures/jumpingspider_simaetha.png");
	private static final ResourceLocation VOLANS = new ResourceLocation("pawprints", "textures/jumpingspider_volans.png");
	private static final ResourceLocation WASP = new ResourceLocation("pawprints", "textures/jumpingspider_wasp.png");
    
    public RenderJumpingSpider(RenderManager manager)
	{
		super(manager, new ModelJumpingSpider());
		this.shadowSize = 0.1F; //change to the desired shadow size.
	}
	
	@Override
	public ResourceLocation getEntityTexture(EntityJumpingSpider entity)
    {
        switch (entity.getSkin())
        {
            case 0:
            default:
                return BOLD;
            case 1:
                return GREENFEMALE;
            case 2:
                return GREENMALE;
            case 3:
                return GREYWALL;
            case 4:
                return GRISEUSFEMALE;
            case 5:
                return GRISEUSMALE;
            case 6:
                return KATAOKAI;
            case 7:
                return LESSERTI;
            case 8:
                return MASKED;
            case 9:
                return MASSIVE;
            case 10:
                return NEMO;
            case 11:
                return NIGROMACULATUS;
            case 12:
                return SIMAETHA;
            case 13:
                return VOLANS;
            case 14:
                return WASP;
        }
    }

	@Override
	protected void applyRotations(EntityJumpingSpider entityLiving, float p_77043_2_, float rotationYaw, float partialTicks)
	{
		super.applyRotations(entityLiving, p_77043_2_, rotationYaw, partialTicks);
	}
	
	@Override
	public void renderEarly(EntityJumpingSpider animatable, float ticks, float red, float green, float blue, float partialTicks)
	{
		GlStateManager.scale(0.15F, 0.15F, 0.15F);
	}
}