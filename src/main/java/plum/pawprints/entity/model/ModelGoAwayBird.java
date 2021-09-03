// Made with Blockbench 3.6.6
// Exported for Minecraft version 1.12.2 or 1.15.2 (same format for both) for entity models animated with GeckoLib
// Paste this class into your mod and follow the documentation for GeckoLib to use animations. You can find the documentation here: https://github.com/bernie-g/geckolib
// Blockbench plugin created by Gecko
package plum.pawprints.entity.model;

import javax.annotation.Nullable;

import net.minecraft.util.ResourceLocation;
import plum.pawprints.entity.EntityGoAwayBird;
import plum.pawprints.util.Reference;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;
import software.bernie.geckolib3.core.processor.IBone;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class ModelGoAwayBird extends AnimatedGeoModel<EntityGoAwayBird>
{
    @Override
    public ResourceLocation getModelLocation(EntityGoAwayBird object)
    {
        return new ResourceLocation(Reference.MODID, "geo/goawaybird.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(EntityGoAwayBird object)
    {
        return new ResourceLocation(Reference.MODID, "textures/goawaybird.png");
    }

    @Override
    public ResourceLocation getAnimationFileLocation(EntityGoAwayBird object)
    {
        return new ResourceLocation(Reference.MODID, "animations/goawaybirdentity.json");
    }
    
    @Override
    public void setLivingAnimations(EntityGoAwayBird entity, Integer uniqueID, @Nullable AnimationEvent customPredicate) {
        super.setLivingAnimations(entity, uniqueID, customPredicate);
        if (entity.isChild()) {
        	IBone root = this.getAnimationProcessor().getBone("body");
            root.setScaleX(0.5f);
            root.setScaleY(0.5f);
            root.setScaleZ(0.5f);
            root.setPositionY(-4f);
        }
    }
}