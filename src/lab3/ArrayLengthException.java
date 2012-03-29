/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

/**
 *
 * @author psaxena
 */
public class ArrayLengthException extends Exception{

    private static final String ERROR_MSG =
            "Sorry, your array index is out of bound.";
    
    public ArrayLengthException() {
        super(ERROR_MSG);
    }  
    
    public ArrayLengthException(String message, Throwable cause) {
        super(ERROR_MSG, cause);
    }

    public ArrayLengthException(String message) {
        super(ERROR_MSG);
    }  
    
}
