package com.chickenmod.xenarcraft.setup;

import net.minecraft.world.World;

public class ServerProxy implements IProxy {

    @Override
    public void init(){

    }

    @java.lang.Override
    public World getClientWorld() {
        throw new IllegalStateException("Only run this on the client!");
    }
}
