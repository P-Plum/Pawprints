package plum.pawprints.entity.model;

import javax.annotation.Nullable;

import net.minecraft.util.ResourceLocation;
import plum.pawprints.entity.EntitySeriema;
import plum.pawprints.util.Reference;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;
import software.bernie.geckolib3.core.processor.IBone;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class ModelSeriema extends AnimatedGeoModel<EntitySeriema> {
	
	@Override
    public ResourceLocation getModelLocation(EntitySeriema object)
    {
        if (object.isFlying() || !object.onGround) {
            return new ResourceLocation(Reference.MODID, "geo/seriemafly.geo.json");
        }
        return new ResourceLocation(Reference.MODID, "geo/seriema.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(EntitySeriema object)
    {
        if (object.isFlying() || !object.onGround) {
            return new ResourceLocation(Reference.MODID, "textures/seriemafly.png");
        } else {
            return new ResourceLocation(Reference.MODID, "textures/seriema.png");}
    }

    @Override
    public ResourceLocation getAnimationFileLocation(EntitySeriema object)
    {
        if (object.isFlying() || !object.onGround) {
            return new ResourceLocation(Reference.MODID, "animations/seriemaflyentity.json");
        }
        return new ResourceLocation(Reference.MODID, "animations/seriemaentity.json");
    }

    @Override
    public void setLivingAnimations(EntitySeriema entity, Integer uniqueID, @Nullable AnimationEvent customPredicate) {
        super.setLivingAnimations(entity, uniqueID, customPredicate);
        if (entity.isChild()) {
        	IBone root = this.getAnimationProcessor().getBone("root");
            root.setScaleX(0.5f);
            root.setScaleY(0.5f);
            root.setScaleZ(0.5f);
            root.setPositionY(-11.5f);
        }
    }
}