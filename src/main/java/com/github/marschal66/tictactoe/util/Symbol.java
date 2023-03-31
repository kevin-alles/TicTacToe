/*
 * Project     : TicTacToe
 * Classname   : Symbol
 * Version     : 1
 * Date        : 09.01.2023 21:32
 * Author      : <a href="mailto:marschal66@web.de">Marschal66</a>
 * Copyright(c): Marschal66 2023
 */
package com.github.marschal66.tictactoe.util;

public enum Symbol {
    ///* ---- Konstante ------------------------------------------------------------ */
    EMPTY(0, " "),
    CROSS(1, "X"),
    CIRCLE(2, "#");
    ///* ---- Attribute ------------------------------------------------------------ */
    private final int id;
    private final String printedSymbol;

    ///* ---- Start ---------------------------------------------------------------- */
    ///* ---- Konstruktor ---------------------------------------------------------- */
    Symbol(int id, String printedSymbol) {
        this.id = id;
        this.printedSymbol = printedSymbol;
    }

    ///* ---- Initialisierung ------------------------------------------------------ */
    ///* ---- Logik ---------------------------------------------------------------- */
    ///* ---- get/is/set/add ------------------------------------------------------- */
    @Override
    public String toString() {
        return this.printedSymbol;
    }

    public int getID() {
        return this.id;
    }
    ///* ---- create --------------------------------------------------------------- */
}
