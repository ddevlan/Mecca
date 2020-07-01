package com.ddylan.mecca.adapters;

import com.ddylan.library.scoreboard.ScoreboardConfiguration;
import com.ddylan.library.scoreboard.TitleGetter;
import com.ddylan.library.util.Color;
import org.bukkit.Bukkit;

public class MeccaScoreboardAdapter {

    public static ScoreboardConfiguration create() {
        ScoreboardConfiguration configuration = new ScoreboardConfiguration();

        configuration.setTitleGetter(new TitleGetter(Color.GOLD + Color.BOLD + "Countin Commas LLC"));
        configuration.setScoreGetter((board, player) -> {
            //  Online:
            //  {amount}
            //
            //  Rank:
            //  Default
            //
            //  countincommas.cc

            board.addFirst(Color.GREEN + Color.SCOREBAORD_SEPARATOR);
            board.add(Color.YELLOW + "Online: ");
            board.add(Color.WHITE + Bukkit.getOnlinePlayers().size());  //TODO: change to bungee amount!
            board.add(Color.D_PURPLE + "");
            board.add(Color.YELLOW + "Rank:");
            board.add(Color.WHITE + "Default");                         //TODO: actually hook into a ranks plugin :P
            board.add(Color.PINK + "");
            board.add(Color.YELLOW + "countincommas.cc");
            board.add(Color.WHITE + Color.SCOREBAORD_SEPARATOR);
        });

        return configuration;
    }

}
