package com.kbrewster.hypixelapi.player.stats;

import com.google.gson.annotations.Expose;
import com.kbrewster.hypixelapi.player.stats.arcade.Arcade;
import com.kbrewster.hypixelapi.player.stats.arena.Arena;
import com.kbrewster.hypixelapi.player.stats.battlegrounds.BattleGrounds;
import com.kbrewster.hypixelapi.player.stats.gingerbread.GingerBread;
import com.kbrewster.hypixelapi.player.stats.hg.HungerGames;
import com.kbrewster.hypixelapi.player.stats.mcgo.MCGO;
import com.kbrewster.hypixelapi.player.stats.quake.Quake;
import com.kbrewster.hypixelapi.player.stats.tnt.TNTGames;
import com.kbrewster.hypixelapi.player.stats.uhc.UHC;
import lombok.Getter;

public class Stats {

    @Expose @Getter
    private Arcade Arcade;
    @Expose @Getter
    private Arena Arena;
    @Expose @Getter
    private BattleGrounds Battleground;
    @Expose @Getter
    private HungerGames HungerGames;
    @Expose @Getter
    private MCGO MCGO;
    @Expose @Getter
    private Quake Quake;
    @Expose @Getter
    private TNTGames TNTGames;
    @Expose @Getter
    private UHC UHC;
    @Expose @Getter
    private GingerBread GingerBread;

}
