package com.ddylan.mecca;

import com.ddylan.mecca.adapters.MeccaAdapterHandler;
import com.ddylan.mecca.listener.ListenerHandler;
import com.ddylan.xlib.Library;
import com.lunarclient.bukkitapi.LunarClientAPI;
import lombok.Getter;
import org.bukkit.plugin.java.JavaPlugin;

@Getter
public class Mecca extends JavaPlugin {


    @Getter private static Mecca instance;

    private MeccaAdapterHandler adapterHandler;
    private ListenerHandler listenerHandler;

    private LunarClientAPI lunarAPI;
    private Library Library;

    @Override
    public void onEnable() {
        instance = this;

        lunarAPI = (LunarClientAPI) getServer().getPluginManager().getPlugin("LunarClient-API");
        Library = (Library) getServer().getPluginManager().getPlugin("xLib");

        adapterHandler = new MeccaAdapterHandler(instance);
        listenerHandler = new ListenerHandler(instance);
    }

    @Override
    public void onDisable() {
        instance = null;
    }

}
