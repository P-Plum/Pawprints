// Made with Blockbench 3.6.6
// Exported for Minecraft version 1.12.2 or 1.15.2 (same format for both) for entity models animated with GeckoLib
// Paste this class into your mod and follow the documentation for GeckoLib to use animations. You can find the documentation here: https://github.com/bernie-g/geckolib
// Blockbench plugin created by Gecko
package plum.pawprints.entity.model;

import javax.annotation.Nullable;

import net.minecraft.util.ResourceLocation;
import plum.pawprints.entity.EntityFrilledLizard;
import plum.pawprints.util.Reference;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;
import software.bernie.geckolib3.core.processor.IBone;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class ModelFrilledLizard extends AnimatedGeoModel<EntityFrilledLizard>
{
    @Override
    public ResourceLocation getModelLocation(EntityFrilledLizard object)
    {
        return new ResourceLocation(Reference.MODID, "geo/frilledlizard.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(EntityFrilledLizard object)
    {
        return new ResourceLocation(Reference.MODID, "textures/frilledlizard.png");
    }

    @Override
    public ResourceLocation getAnimationFileLocation(EntityFrilledLizard object)
    {
        return new ResourceLocation(Reference.MODID, "animations/frilledlizardentity.json");
    }
    
    @Override
    public void setLivingAnimations(EntityFrilledLizard entity, Integer uniqueID, @Nullable AnimationEvent customPredicate) {
        super.setLivingAnimations(entity, uniqueID, customPredicate);
        if (entity.isChild()) {
        	IBone root = this.getAnimationProcessor().getBone("body");
            root.setScaleX(0.5f);
            root.setScaleY(0.5f);
            root.setScaleZ(0.5f);
            
            IBone tailbase = this.getAnimationProcessor().getBone("tailbase");
            tailbase.setScaleX(0.5f);
            tailbase.setScaleY(0.5f);
            tailbase.setScaleZ(0.5f);
            
            IBone frontthighleft = this.getAnimationProcessor().getBone("frontthighleft");
            frontthighleft.setScaleX(0.5f);
            frontthighleft.setScaleY(0.5f);
            frontthighleft.setScaleZ(0.5f);
            
            IBone frontthighright = this.getAnimationProcessor().getBone("frontthighright");
            frontthighright.setScaleX(0.5f);
            frontthighright.setScaleY(0.5f);
            frontthighright.setScaleZ(0.5f);
            
            IBone backthighright = this.getAnimationProcessor().getBone("backthighright");
            backthighright.setScaleX(0.5f);
            backthighright.setScaleY(0.5f);
            backthighright.setScaleZ(0.5f);
            
            IBone backthighleft = this.getAnimationProcessor().getBone("backthighleft");
            backthighleft.setScaleX(0.5f);
            backthighleft.setScaleY(0.5f);
            backthighleft.setScaleZ(0.5f);
        }
    }
}