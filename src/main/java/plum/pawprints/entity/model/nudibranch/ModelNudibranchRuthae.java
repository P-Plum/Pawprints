// Made with Blockbench 3.6.6
// Exported for Minecraft version 1.12.2 or 1.15.2 (same format for both) for entity models animated with GeckoLib
// Paste this class into your mod and follow the documentation for GeckoLib to use animations. You can find the documentation here: https://github.com/bernie-g/geckolib
// Blockbench plugin created by Gecko
package plum.pawprints.entity.model.nudibranch;

import net.minecraft.util.ResourceLocation;
import plum.pawprints.entity.nudibranch.EntityNudibranchRuthae;
import plum.pawprints.util.Reference;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class ModelNudibranchRuthae extends AnimatedGeoModel<EntityNudibranchRuthae>
{
    @Override
    public ResourceLocation getModelLocation(EntityNudibranchRuthae object)
    {
        return new ResourceLocation(Reference.MODID, "geo/hypselodorisruthae.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(EntityNudibranchRuthae object)
    {
        return new ResourceLocation(Reference.MODID, "textures/ruthaenudi.png");
    }

    @Override
    public ResourceLocation getAnimationFileLocation(EntityNudibranchRuthae object)
    {
        return new ResourceLocation(Reference.MODID, "animations/ruthaeentity.json");
    }
}