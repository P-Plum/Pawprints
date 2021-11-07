package plum.pawprints.entity.model.butterfly;

import javax.annotation.Nullable;

import net.minecraft.util.ResourceLocation;
import plum.pawprints.entity.butterfly.EntityOrangeOakleafButterfly;
import plum.pawprints.util.Reference;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;
import software.bernie.geckolib3.core.processor.IBone;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class ModelOrangeOakleafButterfly extends AnimatedGeoModel<EntityOrangeOakleafButterfly> {
	
	@Override
    public ResourceLocation getModelLocation(EntityOrangeOakleafButterfly object)
    {
        if (object.isChild()) {
            return new ResourceLocation(Reference.MODID, "geo/caterpillar/orangeoakleaf.geo.json");
        } else {
        	return new ResourceLocation(Reference.MODID, "geo/butterfly.geo.json");
        }
    }

    @Override
    public ResourceLocation getTextureLocation(EntityOrangeOakleafButterfly object)
    {
    	if (object.isChild()) {
            return new ResourceLocation(Reference.MODID, "textures/orangeoakleaf_caterpillar.png");
        } else {
            return new ResourceLocation(Reference.MODID, "textures/orangeoakleaf_butterfly.png");
        }
    }

    @Override
    public ResourceLocation getAnimationFileLocation(EntityOrangeOakleafButterfly object)
    {
    	if (object.isChild()) {
            return new ResourceLocation(Reference.MODID, "animations/caterpillar.json");
        } else {
            return new ResourceLocation(Reference.MODID, "animations/butterflyentity.json");
        }
    }

    @Override
    public void setLivingAnimations(EntityOrangeOakleafButterfly entity, Integer uniqueID, @Nullable AnimationEvent customPredicate) {
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