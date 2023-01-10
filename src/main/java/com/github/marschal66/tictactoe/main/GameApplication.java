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
    ///* ---- Attribute ------------------------------------------------------------ */
    private final String PREFIX;
    /**
     * The Game state manager.
     */
    private final GameStateManager gameStateManager;
    private final ArrayList<Player> players = new ArrayList<>();

    /**
     * Instantiates a new Game application.
     *
     * @param prefix the prefix
     */
///* ---- Start ---------------------------------------------------------------- */
    ///* ---- Konstruktor ---------------------------------------------------------- */
    public GameApplication(String prefix) {
        this.PREFIX = prefix;
        System.out.println(getPrefix() + "Game started");
        this.gameStateManager = new GameStateManager(this);
        // set default GameState
        gameStateManager.setGameState(GameState.LOBBY_STATE);

    }
///* ---- Initialisierung ------------------------------------------------------ */
    ///* ---- Logik ---------------------------------------------------------------- */
    ///* ---- get/is/set/add ------------------------------------------------------- */

    /**
     * Gets prefix.
     *
     * @return the prefix
     */
    public ArrayList<Player> getPlayers() {
        return players;
    }

    public String getPrefix() {
        // throw Error if Prefix not available
        if (this.PREFIX == null)
            // TODO: handle Exception
            throw new NullPointerException();
        return this.PREFIX;
    }
    ///* ---- create --------------------------------------------------------------- */
}
