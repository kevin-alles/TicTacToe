/*
 * Project     : TicTacToe
 * Classname   : GameManager
 * Version     : 1
 * Date        : 09.01.2023 20:11
 * Author      : <a href="mailto:marschal66@web.de">Marschal66</a>
 * Copyright(c): Marschal66 2023
 */
package com.github.marschal66.tictactoe.gamestates;

import com.github.marschal66.tictactoe.main.GameApplication;

public class GameStateManager {
    ///* ---- Konstante ------------------------------------------------------------ */
    ///* ---- Attribute ------------------------------------------------------------ */
    private final GameApplication main;
    private final GameState[] gameStates;
    private GameState currentGameState;

    ///* ---- Start ---------------------------------------------------------------- */
    ///* ---- Konstruktor ---------------------------------------------------------- */
    public GameStateManager(GameApplication main) {
        this.main = main;
        gameStates = new GameState[3];

        gameStates[GameState.LOBBY_STATE] = new LobbyState(this, main);
        gameStates[GameState.INGAME_STATE] = new IngameState(this, main);
        gameStates[GameState.ENDGAME_STATE] = new EndgameState(this, main);
    }

    ///* ---- Initialisierung ------------------------------------------------------ */
    ///* ---- Logik ---------------------------------------------------------------- */
    public void stopCurrentGameState() {
        if (currentGameState != null) {
            main.getLogger().log("Stopping current GameState: " + getCurrentGameState());
            currentGameState.stop();
            currentGameState = null;
        }
    }

    ///* ---- get/is/set/add ------------------------------------------------------- */
    public void setGameState(int gameStateID) {
        stopCurrentGameState();
        currentGameState = gameStates[gameStateID];
        main.getLogger().log("Starting new GameState: " + getCurrentGameState());
        currentGameState.start();
    }

    public GameState getCurrentGameState() {
        return currentGameState;
    }

    ///* ---- create --------------------------------------------------------------- */
}
