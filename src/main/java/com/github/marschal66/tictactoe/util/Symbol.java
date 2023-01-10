/*
 * Project     : TicTacToe
 * Classname   : Symbol
 * Version     : 1
 * Date        : 09.01.2023 21:32
 * Author      : <a href="mailto:marschal66@web.de">Marschal66</a>
 * Copyright(c): Marschal66 2023
 */
package com.github.marschal66.tictactoe.util;

/**
 * The enum Symbol.
 */
public enum Symbol {
    /**
     * Empty symbol.
     */
///* ---- Konstante ------------------------------------------------------------ */
    EMPTY(0),
    /**
     * Cross symbol.
     */
    CROSS(1),
    /**
     * Circle symbol.
     */
    CIRCLE(2);
    /**
     * The Id.
     */
///* ---- Attribute ------------------------------------------------------------ */
    private final int id;

    /**
     * Instantiates a new Symbol.
     *
     * @param id the id
     */
///* ---- Start ---------------------------------------------------------------- */
    ///* ---- Konstruktor ---------------------------------------------------------- */
    Symbol(int id) {
        this.id = id;
    }

    /**
     * Gets id.
     *
     * @return the id
     */
///* ---- Initialisierung ------------------------------------------------------ */
    ///* ---- Logik ---------------------------------------------------------------- */
    ///* ---- get/is/set/add ------------------------------------------------------- */
    public int getID() {
        return this.id;
    }
    ///* ---- create --------------------------------------------------------------- */
}
