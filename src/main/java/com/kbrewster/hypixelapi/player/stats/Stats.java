package com.kbrewster.hypixelapi.player.stats;

import com.google.gson.annotations.Expose;
import com.kbrewster.hypixelapi.player.stats.arcade.Arcade;
import com.kbrewster.hypixelapi.player.stats.arena.Arena;
import com.kbrewster.hypixelapi.player.stats.battlegrounds.BattleGrounds;
import com.kbrewster.hypixelapi.player.stats.bedwars.Bedwars;
import com.kbrewster.hypixelapi.player.stats.gingerbread.GingerBread;
import com.kbrewster.hypixelapi.player.stats.hg.HungerGames;
import com.kbrewster.hypixelapi.player.stats.mcgo.MCGO;
import com.kbrewster.hypixelapi.player.stats.megawalls.Walls3;
import com.kbrewster.hypixelapi.player.stats.mm.MurderMystery;
import com.kbrewster.hypixelapi.player.stats.paintball.Paintball;
import com.kbrewster.hypixelapi.player.stats.quake.Quake;
import com.kbrewster.hypixelapi.player.stats.smash.SuperSmash;
import com.kbrewster.hypixelapi.player.stats.tnt.TNTGames;
import com.kbrewster.hypixelapi.player.stats.uhc.UHC;
import com.kbrewster.hypixelapi.player.stats.vampz.VampireZ;
import com.kbrewster.hypixelapi.player.stats.walls.Walls;
import lombok.Getter;

@Getter
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
    @Expose
    private SuperSmash SuperSmash;
    @Expose
    private Walls Walls;
    @Expose
    private Walls3 Walls3;
    @Expose
    private MurderMystery MurderMystery;
    @Expose
    private Bedwars Bedwars;
    @Expose
    private Paintball Paintball;
    @Expose
    private VampireZ VampireZ;
    //TODO: SPEEDUHC
    //TODO: SKYCLASH

}
