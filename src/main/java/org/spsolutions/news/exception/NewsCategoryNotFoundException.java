package org.spsolutions.news.exception;

public class NewsCategoryNotFoundException extends RuntimeException {
    public NewsCategoryNotFoundException(String message) {
        super(message);
    }
}
