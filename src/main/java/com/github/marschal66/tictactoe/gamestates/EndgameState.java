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

    }

    /**
     * Stop.
     */
    @Override
    public void stop() {

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
