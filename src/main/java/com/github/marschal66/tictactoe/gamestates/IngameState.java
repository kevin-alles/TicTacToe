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
import com.github.marschal66.tictactoe.user.Player;
import com.github.marschal66.tictactoe.util.Field;

import java.util.ArrayList;

/**
 * The type Ingame state.
 */
public class IngameState extends GameState {
    /**
     * Start.
     */
///* ---- Konstante ------------------------------------------------------------ */
    private final GameStateManager gameStateManager;
    private final GameApplication gameApplication;
    ///* ---- Attribute ------------------------------------------------------------ */
    private ArrayList<Player> players;
    private Field field;

    ///* ---- Start ---------------------------------------------------------------- */
    @Override
    public void start() {
        System.out.println("IngameState started");
        players = gameApplication.getPlayers();

        // TODO: create new Field
        this.field = new Field(gameApplication);
        // TODO: turns
        gameHandler();
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
    private void gameHandler() {
        int currentPlayerIndex = 0;
        while (!turn(players.get(currentPlayerIndex))) {
            currentPlayerIndex = currentPlayerIndex == 0 ? 1 : 0;
        }

    }

    private boolean turn(Player player) {
        // true => win
        return true;
        // false => next turn
    }
    ///* ---- get/is/set/add ------------------------------------------------------- */
    ///* ---- create --------------------------------------------------------------- */
}
