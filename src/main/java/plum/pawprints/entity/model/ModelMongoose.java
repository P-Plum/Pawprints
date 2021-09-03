// Made with Blockbench 3.6.6
// Exported for Minecraft version 1.12.2 or 1.15.2 (same format for both) for entity models animated with GeckoLib
// Paste this class into your mod and follow the documentation for GeckoLib to use animations. You can find the documentation here: https://github.com/bernie-g/geckolib
// Blockbench plugin created by Gecko
package plum.pawprints.entity.model;

import javax.annotation.Nullable;

import net.minecraft.util.ResourceLocation;
import plum.pawprints.entity.EntityMongoose;
import plum.pawprints.util.Reference;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;
import software.bernie.geckolib3.core.processor.IBone;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class ModelMongoose extends AnimatedGeoModel<EntityMongoose>
{
	
    @Override
    public ResourceLocation getModelLocation(EntityMongoose object)
    {
        return new ResourceLocation(Reference.MODID, "geo/mongoose.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(EntityMongoose entity) {
        return null;
    }
    
    @Override
    public void setLivingAnimations(EntityMongoose entity, Integer uniqueID, @Nullable AnimationEvent customPredicate) {
        super.setLivingAnimations(entity, uniqueID, customPredicate);
        if (entity.isChild()) {
        	IBone root = this.getAnimationProcessor().getBone("body");
            root.setScaleX(0.5f);
            root.setScaleY(0.5f);
            root.setScaleZ(0.5f);
            root.setPositionY(-4.5f);
        }
    }

    @Override
    public ResourceLocation getAnimationFileLocation(EntityMongoose object)
    {
        return new ResourceLocation(Reference.MODID, "animations/mongooseentity.json");
    }
}