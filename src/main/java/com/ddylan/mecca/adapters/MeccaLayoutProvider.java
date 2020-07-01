package com.ddylan.mecca.adapters;

import com.ddylan.library.tab.LayoutProvider;
import com.ddylan.library.tab.TabLayout;
import org.bukkit.entity.Player;

public class MeccaLayoutProvider implements LayoutProvider {

    @Override
    public TabLayout provide(Player player) {
        return TabLayout.createEmpty(player);
    }

}
