// Made with Blockbench 3.6.6
// Exported for Minecraft version 1.12.2 or 1.15.2 (same format for both) for entity models animated with GeckoLib
// Paste this class into your mod and follow the documentation for GeckoLib to use animations. You can find the documentation here: https://github.com/bernie-g/geckolib
// Blockbench plugin created by Gecko
package plum.pawprints.entity.model;

import net.minecraft.util.ResourceLocation;
import plum.pawprints.entity.EntityTermite;
import plum.pawprints.util.Reference;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class ModelTermite extends AnimatedGeoModel<EntityTermite>
{
    @Override
    public ResourceLocation getModelLocation(EntityTermite object)
    {
        return new ResourceLocation(Reference.MODID, "geo/termite.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(EntityTermite object)
    {
        return new ResourceLocation(Reference.MODID, "textures/termite.png");
    }

    @Override
    public ResourceLocation getAnimationFileLocation(EntityTermite object)
    {
        return new ResourceLocation(Reference.MODID, "animations/termiteentity.json");
    }
}