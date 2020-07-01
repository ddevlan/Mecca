package com.ddylan.mecca;

import com.ddylan.mecca.adapters.MeccaAdapterHandler;
import com.ddylan.mecca.listener.ListenerHandler;
import com.ddylan.library.LibraryPlugin;
import com.lunarclient.bukkitapi.LunarClientAPI;
import lombok.Getter;
import org.bukkit.plugin.java.JavaPlugin;

@Getter
public class Mecca extends JavaPlugin {


    @Getter private static Mecca instance;

    private MeccaAdapterHandler adapterHandler;
    private ListenerHandler listenerHandler;

    private LunarClientAPI lunarAPI;
    private LibraryPlugin LibraryPlugin;

    @Override
    public void onEnable() {
        instance = this;

        lunarAPI = (LunarClientAPI) getServer().getPluginManager().getPlugin("LunarClient-API");
        LibraryPlugin = (LibraryPlugin) getServer().getPluginManager().getPlugin("Library");

        adapterHandler = new MeccaAdapterHandler(instance);
        listenerHandler = new ListenerHandler(instance);
    }

    @Override
    public void onDisable() {
        instance = null;
    }

}
