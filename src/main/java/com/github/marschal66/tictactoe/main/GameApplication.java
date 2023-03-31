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
import java.util.List;

public class GameApplication {
///* ---- Konstante ------------------------------------------------------------ */
    private final Logger logger;
    private final GameStateManager gameStateManager;
    private final Integer id;
    ///* ---- Attribute ------------------------------------------------------------ */
    private final List<Player> players = new ArrayList<>();

    ///* ---- Start ---------------------------------------------------------------- */
    ///* ---- Konstruktor ---------------------------------------------------------- */
    public GameApplication(Integer id) {
        this.id = id;
        this.logger = new Logger("[TicTacToe-" + id + "] ", true);
        getLogger().log("Game started");

        // create GameStateManager and start Manager
        this.gameStateManager = new GameStateManager(this);
        gameStateManager.setGameState(GameState.LOBBY_STATE);
    }

    ///* ---- Initialisierung ------------------------------------------------------ */
    ///* ---- Logik ---------------------------------------------------------------- */
    public void endGame() {
        getLogger().log("Game ended");
        System.exit(0);
    }

    ///* ---- get/is/set/add ------------------------------------------------------- */
    public Logger getLogger() {
        return logger;
    }

    public List<Player> getPlayers() {
        return players;
    }
    ///* ---- create --------------------------------------------------------------- */
}
