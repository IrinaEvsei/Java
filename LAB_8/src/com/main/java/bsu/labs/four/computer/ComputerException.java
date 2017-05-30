package com.main.java.bsu.labs.four.computer;

import java.io.IOException;

/**
 * Created by irisha on 29.05.2017.
 */
public class ComputerException extends IOException {
    public ComputerException(){}

    public ComputerException(String message, Throwable exception) {
        super(message, exception);
    }

    public ComputerException(String message) {
        super(message);
    }

    public ComputerException(Throwable exception) {
        super(exception);
    }
}
