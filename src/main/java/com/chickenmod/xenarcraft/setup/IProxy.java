package com.chickenmod.xenarcraft.setup;

import net.minecraft.world.World;

public interface IProxy {

    void init();

    World getClientWorld();

}
