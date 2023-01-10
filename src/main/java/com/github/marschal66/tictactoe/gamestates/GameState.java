/*
 * Project     : TicTacToe
 * Classname   : GameState
 * Version     : 1
 * Date        : 09.01.2023 20:12
 * Author      : <a href="mailto:marschal66@web.de">Marschal66</a>
 * Copyright(c): Marschal66 2023
 */
package com.github.marschal66.tictactoe.gamestates;

/**
 * The type Game state.
 */
public abstract class GameState {
    /**
     * The constant LOBBY_STATE.
     */
///* ---- Konstante ------------------------------------------------------------ */
    public static final int LOBBY_STATE = 0,
    /**
     * The Ingame state.
     */
    INGAME_STATE = 1,
    /**
     * The Endgame state.
     */
    ENDGAME_STATE = 2;

    /**
     * Start.
     */
///* ---- Attribute ------------------------------------------------------------ */
    ///* ---- Start ---------------------------------------------------------------- */
    ///* ---- Konstruktor ---------------------------------------------------------- */
    ///* ---- Initialisierung ------------------------------------------------------ */
    ///* ---- Logik ---------------------------------------------------------------- */
    public abstract void start();

    /**
     * Stop.
     */
    public abstract void stop();
    ///* ---- get/is/set/add ------------------------------------------------------- */
    ///* ---- create --------------------------------------------------------------- */
}
