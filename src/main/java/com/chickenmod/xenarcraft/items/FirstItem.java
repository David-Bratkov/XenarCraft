package com.chickenmod.xenarcraft.items;

import com.chickenmod.xenarcraft.xenarcraft;
import net.minecraft.item.Item;

public class FirstItem extends Item {

    public FirstItem() {
        super(new Item.Properties()
                .maxStackSize(20)
                .group(xenarcraft.setup.itemGroup));
        setRegistryName("newpick");
    }
}
