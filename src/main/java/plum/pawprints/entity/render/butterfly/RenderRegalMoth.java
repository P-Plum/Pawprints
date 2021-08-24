package plum.pawprints.entity.render.butterfly;

import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import plum.pawprints.entity.butterfly.EntityRegalMoth;
import plum.pawprints.entity.model.butterfly.ModelRegalMoth;

@SideOnly(Side.CLIENT)
public class RenderRegalMoth extends RenderLiving<EntityRegalMoth>
{
	public static final ResourceLocation BABY_TEXTURES = new ResourceLocation("pawprints", "textures/regalmoth_caterpillar.png");
	public static final ResourceLocation ADULT_TEXTURES = new ResourceLocation("pawprints", "textures/regalmoth_moth.png");
	
	public RenderRegalMoth(RenderManager manager)
	{
		super(manager, new ModelRegalMoth(), 0.075F);
	}
	
	@Override
	protected ResourceLocation getEntityTexture(EntityRegalMoth entity)
	{
		if(entity.isChild())
		{
			return BABY_TEXTURES;
		}
		else
		{
			return ADULT_TEXTURES;
		}
	}
	
	@Override
	protected void applyRotations(EntityRegalMoth entityLiving, float p_77043_2_, float rotationYaw, float partialTicks)
	{
		super.applyRotations(entityLiving, p_77043_2_, rotationYaw, partialTicks);
	}
	
	@Override
    public float prepareScale(EntityRegalMoth entitylivingbaseIn, float partialTicks)
    {
		GlStateManager.scale(0.35F, 0.35F, 0.35F);
        return super.prepareScale(entitylivingbaseIn, partialTicks);
    }
}
