// Made with Blockbench 3.6.6
// Exported for Minecraft version 1.12.2 or 1.15.2 (same format for both) for entity models animated with GeckoLib
// Paste this class into your mod and follow the documentation for GeckoLib to use animations. You can find the documentation here: https://github.com/bernie-g/geckolib
// Blockbench plugin created by Gecko
package plum.pawprints.entity.model;

import net.minecraft.util.ResourceLocation;
import plum.pawprints.entity.EntityVinegaroon;
import plum.pawprints.util.Reference;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class ModelVinegaroon extends AnimatedGeoModel<EntityVinegaroon>
{
    @Override
    public ResourceLocation getModelLocation(EntityVinegaroon object)
    {
        return new ResourceLocation(Reference.MODID, "geo/vinegaroon.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(EntityVinegaroon object)
    {
        return new ResourceLocation(Reference.MODID, "textures/vinegaroon.png");
    }

    @Override
    public ResourceLocation getAnimationFileLocation(EntityVinegaroon object)
    {
        return new ResourceLocation(Reference.MODID, "animations/vinegaroonentity.json");
    }
}