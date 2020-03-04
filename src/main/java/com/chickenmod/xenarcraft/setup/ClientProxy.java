package com.chickenmod.xenarcraft.setup;

import net.minecraft.client.Minecraft;
import net.minecraft.world.World;

public class ClientProxy implements IProxy {

    @java.lang.Override
    public void init() {

    }

    @java.lang.Override
    public World getClientWorld() {
        return Minecraft.getInstance().world;
    }
}
