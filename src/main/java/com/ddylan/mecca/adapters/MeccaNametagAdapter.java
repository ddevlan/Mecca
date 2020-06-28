package com.ddylan.mecca.adapters;

import com.ddylan.xlib.nametag.NametagInfo;
import com.ddylan.xlib.nametag.NametagProvider;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

public class MeccaNametagAdapter extends NametagProvider {

    public MeccaNametagAdapter() {
        super("Mecca-Adapter", 100);
    }

    @Override
    public NametagInfo fetchNametag(Player toRefresh, Player refreshFor) {
        return createNametag(getColor(toRefresh.getDisplayName()) + "", "");
    }

    private String getColor(String string) {
        return ChatColor.getLastColors(string);
    }

}
