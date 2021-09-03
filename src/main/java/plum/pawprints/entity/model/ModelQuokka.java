// Made with Blockbench 3.6.6
// Exported for Minecraft version 1.12.2 or 1.15.2 (same format for both) for entity models animated with GeckoLib
// Paste this class into your mod and follow the documentation for GeckoLib to use animations. You can find the documentation here: https://github.com/bernie-g/geckolib
// Blockbench plugin created by Gecko
package plum.pawprints.entity.model;

import javax.annotation.Nullable;

import net.minecraft.util.ResourceLocation;
import plum.pawprints.entity.EntityQuokka;
import plum.pawprints.util.Reference;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;
import software.bernie.geckolib3.core.processor.IBone;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class ModelQuokka extends AnimatedGeoModel<EntityQuokka>
{
    @Override
    public ResourceLocation getModelLocation(EntityQuokka object)
    {
        return new ResourceLocation(Reference.MODID, "geo/quokka.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(EntityQuokka object)
    {
        return new ResourceLocation(Reference.MODID, "textures/quokka.png");
    }

    @Override
    public ResourceLocation getAnimationFileLocation(EntityQuokka object)
    {
        return new ResourceLocation(Reference.MODID, "animations/quokkaentity.json");
    }
    
    @Override
    public void setLivingAnimations(EntityQuokka entity, Integer uniqueID, @Nullable AnimationEvent customPredicate) {
        super.setLivingAnimations(entity, uniqueID, customPredicate);
        if (entity.isChild()) {
        	IBone root = this.getAnimationProcessor().getBone("body");
            root.setScaleX(0.5f);
            root.setScaleY(0.5f);
            root.setScaleZ(0.5f);
            root.setPositionY(-1.1f);
        }
    }
}