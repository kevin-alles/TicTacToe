/*
 * Project     : TicTacToe
 * Classname   : Logger
 * Version     : 1
 * Date        : 31.03.2023 09:21
 * Author      : <a href="mailto:marschal66@web.de">Marschal66</a>
 * Copyright(c): Marschal66 2023
 */
package com.github.marschal66.tictactoe.logging;

public class Logger {
    ///* ---- Konstante ------------------------------------------------------------ */
    private final String defaultPrefix;
    private final boolean defaultEol;

    ///* ---- Attribute ------------------------------------------------------------ */
    ///* ---- Start ---------------------------------------------------------------- */
    ///* ---- Konstruktor ---------------------------------------------------------- */
    public Logger(String defaultPrefix, boolean defaultEol) {
        this.defaultPrefix = defaultPrefix;
        this.defaultEol = defaultEol;
    }

    ///* ---- Initialisierung ------------------------------------------------------ */
    ///* ---- Logik ---------------------------------------------------------------- */
    public void log(String message) {
        log(message, defaultEol);
    }

    public void log(String message, boolean eol) {
        log(message, eol, defaultPrefix);
    }

    public void log(String message, String prefix) {
        log(message, defaultEol, prefix);
    }

    public void log(String message, boolean eol, String prefix) {
        System.out.print(prefix + message + (eol ? "\n" : ""));
    }

    ///* ---- get/is/set/add ------------------------------------------------------- */
    ///* ---- create --------------------------------------------------------------- */
}
