// Made with Blockbench 3.6.6
// Exported for Minecraft version 1.12.2 or 1.15.2 (same format for both) for entity models animated with GeckoLib
// Paste this class into your mod and follow the documentation for GeckoLib to use animations. You can find the documentation here: https://github.com/bernie-g/geckolib
// Blockbench plugin created by Gecko
package plum.pawprints.entity.model;

import javax.annotation.Nullable;

import net.minecraft.util.ResourceLocation;
import plum.pawprints.entity.EntityPinkfairy;
import plum.pawprints.util.Reference;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;
import software.bernie.geckolib3.core.processor.IBone;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class ModelPinkfairy extends AnimatedGeoModel<EntityPinkfairy>
{
    @Override
    public ResourceLocation getModelLocation(EntityPinkfairy object)
    {
        return new ResourceLocation(Reference.MODID, "geo/pinkfairy.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(EntityPinkfairy object)
    {
        return new ResourceLocation(Reference.MODID, "textures/fairy.png");
    }

    @Override
    public ResourceLocation getAnimationFileLocation(EntityPinkfairy object)
    {
        return new ResourceLocation(Reference.MODID, "animations/pinkfairyentity.json");
    }
    
    @Override
    public void setLivingAnimations(EntityPinkfairy entity, Integer uniqueID, @Nullable AnimationEvent customPredicate) {
        super.setLivingAnimations(entity, uniqueID, customPredicate);
        if (entity.isChild()) {
        	IBone root = this.getAnimationProcessor().getBone("bigbodyfront");
            root.setScaleX(0.5f);
            root.setScaleY(0.5f);
            root.setScaleZ(0.5f);
            root.setPositionY(-2.4f);
        }
    }
}