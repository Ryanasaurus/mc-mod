package com.ryanasaurus.ryanmod.dimension;

import com.ryanasaurus.ryanmod.dimension.neooverworld.NeoOverworldDimension;
import net.minecraft.world.World;
import net.minecraft.world.dimension.Dimension;
import net.minecraft.world.dimension.DimensionType;
import net.minecraftforge.common.ModDimension;

import java.util.function.BiFunction;

public class RyanModDimension extends ModDimension {
    @Override
    public BiFunction<World, DimensionType, ? extends Dimension> getFactory() {
        return NeoOverworldDimension::new;
    }
}
