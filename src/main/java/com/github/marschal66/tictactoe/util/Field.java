/*
 * Project     : TicTacToe
 * Classname   : Field
 * Version     : 1
 * Date        : 10.01.2023 13:43
 * Author      : <a href="mailto:marschal66@web.de">Marschal66</a>
 * Copyright(c): Marschal66 2023
 */
package com.github.marschal66.tictactoe.util;

import com.github.marschal66.tictactoe.main.GameApplication;

import java.util.HashMap;

public class Field {
    ///* ---- Konstante ------------------------------------------------------------ */
    private final GameApplication main;
    ///* ---- Attribute ------------------------------------------------------------ */
    private final HashMap<Integer, Symbol> field;

    ///* ---- Start ---------------------------------------------------------------- */
    ///* ---- Konstruktor ---------------------------------------------------------- */
    public Field(GameApplication main) {
        this.main = main;

        main.getLogger().log("Empty Field created");
        field = new HashMap<>();
        for (int i = 0; i < 9; i++) {
            setSymbol(i, Symbol.EMPTY);
        }
    }

    ///* ---- Initialisierung ------------------------------------------------------ */
    ///* ---- Logik ---------------------------------------------------------------- */
    ///* ---- get/is/set/add ------------------------------------------------------- */
    public void setSymbol(int position, Symbol symbol) {
        main.getLogger().log("Symbol " + (symbol == Symbol.EMPTY ? "EMPTY" : symbol) + " set at position " + position);
        field.put(position, symbol);
    }

    public Symbol getSymbol(int position) {
        return field.get(position);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("---------------------\n");
        for (int i = 0; i < 9; i++) {
            stringBuilder.append(field.get(i) == Symbol.EMPTY ? i : field.get(i));
            if (i % 3 == 2) {
                stringBuilder.append("\n");
            } else {
                stringBuilder.append("|");
            }
            if (i == 2 || i == 5) {
                stringBuilder.append("-----\n");
            }
        }
        stringBuilder.append("---------------------\n");
        return stringBuilder.toString();
    }
    ///* ---- create --------------------------------------------------------------- */
}
