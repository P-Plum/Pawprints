package plum.pawprints.entity.render.butterfly;

import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import plum.pawprints.entity.butterfly.EntityPussMoth;
import plum.pawprints.entity.model.butterfly.ModelPussMoth;

@SideOnly(Side.CLIENT)
public class RenderPussMoth extends RenderLiving<EntityPussMoth>
{
	public static final ResourceLocation BABY_TEXTURES = new ResourceLocation("pawprints", "textures/pussmoth_caterpillar.png");
	public static final ResourceLocation ADULT_TEXTURES = new ResourceLocation("pawprints", "textures/pussmoth_moth.png");
	
	public RenderPussMoth(RenderManager manager)
	{
		super(manager, new ModelPussMoth(), 0.075F);
	}
	
	@Override
	protected ResourceLocation getEntityTexture(EntityPussMoth entity)
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
	protected void applyRotations(EntityPussMoth entityLiving, float p_77043_2_, float rotationYaw, float partialTicks)
	{
		super.applyRotations(entityLiving, p_77043_2_, rotationYaw, partialTicks);
	}
	
	@Override
    public float prepareScale(EntityPussMoth entitylivingbaseIn, float partialTicks)
    {
		GlStateManager.scale(0.35F, 0.35F, 0.35F);
        return super.prepareScale(entitylivingbaseIn, partialTicks);
    }
}
