/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

/**
 *
 * @author psaxena
 */
public class NameFormatException extends Exception {
    
    private static final String ERROR_MSG =
            "Sorry, must enter first and last name.";

    public NameFormatException() {
        super(ERROR_MSG);
    }
    
    public NameFormatException(String message, Throwable cause) {
        super(ERROR_MSG, cause);
    }

    public NameFormatException(String message) {
        super(ERROR_MSG);
    }
    
    
    
}
