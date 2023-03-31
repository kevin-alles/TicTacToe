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
    private final GameApplication gameApplication;
    ///* ---- Attribute ------------------------------------------------------------ */
    private final HashMap<Integer, Symbol> field;

    ///* ---- Start ---------------------------------------------------------------- */
    ///* ---- Konstruktor ---------------------------------------------------------- */
    public Field(GameApplication gameApplication) {
        this.gameApplication = gameApplication;
        System.out.println(gameApplication.getPrefix() + "create new field");

        field = new HashMap<>();
        for (int i = 0; i < 9; i++) {
            field.put(i, Symbol.EMPTY);
        }
    }

    ///* ---- Initialisierung ------------------------------------------------------ */
    ///* ---- Logik ---------------------------------------------------------------- */
    ///* ---- get/is/set/add ------------------------------------------------------- */
    public void setSymbol(int position, Symbol symbol) {
        field.put(position, symbol);
    }

    public Symbol getSymbol(int position) {
        return field.get(position);
    }
    ///* ---- create --------------------------------------------------------------- */
}
