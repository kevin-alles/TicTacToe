/*
 * Project     : TicTacToe
 * Classname   : IngameState
 * Version     : 1
 * Date        : 09.01.2023 20:12
 * Author      : <a href="mailto:marschal66@web.de">Marschal66</a>
 * Copyright(c): Marschal66 2023
 */
package com.github.marschal66.tictactoe.gamestates;

import com.github.marschal66.tictactoe.main.GameApplication;

/**
 * The type Ingame state.
 */
public class IngameState extends GameState {
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
        System.out.println("IngameState started");
    }

    /**
     * Stop.
     */
    @Override
    public void stop() {

    }

    ///* ---- Konstruktor ---------------------------------------------------------- */
    public IngameState(GameStateManager gameStateManager, GameApplication gameApplication) {
        this.gameStateManager = gameStateManager;
        this.gameApplication = gameApplication;
    }
    ///* ---- Initialisierung ------------------------------------------------------ */
    ///* ---- Logik ---------------------------------------------------------------- */
    ///* ---- get/is/set/add ------------------------------------------------------- */
    ///* ---- create --------------------------------------------------------------- */
}
