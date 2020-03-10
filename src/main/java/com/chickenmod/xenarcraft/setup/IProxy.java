package com.chickenmod.xenarcraft.setup;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.world.World;

import javax.swing.text.html.parser.Entity;

public interface IProxy {

    void init();

    World getClientWorld();

    PlayerEntity getClientPlayer();

}
