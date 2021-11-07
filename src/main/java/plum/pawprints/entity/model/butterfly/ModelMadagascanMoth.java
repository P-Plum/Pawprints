package plum.pawprints.entity.model.butterfly;

import javax.annotation.Nullable;

import net.minecraft.util.ResourceLocation;
import plum.pawprints.entity.butterfly.EntityMadagascanMoth;
import plum.pawprints.util.Reference;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;
import software.bernie.geckolib3.core.processor.IBone;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class ModelMadagascanMoth extends AnimatedGeoModel<EntityMadagascanMoth> {
	
	@Override
    public ResourceLocation getModelLocation(EntityMadagascanMoth object)
    {
        if (object.isChild()) {
            return new ResourceLocation(Reference.MODID, "geo/caterpillar/madagascan.geo.json");
        } else {
        	return new ResourceLocation(Reference.MODID, "geo/moth.geo.json");
        }
    }

    @Override
    public ResourceLocation getTextureLocation(EntityMadagascanMoth object)
    {
    	if (object.isChild()) {
            return new ResourceLocation(Reference.MODID, "textures/madagascan_caterpillar.png");
        } else {
            return new ResourceLocation(Reference.MODID, "textures/madagascan_moth.png");
        }
    }

    @Override
    public ResourceLocation getAnimationFileLocation(EntityMadagascanMoth object)
    {
    	if (object.isChild()) {
            return new ResourceLocation(Reference.MODID, "animations/caterpillar.json");
        } else {
            return new ResourceLocation(Reference.MODID, "animations/mothentity.json");
        }
    }

    @Override
    public void setLivingAnimations(EntityMadagascanMoth entity, Integer uniqueID, @Nullable AnimationEvent customPredicate) {
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