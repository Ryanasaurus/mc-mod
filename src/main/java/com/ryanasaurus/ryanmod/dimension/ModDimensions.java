package com.ryanasaurus.ryanmod.dimension;

import com.ryanasaurus.ryanmod.RyanMod;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.dimension.DimensionType;
import net.minecraftforge.common.ModDimension;
import net.minecraftforge.registries.ObjectHolder;

public class ModDimensions {

    public static final ResourceLocation DIMENSION_ID = new ResourceLocation(RyanMod.MODID, "dimension");

    @ObjectHolder("ryanmod:dimension")
    public static ModDimension DIMENSION;

    public static DimensionType DIMENSION_TYPE;
}
