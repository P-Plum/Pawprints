// Made with Blockbench 3.6.6
// Exported for Minecraft version 1.12.2 or 1.15.2 (same format for both) for entity models animated with GeckoLib
// Paste this class into your mod and follow the documentation for GeckoLib to use animations. You can find the documentation here: https://github.com/bernie-g/geckolib
// Blockbench plugin created by Gecko
package plum.pawprints.entity.model.nudibranch;

import net.minecraft.util.ResourceLocation;
import plum.pawprints.entity.nudibranch.EntityNudibranchCristata;
import plum.pawprints.util.Reference;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class ModelNudibranchCristata extends AnimatedGeoModel<EntityNudibranchCristata>
{
    @Override
    public ResourceLocation getModelLocation(EntityNudibranchCristata object)
    {
        return new ResourceLocation(Reference.MODID, "geo/nembrothacristata.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(EntityNudibranchCristata object)
    {
        return new ResourceLocation(Reference.MODID, "textures/cristatanudi.png");
    }

    @Override
    public ResourceLocation getAnimationFileLocation(EntityNudibranchCristata object)
    {
        return new ResourceLocation(Reference.MODID, "animations/cristataentity.json");
    }
}