package com.ryanasaurus.ryanmod.item;

import com.ryanasaurus.ryanmod.RyanMod;
import net.minecraft.item.Item;

public class RyanItem extends Item {

    public RyanItem() {
        super(new Item.Properties()
                .maxStackSize(1)
                .group(RyanMod.setup.itemGroup)
        );
        setRegistryName("ryanitem");
    }

}
