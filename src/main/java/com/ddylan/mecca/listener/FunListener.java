package com.ddylan.mecca.listener;

import lombok.Getter;
import org.bukkit.Effect;
import org.bukkit.GameMode;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.event.player.PlayerToggleFlightEvent;

import java.util.*;

@Getter
public class FunListener implements Listener {

    private final Set<UUID> jumpingPlayers;
    private final Map<UUID, Set<UUID>> poppedPlayerCache;
    private final Set<UUID> ridingEnderpearls;

    public FunListener(ListenerHandler handler) {
        jumpingPlayers = new HashSet<>();
        poppedPlayerCache = new HashMap<>();
        ridingEnderpearls = new HashSet<>();

        handler.registerListener(this);
    }

    @EventHandler
    public void onPlayerMove(PlayerMoveEvent event) {

    }

    @EventHandler
    public void onFlight(PlayerToggleFlightEvent event) {
        if (event.getPlayer().getGameMode() != GameMode.CREATIVE) {
            if (jumpingPlayers.contains(event.getPlayer().getUniqueId())) {
                jump(event.getPlayer());
            }
        }
    }

    public void rideEnderpearl(Player player) {

    }

    private void jump(Player player) {
        player.setFlying(false);
        player.setAllowFlight(false);
        player.setVelocity(player.getVelocity().multiply(1.33));
        player.getWorld().playSound(player.getLocation(), Sound.BLAZE_HIT, 1, 1);
        player.getWorld().playEffect(player.getLocation(), Effect.MOBSPAWNER_FLAMES, 0, 1);
        jumpingPlayers.remove(player.getUniqueId());
    }

    private void pop(Player popped, Player player) {

    }

}
