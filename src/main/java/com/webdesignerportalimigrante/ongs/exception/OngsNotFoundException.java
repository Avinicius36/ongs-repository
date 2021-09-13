package com.webdesignerportalimigrante.ongs.exception;

public class OngsNotFoundException extends RuntimeException {
    public OngsNotFoundException(Long id) {
        super("Could not find an Ong with this ID: " + id);
    }
}
