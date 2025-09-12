package br.com.fiap3espa.exception;

public class CEPNotFoundException extends RuntimeException {
    public CEPNotFoundException(String message) {
        super(message);
    }
}
