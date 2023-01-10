/*
 * Project     : TicTacToe
 * Classname   : GameState
 * Version     : 1
 * Date        : 09.01.2023 20:12
 * Author      : <a href="mailto:marschal66@web.de">Marschal66</a>
 * Copyright(c): Marschal66 2023
 */
package com.github.marschal66.tictactoe.state;

public abstract class GameState {
    ///* ---- Konstante ------------------------------------------------------------ */
    int LOBBY_STATE = 0,
            INGAME_STATE = 1,
            ENDGAME_STATE = 2;

    ///* ---- Attribute ------------------------------------------------------------ */
    ///* ---- Start ---------------------------------------------------------------- */
    ///* ---- Konstruktor ---------------------------------------------------------- */
    ///* ---- Initialisierung ------------------------------------------------------ */
    ///* ---- Logik ---------------------------------------------------------------- */
    public abstract void start();

    public abstract void stop();
    ///* ---- get/is/set/add ------------------------------------------------------- */
    ///* ---- create --------------------------------------------------------------- */
}
