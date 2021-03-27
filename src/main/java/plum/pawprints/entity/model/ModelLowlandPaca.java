// Made with Blockbench 3.6.6
// Exported for Minecraft version 1.12.2 or 1.15.2 (same format for both) for entity models animated with GeckoLib
// Paste this class into your mod and follow the documentation for GeckoLib to use animations. You can find the documentation here: https://github.com/bernie-g/geckolib
// Blockbench plugin created by Gecko
package plum.pawprints.entity.model;

import javax.annotation.Nullable;

import net.minecraft.util.ResourceLocation;
import plum.pawprints.entity.EntityLowlandPaca;
import plum.pawprints.util.Reference;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;
import software.bernie.geckolib3.core.processor.IBone;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class ModelLowlandPaca extends AnimatedGeoModel<EntityLowlandPaca>
{
    @Override
    public ResourceLocation getModelLocation(EntityLowlandPaca object)
    {
        return new ResourceLocation(Reference.MODID, "geo/lowlandpaca.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(EntityLowlandPaca object)
    {
        return new ResourceLocation(Reference.MODID, "textures/lowlandpaca.png");
    }

    @Override
    public ResourceLocation getAnimationFileLocation(EntityLowlandPaca object)
    {
        return new ResourceLocation(Reference.MODID, "animations/lowlandpacaentity.json");
    }
    
    @Override
    public void setLivingAnimations(EntityLowlandPaca entity, Integer uniqueID, @Nullable AnimationEvent customPredicate) {
        super.setLivingAnimations(entity, uniqueID, customPredicate);
        if (entity.isChild()) {
        	IBone root = this.getAnimationProcessor().getBone("body");
            root.setScaleX(0.7f);
            root.setScaleY(0.7f);
            root.setScaleZ(0.7f);
        }
    }
}