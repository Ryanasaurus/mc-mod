package com.ryanasaurus.ryanmod.setup;

import com.ryanasaurus.ryanmod.blocks.ModBlocks;
import com.ryanasaurus.ryanmod.network.Networking;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;

public class ModSetup {

    public ItemGroup itemGroup = new ItemGroup("ryanmod") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(ModBlocks.RYANBLOCK);
        }
    };

    public void init() {
        MinecraftForge.EVENT_BUS.register(new ForgeEventHandlers());
        Networking.registerMessages();
    }

}
