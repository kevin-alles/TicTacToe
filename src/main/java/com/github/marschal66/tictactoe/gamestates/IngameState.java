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
import com.github.marschal66.tictactoe.util.Symbol;

import java.util.List;

/**
 * The type Ingame state.
 */
public class IngameState extends GameState {
    /**
     * Start.
     */
///* ---- Konstante ------------------------------------------------------------ */
    private final GameStateManager gameStateManager;
    private final GameApplication main;
    ///* ---- Attribute ------------------------------------------------------------ */
    private List<Player> players;
    private Field field;

    ///* ---- Start ---------------------------------------------------------------- */
    @Override
    public void start() {
        main.getLogger().log("IngameState started");
        players = main.getPlayers();

        this.field = new Field(main);
        gameHandler();
    }

    /**
     * Stop.
     */
    @Override
    public void stop() {

    }

    ///* ---- Konstruktor ---------------------------------------------------------- */
    public IngameState(GameStateManager gameStateManager, GameApplication main) {
        this.gameStateManager = gameStateManager;
        this.main = main;
    }

    ///* ---- Initialisierung ------------------------------------------------------ */
    ///* ---- Logik ---------------------------------------------------------------- */
    private void gameHandler() {
        int currentPlayerIndex = 0;
        while (!turn(players.get(currentPlayerIndex))) {
            currentPlayerIndex = currentPlayerIndex == 0 ? 1 : 0;
            main.getLogger().log("CurrentPlayerIndex: " + currentPlayerIndex);
            if (isDraw()) {
                break;
            }
        }
        StringBuilder message = new StringBuilder();
        message.append("\n").append(field.toString());
        if (isDraw()) {
            message.append("Draw!");
        } else {
            message.append("Player '").append(players.get(currentPlayerIndex).getName()).append("' won!");
        }
        main.getLogger().log(message.toString());
        for (Player player : players) {
            player.sendMessage(message.toString());
        }
        gameStateManager.setGameState(GameState.ENDGAME_STATE);
    }

    private boolean isDraw() {
        for (int i = 0; i < 9; i++) {
            if (field.getSymbol(i) == Symbol.EMPTY) {
                return false;
            }
        }
        return !isWin();
    }

    private boolean isWin() {
        // check rows
        for (int i = 0; i < 3; i++) {
            if (field.getSymbol(i * 3) == field.getSymbol(i * 3 + 1) && field.getSymbol(i * 3) == field.getSymbol(i * 3 + 2) && field.getSymbol(i * 3) != Symbol.EMPTY) {
                return true;
            }
        }

        // check columns
        for (int i = 0; i < 3; i++) {
            if (field.getSymbol(i) == field.getSymbol(i + 3) && field.getSymbol(i) == field.getSymbol(i + 6) && field.getSymbol(i) != Symbol.EMPTY) {
                return true;
            }
        }

        // check diagonals
        if (field.getSymbol(0) == field.getSymbol(4) && field.getSymbol(0) == field.getSymbol(8) && field.getSymbol(0) != Symbol.EMPTY) {
            return true;
        } else {
            return field.getSymbol(2) == field.getSymbol(4) && field.getSymbol(2) == field.getSymbol(6) && field.getSymbol(2) != Symbol.EMPTY;
        }
    }

    private boolean turn(Player player) {
        main.getLogger().log("Turn of " + player.getName());
        int pos = -1;

        do {
            if (pos != -1) {
                player.sendMessage("Invalid Input!");
            }
            pos = player.getInput("\n" + field.toString() + "Enter the Field you want to mark: ");
            main.getLogger().log("Player " + player.getName() + " entered " + pos);
        } while (field.getSymbol(pos) != Symbol.EMPTY);
        field.setSymbol(pos, player.getSymbol());

//        main.getLogger().log("Field: \n" + field.toString());

        return isWin();
    }
    ///* ---- get/is/set/add ------------------------------------------------------- */
    ///* ---- create --------------------------------------------------------------- */
}
