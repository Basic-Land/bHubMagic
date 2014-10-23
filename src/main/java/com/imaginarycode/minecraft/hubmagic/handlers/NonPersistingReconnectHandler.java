package com.imaginarycode.minecraft.hubmagic.handlers;

import com.imaginarycode.minecraft.hubmagic.HubMagic;
import net.md_5.bungee.api.AbstractReconnectHandler;
import net.md_5.bungee.api.connection.ProxiedPlayer;

public abstract class NonPersistingReconnectHandler extends AbstractReconnectHandler {
    @Override
    public final void setServer(ProxiedPlayer player) {

    }

    @Override
    public final void save() {

    }

    @Override
    public final void close() {
        HubMagic.getPlugin().getPingManager().shutdown();
    }
}
