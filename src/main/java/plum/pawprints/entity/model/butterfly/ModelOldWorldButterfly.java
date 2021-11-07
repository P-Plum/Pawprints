package plum.pawprints.entity.model.butterfly;

import javax.annotation.Nullable;

import net.minecraft.util.ResourceLocation;
import plum.pawprints.entity.butterfly.EntityOldWorldButterfly;
import plum.pawprints.util.Reference;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;
import software.bernie.geckolib3.core.processor.IBone;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class ModelOldWorldButterfly extends AnimatedGeoModel<EntityOldWorldButterfly> {
	
	@Override
    public ResourceLocation getModelLocation(EntityOldWorldButterfly object)
    {
        if (object.isChild()) {
            return new ResourceLocation(Reference.MODID, "geo/caterpillar/oldworldswallowtail.geo.json");
        } else {
        	return new ResourceLocation(Reference.MODID, "geo/butterfly.geo.json");
        }
    }

    @Override
    public ResourceLocation getTextureLocation(EntityOldWorldButterfly object)
    {
    	if (object.isChild()) {
            return new ResourceLocation(Reference.MODID, "textures/oldworldswallowtail_caterpillar.png");
        } else {
            return new ResourceLocation(Reference.MODID, "textures/oldworldswallowtail_butterfly.png");
        }
    }

    @Override
    public ResourceLocation getAnimationFileLocation(EntityOldWorldButterfly object)
    {
    	if (object.isChild()) {
            return new ResourceLocation(Reference.MODID, "animations/caterpillar.json");
        } else {
            return new ResourceLocation(Reference.MODID, "animations/butterflyentity.json");
        }
    }

    @Override
    public void setLivingAnimations(EntityOldWorldButterfly entity, Integer uniqueID, @Nullable AnimationEvent customPredicate) {
        super.setLivingAnimations(entity, uniqueID, customPredicate);
        if (entity.isChild()) {
        	IBone root = this.getAnimationProcessor().getBone("body");
            root.setScaleX(0.5f);
            root.setScaleY(0.5f);
            root.setScaleZ(0.5f);
            root.setPositionY(-0.3f);
        }
    }
}