package com.ddylan.mecca.listener;

import com.ddylan.library.util.Color;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.entity.EntityInteractEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

public class MeccaListener implements Listener {

    public MeccaListener(ListenerHandler handler) {
        handler.registerListener(this);
    }

    @EventHandler
    public void onInteract(EntityInteractEvent event) {
        if (event.getEntity() instanceof Player) {
            Player player = (Player) event.getEntity();

        }
    }

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {
        event.setJoinMessage(null);
        Player player = event.getPlayer();
        player.sendMessage(Color.HORIZONTAL_SEPERATOR_EXTRA);
        player.sendMessage(" ");
        player.sendMessage("  " + Color.GRAY + "Welcome to " + Color.GOLD + Color.BOLD + "Countin Commas LLC" + Color.GRAY + "!");
        player.sendMessage(" ");
        player.sendMessage("  " + Color.GRAY + Color.ARROWS_RIGHT + Color.AQUA + " Website: " + ChatColor.GRAY + "www.countincommas.cc");
        player.sendMessage("  " + Color.GRAY + Color.ARROWS_RIGHT + Color.AQUA + " Store: " + ChatColor.GRAY + "store.countincommas.cc");
        player.sendMessage("  " + Color.GRAY + Color.ARROWS_RIGHT + Color.AQUA + " Discord: " + ChatColor.GRAY + "discord.gg/countincommas");
        player.sendMessage("  " + Color.GRAY + Color.ARROWS_RIGHT + Color.AQUA + " Twitter: " + ChatColor.GRAY + "@countincommas_cc");
        player.sendMessage(" ");
        player.sendMessage(Color.HORIZONTAL_SEPERATOR_EXTRA);
    }

    @EventHandler(priority = EventPriority.HIGHEST)
    public void onDamage(EntityDamageEvent event) {
        event.setCancelled(true);
    }

    @EventHandler
    public void onPlayerQuit(PlayerQuitEvent event) {
        event.setQuitMessage(null);
    }

}

