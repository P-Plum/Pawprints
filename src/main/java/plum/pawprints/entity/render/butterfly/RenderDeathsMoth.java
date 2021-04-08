package plum.pawprints.entity.render.butterfly;

import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import plum.pawprints.entity.butterfly.EntityDeathsMoth;
import plum.pawprints.entity.model.butterfly.ModelDeathsMoth;

@SideOnly(Side.CLIENT)
public class RenderDeathsMoth extends RenderLiving<EntityDeathsMoth>
{
	public static final ResourceLocation BABY_TEXTURES = new ResourceLocation("pawprints", "textures/deathshead_caterpillar.png");
	public static final ResourceLocation ADULT_TEXTURES = new ResourceLocation("pawprints", "textures/deathshead_moth.png");
	
	public RenderDeathsMoth(RenderManager manager)
	{
		super(manager, new ModelDeathsMoth(), 0.075F);
	}
	
	@Override
	protected ResourceLocation getEntityTexture(EntityDeathsMoth entity)
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
	protected void applyRotations(EntityDeathsMoth entityLiving, float p_77043_2_, float rotationYaw, float partialTicks)
	{
		super.applyRotations(entityLiving, p_77043_2_, rotationYaw, partialTicks);
	}
	
	@Override
    public float prepareScale(EntityDeathsMoth entitylivingbaseIn, float partialTicks)
    {
		GlStateManager.scale(0.35F, 0.35F, 0.35F);
        return super.prepareScale(entitylivingbaseIn, partialTicks);
    }
}
