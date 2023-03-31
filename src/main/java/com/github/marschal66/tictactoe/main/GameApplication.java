/*
 * Project     : TicTacToe
 * Classname   : GameApplication
 * Version     : 1
 * Date        : 09.01.2023 20:43
 * Author      : <a href="mailto:marschal66@web.de">Marschal66</a>
 * Copyright(c): Marschal66 2023
 */
package com.github.marschal66.tictactoe.main;

import com.github.marschal66.tictactoe.gamestates.GameState;
import com.github.marschal66.tictactoe.gamestates.GameStateManager;
import com.github.marschal66.tictactoe.logging.Logger;
import com.github.marschal66.tictactoe.user.Player;

import java.util.ArrayList;

/**
 * The type Game application.
 */
public class GameApplication {
    /**
     * The Prefix.
     */
///* ---- Konstante ------------------------------------------------------------ */
    private final Logger logger;
    private final String prefix;
    /**
     * The Game state manager.
     */
    private final GameStateManager gameStateManager;
    ///* ---- Attribute ------------------------------------------------------------ */
    private final ArrayList<Player> players = new ArrayList<>();

    /**
     * Instantiates a new Game application.
     *
     * @param prefix the prefix
     */
///* ---- Start ---------------------------------------------------------------- */
    ///* ---- Konstruktor ---------------------------------------------------------- */
    public GameApplication(String prefix) {
        this.prefix = prefix;
        this.logger = new Logger(this.prefix, true);

        // create GameStateManager and start Manager
        this.gameStateManager = new GameStateManager(this);
        gameStateManager.setGameState(GameState.LOBBY_STATE);
    }

    ///* ---- Initialisierung ------------------------------------------------------ */
    ///* ---- Logik ---------------------------------------------------------------- */
    public void endGame() {
        System.exit(0);
    }
    ///* ---- get/is/set/add ------------------------------------------------------- */

    /**
     * Gets prefix.
     *
     * @return the prefix
     */
    public ArrayList<Player> getPlayers() {
        return players;
    }
    ///* ---- create --------------------------------------------------------------- */
}
