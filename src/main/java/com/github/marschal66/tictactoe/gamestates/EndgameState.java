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
    private final GameApplication gameApplication;

    ///* ---- Start ---------------------------------------------------------------- */
    @Override
    public void start() {
        new Timer().scheduleAtFixedRate(new TimerTask() {
            int i = 5;

            @Override
            public void run() {
                System.out.println(i + " Second" + (i == 1 ? " " : "s ") + "to end");
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
        gameApplication.endGame();
    }

    ///* ---- Konstruktor ---------------------------------------------------------- */
    public EndgameState(GameStateManager gameStateManager, GameApplication gameApplication) {
        this.gameStateManager = gameStateManager;
        this.gameApplication = gameApplication;
    }
    ///* ---- Initialisierung ------------------------------------------------------ */
    ///* ---- Logik ---------------------------------------------------------------- */
    ///* ---- get/is/set/add ------------------------------------------------------- */
    ///* ---- create --------------------------------------------------------------- */
}
