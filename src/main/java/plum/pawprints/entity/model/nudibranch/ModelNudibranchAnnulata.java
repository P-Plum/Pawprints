// Made with Blockbench 3.6.6
// Exported for Minecraft version 1.12.2 or 1.15.2 (same format for both) for entity models animated with GeckoLib
// Paste this class into your mod and follow the documentation for GeckoLib to use animations. You can find the documentation here: https://github.com/bernie-g/geckolib
// Blockbench plugin created by Gecko
package plum.pawprints.entity.model.nudibranch;

import net.minecraft.util.ResourceLocation;
import plum.pawprints.entity.nudibranch.EntityNudibranchAnnulata;
import plum.pawprints.util.Reference;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class ModelNudibranchAnnulata extends AnimatedGeoModel<EntityNudibranchAnnulata>
{
    @Override
    public ResourceLocation getModelLocation(EntityNudibranchAnnulata object)
    {
        return new ResourceLocation(Reference.MODID, "geo/chromodorisannulata.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(EntityNudibranchAnnulata object)
    {
        return new ResourceLocation(Reference.MODID, "textures/annulatanudi.png");
    }

    @Override
    public ResourceLocation getAnimationFileLocation(EntityNudibranchAnnulata object)
    {
        return new ResourceLocation(Reference.MODID, "animations/annulataentity.json");
    }
}