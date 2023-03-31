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

/**
 * The type Player.
 */
public class Player {
    /**
     * The id.
     */
///* ---- Konstante ------------------------------------------------------------ */
    ///* ---- Attribute ------------------------------------------------------------ */
    private final long id;
    /**
     * The Symbol.
     */
    private Symbol symbol = Symbol.EMPTY;
    /**
     * The Name.
     */
    private final String name;

    /**
     * Instantiates a new Player.
     *
     * @param id   the uid
     * @param name the name
     */
///* ---- Start ---------------------------------------------------------------- */
    ///* ---- Konstruktor ---------------------------------------------------------- */
    public Player(long id, String name) {
        this.id = id;
        this.name = name;
    }

    ///* ---- Initialisierung ------------------------------------------------------ */
    ///* ---- Logik ---------------------------------------------------------------- */
    ///* ---- get/is/set/add ------------------------------------------------------- */

    /**
     * Sets symbol.
     *
     * @param symbol the symbol
     */
    public void setSymbol(Symbol symbol) {
        this.symbol = symbol;
    }

    /**
     * Gets uid.
     *
     * @return the uid
     */
    public long getID() {
        return this.id;
    }

    /**
     * Gets name.
     *
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Gets symbol.
     *
     * @return the symbol
     */
    public Symbol getSymbol() {
        // throw error if symbol is not set
        if (symbol.equals(Symbol.EMPTY) || symbol == null)
            // TODO: handle Exception
            throw new NullPointerException();
        return symbol;
    }
    ///* ---- create --------------------------------------------------------------- */
}
