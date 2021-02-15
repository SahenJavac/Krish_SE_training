package geniusmobile.exceptions;

/**
 *
 * @author sahen
 */
public class OrderFailureException extends Exception {

    public OrderFailureException(String message, Exception e) {
        super(message, e);

    }

}
