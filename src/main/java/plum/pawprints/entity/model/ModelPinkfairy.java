// Made with Blockbench 3.6.6
// Exported for Minecraft version 1.12.2 or 1.15.2 (same format for both) for entity models animated with GeckoLib
// Paste this class into your mod and follow the documentation for GeckoLib to use animations. You can find the documentation here: https://github.com/bernie-g/geckolib
// Blockbench plugin created by Gecko
package plum.pawprints.entity.model;

import javax.annotation.Nullable;

import net.minecraft.util.ResourceLocation;
import plum.pawprints.entity.EntityPinkfairy;
import plum.pawprints.util.Reference;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;
import software.bernie.geckolib3.core.processor.IBone;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class ModelPinkfairy extends AnimatedGeoModel<EntityPinkfairy>
{
    @Override
    public ResourceLocation getModelLocation(EntityPinkfairy object)
    {
        return new ResourceLocation(Reference.MODID, "geo/pinkfairy.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(EntityPinkfairy object)
    {
        return new ResourceLocation(Reference.MODID, "textures/fairy.png");
    }

    @Override
    public ResourceLocation getAnimationFileLocation(EntityPinkfairy object)
    {
        return new ResourceLocation(Reference.MODID, "animations/pinkfairyentity.json");
    }
    
    @Override
    public void setLivingAnimations(EntityPinkfairy entity, Integer uniqueID, @Nullable AnimationEvent customPredicate) {
        super.setLivingAnimations(entity, uniqueID, customPredicate);
        if (entity.isChild()) {
        	IBone root = this.getAnimationProcessor().getBone("bigbodyfront");
            root.setScaleX(0.5f);
            root.setScaleY(0.5f);
            root.setScaleZ(0.5f);
            
            IBone thigh1 = this.getAnimationProcessor().getBone("thighleftfront");
            thigh1.setScaleX(0.5f);
            thigh1.setScaleY(0.5f);
            thigh1.setScaleZ(0.5f);
            
            IBone thigh2 = this.getAnimationProcessor().getBone("thighleftback");
            thigh2.setScaleX(0.5f);
            thigh2.setScaleY(0.5f);
            thigh2.setScaleZ(0.5f);
            
            IBone thigh3 = this.getAnimationProcessor().getBone("thighrightfront");
            thigh3.setScaleX(0.5f);
            thigh3.setScaleY(0.5f);
            thigh3.setScaleZ(0.5f);
            
            IBone thigh4 = this.getAnimationProcessor().getBone("thighrightback");
            thigh4.setScaleX(0.5f);
            thigh4.setScaleY(0.5f);
            thigh4.setScaleZ(0.5f);
            
            IBone tailbase = this.getAnimationProcessor().getBone("tailbase");
            tailbase.setScaleX(0.5f);
            tailbase.setScaleY(0.5f);
            tailbase.setScaleZ(0.5f);
            
            IBone neckfur = this.getAnimationProcessor().getBone("neckfur");
            neckfur.setScaleX(0.5f);
            neckfur.setScaleY(0.5f);
            neckfur.setScaleZ(0.5f);
            
            IBone head = this.getAnimationProcessor().getBone("head");
            head.setScaleX(0.5f);
            head.setScaleY(0.5f);
            head.setScaleZ(0.5f);
        }
    }
}