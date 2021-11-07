package plum.pawprints.entity.model.butterfly;

import javax.annotation.Nullable;

import net.minecraft.util.ResourceLocation;
import plum.pawprints.entity.butterfly.EntityDaintyButterfly;
import plum.pawprints.util.Reference;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;
import software.bernie.geckolib3.core.processor.IBone;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class ModelDaintyButterfly extends AnimatedGeoModel<EntityDaintyButterfly> {
	
	@Override
    public ResourceLocation getModelLocation(EntityDaintyButterfly object)
    {
        if (object.isChild()) {
            return new ResourceLocation(Reference.MODID, "geo/caterpillar/daintyswallowtail.geo.json");
        } else {
        	return new ResourceLocation(Reference.MODID, "geo/butterfly.geo.json");
        }
    }

    @Override
    public ResourceLocation getTextureLocation(EntityDaintyButterfly object)
    {
    	if (object.isChild()) {
            return new ResourceLocation(Reference.MODID, "textures/daintyswallowtail_caterpillar.png");
        } else {
            return new ResourceLocation(Reference.MODID, "textures/daintyswallowtail_butterfly.png");
        }
    }

    @Override
    public ResourceLocation getAnimationFileLocation(EntityDaintyButterfly object)
    {
    	if (object.isChild()) {
            return new ResourceLocation(Reference.MODID, "animations/caterpillar.json");
        } else {
            return new ResourceLocation(Reference.MODID, "animations/butterflyentity.json");
        }
    }

    @Override
    public void setLivingAnimations(EntityDaintyButterfly entity, Integer uniqueID, @Nullable AnimationEvent customPredicate) {
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