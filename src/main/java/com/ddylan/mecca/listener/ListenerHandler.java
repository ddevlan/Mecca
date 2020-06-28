package com.ddylan.mecca.listener;

import com.ddylan.mecca.Mecca;
import lombok.Getter;
import org.bukkit.event.Listener;

@Getter
public class ListenerHandler {

    private Mecca mecca;

    public ListenerHandler(Mecca mecca) {
        this.mecca = mecca;

//        new FunListener(this);
        new MeccaListener(this);
    }

    public void registerListener(Listener listener) {
        mecca.getServer().getPluginManager().registerEvents(listener, mecca);
    }

}
