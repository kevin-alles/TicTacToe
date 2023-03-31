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

import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

/**
 * The type Lobby state.
 */
public class LobbyState extends GameState {
///* ---- Konstante ------------------------------------------------------------ */
    ///* ---- Attribute ------------------------------------------------------------ */
    /**
     * The Game state manager.
     */
    private final GameStateManager gameStateManager;
    private final GameApplication gameApplication;

    /**
     * Start.
     */
///* ---- Start ---------------------------------------------------------------- */
    @Override
    public void start() {
        System.out.println("LobbyState started");

        // TODO: start server

        // wait for 2 players
        while (true) {
            // Temporary
            // TODO: wait for 2 players to connect
            gameApplication.getPlayers().add(new Player(Long.valueOf("01234567890"), "Player One"));
            gameApplication.getPlayers().add(new Player(Long.valueOf("01234567891"), "Player Two"));
            // Temporary
            if (gameApplication.getPlayers().size() >= 2)
                break;

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        gameApplication.getPlayers().get(0).setSymbol(new Random().nextBoolean() ? Symbol.CROSS : Symbol.CIRCLE);
        gameApplication.getPlayers().get(1).setSymbol(gameApplication.getPlayers().get(0).getSymbol() == Symbol.CROSS ? Symbol.CIRCLE : Symbol.CROSS);

        new Timer().scheduleAtFixedRate(new TimerTask() {
            int i = 5;

            @Override
            public void run() {
                System.out.println(i + " Second" + (i == 1 ? " " : "s ") + "to start");
                i--;
                if (i <= 0) {
                    gameStateManager.setGameState(GameState.INGAME_STATE);
                    this.cancel();
                }
            }
        }, 0, 1000);
    }

    /**
     * Instantiates a new Lobby state.
     *
     * @param gameStateManager the game state manager
     */
///* ---- Konstruktor ---------------------------------------------------------- */
    public LobbyState(GameStateManager gameStateManager, GameApplication gameApplication) {
        this.gameStateManager = gameStateManager;
        this.gameApplication = gameApplication;
    }

    /**
     * Stop.
     */
///* ---- Initialisierung ------------------------------------------------------ */
    ///* ---- Logik ---------------------------------------------------------------- */
    @Override
    public void stop() {

    }
    ///* ---- get/is/set/add ------------------------------------------------------- */
    ///* ---- create --------------------------------------------------------------- */
}
