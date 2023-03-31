/*
 * Project     : TicTacToe
 * Classname   : EndgameState
 * Version     : 1
 * Date        : 09.01.2023 20:13
 * Author      : <a href="mailto:marschal66@web.de">Marschal66</a>
 * Copyright(c): Marschal66 2023
 */
package com.github.marschal66.tictactoe.gamestates;

import com.github.marschal66.tictactoe.main.GameApplication;

import java.util.Timer;
import java.util.TimerTask;

/**
 * The type Endgame state.
 */
public class EndgameState extends GameState {
    /**
     * Start.
     */
///* ---- Konstante ------------------------------------------------------------ */
    ///* ---- Attribute ------------------------------------------------------------ */
    private final GameStateManager gameStateManager;
    private final GameApplication main;

    ///* ---- Start ---------------------------------------------------------------- */
    @Override
    public void start() {
        new Timer().scheduleAtFixedRate(new TimerTask() {
            int i = default_timer;

            @Override
            public void run() {
                main.getLogger().log("Ending game in " + i + " second" + (i == 1 ? "" : "s"));
                i--;
                if (i <= 0) {
                    gameStateManager.stopCurrentGameState();
                    this.cancel();
                }
            }
        }, 0, 1000);
    }

    /**
     * Stop.
     */
    @Override
    public void stop() {
        main.endGame();
    }

    ///* ---- Konstruktor ---------------------------------------------------------- */
    public EndgameState(GameStateManager gameStateManager, GameApplication main) {
        this.gameStateManager = gameStateManager;
        this.main = main;
    }
    ///* ---- Initialisierung ------------------------------------------------------ */
    ///* ---- Logik ---------------------------------------------------------------- */
    ///* ---- get/is/set/add ------------------------------------------------------- */
    ///* ---- create --------------------------------------------------------------- */
}
