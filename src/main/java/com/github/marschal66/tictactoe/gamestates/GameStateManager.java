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

/**
 * The type Game state manager.
 */
public class GameStateManager {
    /**
     * The Main.
     */
///* ---- Konstante ------------------------------------------------------------ */
    ///* ---- Attribute ------------------------------------------------------------ */
    private final GameApplication main;
    /**
     * The Game states.
     */
    private final GameState[] gameStates;
    /**
     * The Current game state.
     */
    private GameState currentGameState;

    /**
     * Instantiates a new Game state manager.
     *
     * @param main the main
     */
///* ---- Start ---------------------------------------------------------------- */
    ///* ---- Konstruktor ---------------------------------------------------------- */
    public GameStateManager(GameApplication main) {
        this.main = main;
        gameStates = new GameState[3];

        gameStates[GameState.LOBBY_STATE] = new LobbyState(this, main);
        gameStates[GameState.INGAME_STATE] = new IngameState(this, main);
        gameStates[GameState.ENDGAME_STATE] = new EndgameState(this, main);
    }

    /**
     * Stop current game state.
     */
///* ---- Initialisierung ------------------------------------------------------ */
    ///* ---- Logik ---------------------------------------------------------------- */
    public void stopCurrentGameState() {
        if (currentGameState != null) {
            currentGameState.stop();
            currentGameState = null;
        }
    }

    /**
     * Sets game state.
     *
     * @param gameStateID the game state id
     */
///* ---- get/is/set/add ------------------------------------------------------- */
    public void setGameState(int gameStateID) {
        if (currentGameState != null) currentGameState.stop();
        currentGameState = gameStates[gameStateID];
        currentGameState.start();
    }

    /**
     * Gets current game state.
     *
     * @return the current game state
     */
    public GameState getCurrentGameState() {
        return currentGameState;
    }

    ///* ---- create --------------------------------------------------------------- */
}
