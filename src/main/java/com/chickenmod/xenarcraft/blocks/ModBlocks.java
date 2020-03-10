package com.chickenmod.xenarcraft.blocks;

import net.minecraft.inventory.container.ContainerType;
import net.minecraft.tileentity.TileEntityType;
import net.minecraftforge.registries.ObjectHolder;

public class ModBlocks {


    @ObjectHolder("xenarcraft:block_master1")
    public static FirstBlock block_master1;

    @ObjectHolder("xenarcraft:block_master1")
    public static TileEntityType<FirstBlockTile> block_master1_tile;

    @ObjectHolder("xenarcraft:block_master1")
    public static ContainerType<FirstBlockContainer> block_master1_container;
}
