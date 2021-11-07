package plum.pawprints.entity.model;

import javax.annotation.Nullable;

import net.minecraft.util.ResourceLocation;
import plum.pawprints.entity.EntityGoAwayBird;
import plum.pawprints.util.Reference;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;
import software.bernie.geckolib3.core.processor.IBone;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class ModelGoAwayBird extends AnimatedGeoModel<EntityGoAwayBird> {
	
	@Override
    public ResourceLocation getModelLocation(EntityGoAwayBird object)
    {
        if (object.isFlying() || !object.onGround) {
            return new ResourceLocation(Reference.MODID, "geo/goawaybirdfly.geo.json");
        }
        return new ResourceLocation(Reference.MODID, "geo/goawaybird.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(EntityGoAwayBird object)
    {
        if (object.isFlying() || !object.onGround) {
            return new ResourceLocation(Reference.MODID, "textures/goawaybirdfly.png");
        } else {
            return new ResourceLocation(Reference.MODID, "textures/goawaybird.png");}
    }

    @Override
    public ResourceLocation getAnimationFileLocation(EntityGoAwayBird object)
    {
        if (object.isFlying() || !object.onGround) {
            return new ResourceLocation(Reference.MODID, "animations/goawaybirdflyentity.json");
        }
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