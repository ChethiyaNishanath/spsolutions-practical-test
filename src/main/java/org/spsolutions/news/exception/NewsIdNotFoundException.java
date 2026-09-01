package org.spsolutions.news.exception;

public class NewsIdNotFoundException extends RuntimeException {
    public NewsIdNotFoundException(String message) {
        super(message);
    }
}
