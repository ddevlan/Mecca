package com.ddylan.mecca.adapters;

import com.ddylan.xlib.tab.LayoutProvider;
import com.ddylan.xlib.tab.TabLayout;
import org.bukkit.entity.Player;

public class MeccaLayoutProvider implements LayoutProvider {

    @Override
    public TabLayout provide(Player player) {
        return TabLayout.createEmpty(player);
    }

}
