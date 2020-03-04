package com.chickenmod.xenarcraft.setup;

import com.chickenmod.xenarcraft.blocks.ModBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class ModSetup {

    public ItemGroup itemGroup = new ItemGroup("xenarcraft"){
        @java.lang.Override
        public ItemStack createIcon() {
            return new ItemStack(ModBlocks.block_master1);
        }
    };

    public void init() {

    }
}
