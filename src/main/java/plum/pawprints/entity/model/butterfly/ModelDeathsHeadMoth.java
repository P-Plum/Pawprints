package plum.pawprints.entity.model.butterfly;

import javax.annotation.Nullable;

import net.minecraft.util.ResourceLocation;
import plum.pawprints.entity.butterfly.EntityDeathsHeadMoth;
import plum.pawprints.util.Reference;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;
import software.bernie.geckolib3.core.processor.IBone;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class ModelDeathsHeadMoth extends AnimatedGeoModel<EntityDeathsHeadMoth> {
	
	@Override
    public ResourceLocation getModelLocation(EntityDeathsHeadMoth object)
    {
        if (object.isChild()) {
            return new ResourceLocation(Reference.MODID, "geo/caterpillar/deathshead.geo.json");
        } else {
        	return new ResourceLocation(Reference.MODID, "geo/moth.geo.json");
        }
    }

    @Override
    public ResourceLocation getTextureLocation(EntityDeathsHeadMoth object)
    {
    	if (object.isChild()) {
            return new ResourceLocation(Reference.MODID, "textures/deathshead_caterpillar.png");
        } else {
            return new ResourceLocation(Reference.MODID, "textures/deathshead_moth.png");
        }
    }

    @Override
    public ResourceLocation getAnimationFileLocation(EntityDeathsHeadMoth object)
    {
    	if (object.isChild()) {
            return new ResourceLocation(Reference.MODID, "animations/caterpillar.json");
        } else {
            return new ResourceLocation(Reference.MODID, "animations/mothentity.json");
        }
    }

    @Override
    public void setLivingAnimations(EntityDeathsHeadMoth entity, Integer uniqueID, @Nullable AnimationEvent customPredicate) {
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