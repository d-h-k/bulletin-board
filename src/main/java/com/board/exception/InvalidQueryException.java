package com.board.exception;

public class InvalidQueryException extends RuntimeException {
    public InvalidQueryException(String string) {
        super("Invalid Query String [" + string + "] is unknown, please check API guide or Contact us");
    }
}
