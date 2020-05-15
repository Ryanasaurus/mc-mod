package com.ryanasaurus.ryanmod.setup;

import com.ryanasaurus.ryanmod.blocks.ModBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class ModSetup {

    public ItemGroup itemGroup = new ItemGroup("ryanmod") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(ModBlocks.RYANBLOCK);
        }
    };

    public void init() {

    }

}
