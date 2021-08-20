package plum.pawprints.entity.render;

import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import plum.pawprints.entity.EntityHermitCrab;
import plum.pawprints.entity.model.ModelHermitCrab;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

@SideOnly(Side.CLIENT)
public class RenderHermitCrab extends GeoEntityRenderer<EntityHermitCrab>
{
	
	private static final ResourceLocation STRAWBERRYCONE = new ResourceLocation("pawprints", "textures/coenobitaperlatus_coneshell.png");
    private static final ResourceLocation STRAWBERRYTURBO = new ResourceLocation("pawprints", "textures/coenobitaperlatus_turboshell.png");
    private static final ResourceLocation REDSEACONE = new ResourceLocation("pawprints", "textures/coenobitascaevola_coneshell.png");
    private static final ResourceLocation REDSEATURBO = new ResourceLocation("pawprints", "textures/coenobitascaevola_turboshell.png");
    private static final ResourceLocation BLUEBERRYCONE = new ResourceLocation("pawprints", "textures/coenobitapurpureus_coneshell.png");
    private static final ResourceLocation BLUEBERRYTURBO = new ResourceLocation("pawprints", "textures/coenobitapurpureus_turboshell.png");
    
    public RenderHermitCrab(RenderManager manager)
	{
		super(manager, new ModelHermitCrab());
		this.shadowSize = 0.15F; //change to the desired shadow size.
	}
	
	@Override
	public ResourceLocation getEntityTexture(EntityHermitCrab entity)
    {
        switch (entity.getSkin())
        {
            case 0:
            default:
                return STRAWBERRYCONE;
            case 1:
                return STRAWBERRYTURBO;
            case 2:
                return REDSEACONE;
            case 3:
                return REDSEATURBO;
            case 4:
                return BLUEBERRYCONE;
            case 5:
                return BLUEBERRYTURBO;
        }
    }

	@Override
	protected void applyRotations(EntityHermitCrab entityLiving, float p_77043_2_, float rotationYaw, float partialTicks)
	{
		super.applyRotations(entityLiving, p_77043_2_, rotationYaw, partialTicks);
	}
	
	@Override
	public void renderEarly(EntityHermitCrab animatable, float ticks, float red, float green, float blue, float partialTicks)
	{
		GlStateManager.scale(0.35F, 0.35F, 0.35F);
	}
}