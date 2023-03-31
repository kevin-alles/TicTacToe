/*
 * Project     : TicTacToe
 * Classname   : Players
 * Version     : 1
 * Date        : 09.01.2023 21:29
 * Author      : <a href="mailto:marschal66@web.de">Marschal66</a>
 * Copyright(c): Marschal66 2023
 */
package com.github.marschal66.tictactoe.user;

import com.github.marschal66.tictactoe.util.Symbol;

import java.util.Scanner;

public class Player {
    ///* ---- Konstante ------------------------------------------------------------ */
    ///* ---- Attribute ------------------------------------------------------------ */
    private final long id;
    private Symbol symbol = Symbol.EMPTY;
    private final String name;

    ///* ---- Start ---------------------------------------------------------------- */
    ///* ---- Konstruktor ---------------------------------------------------------- */
    public Player(long id, String name) {
        this.id = id;
        this.name = name;
    }

    ///* ---- Initialisierung ------------------------------------------------------ */
    ///* ---- Logik ---------------------------------------------------------------- */
    ///* ---- get/is/set/add ------------------------------------------------------- */

    public void setSymbol(Symbol symbol) {
        this.symbol = symbol;
    }

    public long getID() {
        return this.id;
    }

    public String getName() {
        return name;
    }

    public Symbol getSymbol() {
        // throw error if symbol is not set
        if (symbol.equals(Symbol.EMPTY) || symbol == null)
            // TODO: handle Exception
            throw new NullPointerException();
        return symbol;
    }

    public Integer getInput(String message) {
        Scanner scanner = new Scanner(System.in);
        sendMessage(message);
        return scanner.nextInt();
    }

    public void sendMessage(String message) {
        System.out.println("[" + getName() + "] " + message);
    }
    ///* ---- create --------------------------------------------------------------- */
}
