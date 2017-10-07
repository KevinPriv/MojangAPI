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

public class Stats {

    @Expose
    private Arcade Arcade;
    @Expose
    private Arena Arena;
    @Expose
    private BattleGrounds Battleground;
    @Expose
    private HungerGames HungerGames;
    @Expose
    private MCGO MCGO;
    @Expose
    private Quake Quake;
    @Expose
    private TNTGames TNTGames;
    @Expose
    private UHC UHC;
    @Expose
    private GingerBread GingerBread;

    public com.kbrewster.hypixelapi.player.stats.arcade.Arcade getArcade() {
        return Arcade;
    }

    public com.kbrewster.hypixelapi.player.stats.arena.Arena getArena() {
        return Arena;
    }

    public BattleGrounds getBattleground() {
        return Battleground;
    }

    public com.kbrewster.hypixelapi.player.stats.hg.HungerGames getHungerGames() {
        return HungerGames;
    }

    public com.kbrewster.hypixelapi.player.stats.mcgo.MCGO getMCGO() {
        return MCGO;
    }

    public com.kbrewster.hypixelapi.player.stats.quake.Quake getQuake() {
        return Quake;
    }

    public com.kbrewster.hypixelapi.player.stats.tnt.TNTGames getTNTGames() {
        return TNTGames;
    }

    public com.kbrewster.hypixelapi.player.stats.uhc.UHC getUHC() {
        return UHC;
    }

    public com.kbrewster.hypixelapi.player.stats.gingerbread.GingerBread getGingerBread() {
        return GingerBread;
    }
}
