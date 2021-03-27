package plum.pawprints.entity.render;

import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import plum.pawprints.entity.EntityMongoose;
import plum.pawprints.entity.model.ModelMongoose;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

@SideOnly(Side.CLIENT)
public class RenderMongoose extends GeoEntityRenderer<EntityMongoose>
{
	
	private static final ResourceLocation BANDED = new ResourceLocation("pawprints", "textures/banded_mongoose.png");
    private static final ResourceLocation INDIAN = new ResourceLocation("pawprints", "textures/indian_grey_mongoose.png");
    private static final ResourceLocation MALAGASY = new ResourceLocation("pawprints", "textures/malagasy_mongoose.png");
    private static final ResourceLocation MARSH = new ResourceLocation("pawprints", "textures/marsh_mongoose.png");
    private static final ResourceLocation RINGTAILED = new ResourceLocation("pawprints", "textures/ring_tailed_vontsira.png");
    private static final ResourceLocation YELLOW = new ResourceLocation("pawprints", "textures/yellow_mongoose.png");
	
	public RenderMongoose(RenderManager manager)
	{
		super(manager, new ModelMongoose());
		this.shadowSize = 0.15F; //change to the desired shadow size.
	}
	
	public ResourceLocation getEntityTexture(EntityMongoose entity)
    {
        switch (entity.getSkin())
        {
            case 0:
            default:
                return BANDED;
            case 1:
                return INDIAN;
            case 2:
                return MALAGASY;
            case 3:
                return MARSH;
            case 4:
                return RINGTAILED;
            case 5:
                return YELLOW;
        }
    }
	
	@Override
	protected void applyRotations(EntityMongoose entityLiving, float p_77043_2_, float rotationYaw, float partialTicks)
	{
		super.applyRotations(entityLiving, p_77043_2_, rotationYaw, partialTicks);
	}
	
	@Override
	public void renderEarly(EntityMongoose animatable, float ticks, float red, float green, float blue, float partialTicks)
	{
		GlStateManager.scale(0.35F, 0.35F, 0.35F);
	}
}