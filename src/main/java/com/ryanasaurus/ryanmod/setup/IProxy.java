package com.ryanasaurus.ryanmod.setup;

import net.minecraft.world.World;

public interface IProxy {

    void init();

    World getClientWorld();
}
