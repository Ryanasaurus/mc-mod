package com.ryanasaurus.ryanmod.blocks;

import com.ryanasaurus.ryanmod.blocks.container.RyanBlockContainer;
import com.ryanasaurus.ryanmod.blocks.tileentity.RyanBlockTile;
import net.minecraft.inventory.container.ContainerType;
import net.minecraft.tileentity.TileEntityType;
import net.minecraftforge.registries.ObjectHolder;

public class ModBlocks {

    @ObjectHolder("ryanmod:ryanblock")
    public static RyanBlock RYANBLOCK;

    @ObjectHolder("ryanmod:ryanblock")
    public static TileEntityType<RyanBlockTile> RYANBLOCK_TILE;

    @ObjectHolder("ryanmod:ryanblock")
    public static ContainerType<RyanBlockContainer> RYANBLOCK_CONTAINER;

}
