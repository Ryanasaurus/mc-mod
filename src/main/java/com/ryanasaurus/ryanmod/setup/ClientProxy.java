package com.ryanasaurus.ryanmod.setup;

import com.ryanasaurus.ryanmod.blocks.ModBlocks;
import com.ryanasaurus.ryanmod.blocks.screens.RyanBlockScreen;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.ScreenManager;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.world.World;

public class ClientProxy implements IProxy {

    @Override
    public void init() {
        ScreenManager.registerFactory(ModBlocks.RYANBLOCK_CONTAINER, RyanBlockScreen::new);

    }

    @Override
    public World getClientWorld() {
        return Minecraft.getInstance().world;
    }

    @Override
    public PlayerEntity getClientPlayer() {
        return Minecraft.getInstance().player;
    }
}
