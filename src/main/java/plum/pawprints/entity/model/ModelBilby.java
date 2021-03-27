// Made with Blockbench 3.6.6
// Exported for Minecraft version 1.12.2 or 1.15.2 (same format for both) for entity models animated with GeckoLib
// Paste this class into your mod and follow the documentation for GeckoLib to use animations. You can find the documentation here: https://github.com/bernie-g/geckolib
// Blockbench plugin created by Gecko
package plum.pawprints.entity.model;

import javax.annotation.Nullable;

import net.minecraft.util.ResourceLocation;
import plum.pawprints.entity.EntityBilby;
import plum.pawprints.util.Reference;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;
import software.bernie.geckolib3.core.processor.IBone;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class ModelBilby extends AnimatedGeoModel<EntityBilby>
{
    @Override
    public ResourceLocation getModelLocation(EntityBilby object)
    {
        return new ResourceLocation(Reference.MODID, "geo/bilby.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(EntityBilby object)
    {
        return new ResourceLocation(Reference.MODID, "textures/bilby.png");
    }

    @Override
    public ResourceLocation getAnimationFileLocation(EntityBilby object)
    {
        return new ResourceLocation(Reference.MODID, "animations/bilbyentity.json");
    }
    
    @Override
    public void setLivingAnimations(EntityBilby entity, Integer uniqueID, @Nullable AnimationEvent customPredicate) {
        super.setLivingAnimations(entity, uniqueID, customPredicate);
        if (entity.isChild()) {
        	IBone root = this.getAnimationProcessor().getBone("bodyneck");
            root.setScaleX(0.5f);
            root.setScaleY(0.5f);
            root.setScaleZ(0.5f);
            
            IBone thigh1 = this.getAnimationProcessor().getBone("thigh1");
            thigh1.setScaleX(0.5f);
            thigh1.setScaleY(0.5f);
            thigh1.setScaleZ(0.5f);
            
            IBone thigh2 = this.getAnimationProcessor().getBone("thigh2");
            thigh2.setScaleX(0.5f);
            thigh2.setScaleY(0.5f);
            thigh2.setScaleZ(0.5f);
            
            IBone thigh3 = this.getAnimationProcessor().getBone("thigh3");
            thigh3.setScaleX(0.5f);
            thigh3.setScaleY(0.5f);
            thigh3.setScaleZ(0.5f);
            
            IBone thigh4 = this.getAnimationProcessor().getBone("thigh4");
            thigh4.setScaleX(0.5f);
            thigh4.setScaleY(0.5f);
            thigh4.setScaleZ(0.5f);
        }
    }
}