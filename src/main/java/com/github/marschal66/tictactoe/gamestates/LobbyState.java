/*
 * Project     : TicTacToe
 * Classname   : LobbyState
 * Version     : 1
 * Date        : 09.01.2023 20:12
 * Author      : <a href="mailto:marschal66@web.de">Marschal66</a>
 * Copyright(c): Marschal66 2023
 */
package com.github.marschal66.tictactoe.gamestates;

import com.github.marschal66.tictactoe.main.GameApplication;
import com.github.marschal66.tictactoe.user.Player;
import com.github.marschal66.tictactoe.util.Symbol;

import java.util.List;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

public class LobbyState extends GameState {
///* ---- Konstante ------------------------------------------------------------ */
    ///* ---- Attribute ------------------------------------------------------------ */
    private final GameStateManager gameStateManager;
    private final GameApplication main;
    private final List<Player> players;

    ///* ---- Start ---------------------------------------------------------------- */
    @Override
    public void start() {
        main.getLogger().log("Starting LobbyState");

        // TODO: start server

        // wait for 2 players
        while (true) {
            // TODO: wait for 2 players to connect
            players.add(new Player(Long.parseLong("01234567890"), "Player One"));
            players.add(new Player(Long.parseLong("01234567891"), "Player Two"));
            // Temporary
            if (players.size() >= 2)
                break;

            for (Player player : players)
                main.getLogger().log(player.getName() + "(ID:" + player.getID() + ") connected");


            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        players.get(0).setSymbol(new Random().nextBoolean() ? Symbol.CROSS : Symbol.CIRCLE);
        players.get(1).setSymbol(players.get(0).getSymbol() == Symbol.CROSS ? Symbol.CIRCLE : Symbol.CROSS);
        for (Player player : players)
            main.getLogger().log(player.getName() + " is " + player.getSymbol());

        new Timer().scheduleAtFixedRate(new TimerTask() {
            int i = default_timer;

            @Override
            public void run() {
                if (i <= 0) {
                    gameStateManager.setGameState(GameState.INGAME_STATE);
                    this.cancel();
                }
                main.getLogger().log("Starting game in " + i + " second" + (i == 1 ? "" : "s"));
                i--;
            }
        }, 0, 1000);
    }

    ///* ---- Konstruktor ---------------------------------------------------------- */
    public LobbyState(GameStateManager gameStateManager, GameApplication main) {
        this.gameStateManager = gameStateManager;
        this.main = main;
        this.players = main.getPlayers();
    }

    ///* ---- Initialisierung ------------------------------------------------------ */
    ///* ---- Logik ---------------------------------------------------------------- */
    @Override
    public void stop() {
        // TODO document why this method is empty
    }
    ///* ---- get/is/set/add ------------------------------------------------------- */
    ///* ---- create --------------------------------------------------------------- */
}
