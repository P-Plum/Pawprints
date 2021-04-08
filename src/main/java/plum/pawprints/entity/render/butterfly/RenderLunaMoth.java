package plum.pawprints.entity.render.butterfly;

import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import plum.pawprints.entity.butterfly.EntityLunaMoth;
import plum.pawprints.entity.model.butterfly.ModelLunaMoth;

@SideOnly(Side.CLIENT)
public class RenderLunaMoth extends RenderLiving<EntityLunaMoth>
{
	public static final ResourceLocation BABY_TEXTURES = new ResourceLocation("pawprints", "textures/combinedcaterpillar.png");
	public static final ResourceLocation ADULT_TEXTURES = new ResourceLocation("pawprints", "textures/combinedmoth.png");
	
	public RenderLunaMoth(RenderManager manager)
	{
		super(manager, new ModelLunaMoth(), 0.075F);
	}
	
	@Override
	protected ResourceLocation getEntityTexture(EntityLunaMoth entity)
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
	protected void applyRotations(EntityLunaMoth entityLiving, float p_77043_2_, float rotationYaw, float partialTicks)
	{
		super.applyRotations(entityLiving, p_77043_2_, rotationYaw, partialTicks);
	}
	
	@Override
    public float prepareScale(EntityLunaMoth entitylivingbaseIn, float partialTicks)
    {
		GlStateManager.scale(0.35F, 0.35F, 0.35F);
        return super.prepareScale(entitylivingbaseIn, partialTicks);
    }
}
