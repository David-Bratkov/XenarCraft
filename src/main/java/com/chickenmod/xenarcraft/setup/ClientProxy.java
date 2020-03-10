package com.chickenmod.xenarcraft.setup;

import com.chickenmod.xenarcraft.blocks.FirstBlockScreen;
import com.chickenmod.xenarcraft.blocks.ModBlocks;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.ScreenManager;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.world.World;

public class ClientProxy implements IProxy {

    @java.lang.Override
    public void init() {
        ScreenManager.registerFactory(ModBlocks.block_master1_container, FirstBlockScreen::new);
    }
    //dosent work when right  clicked
    @java.lang.Override
    public World getClientWorld() {
        return Minecraft.getInstance().world;
    }

    @Override
    public PlayerEntity getClientPlayer() {
        return Minecraft.getInstance().player;
    }
}
