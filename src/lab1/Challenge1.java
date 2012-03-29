package lab1;

import javax.swing.JOptionPane;

/**
 * The purpose of this challenge is to give you practice time using Java
 * Exception handling techniques. <p> Your challenge is to consider all the
 * possible things that can go wrong with this program and use exception
 * handling where appropriate to prevent the program from crashing. In addition
 * you must display a friendly error message in a JOptionPane and ask the user
 * to try again.
 *
 * @author Jim Lombardo, jlombardo@wctc.edu
 * @version 1.00
 */
public class Challenge1 {

    private static final int LAST_NAME_IDX = 1;

    public static void main(String[] args) {
        Challenge1 app = new Challenge1();
        try {
            String fullName = JOptionPane.showInputDialog("Enter full name:");
            String lastName = app.extractLastName(fullName);
            String msg = "Your last name is: " + lastName;
            JOptionPane.showMessageDialog(null, msg);
        } catch (ArrayIndexOutOfBoundsException ex) {
            JOptionPane.showMessageDialog(null, "Sorry, your array index is out of bound.",
                     "Gracefull Problem Recovery", JOptionPane.ERROR_MESSAGE);
        }
        catch (IllegalArgumentException nx) {
            JOptionPane.showMessageDialog(null, "Sorry, must enter first and last name.",
                     "Gracefull Problem Recovery", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public String extractLastName(String fullName) throws RuntimeException{
        if (fullName == null || fullName.length() == 0){
            throw new IllegalArgumentException();
        }
        String[] nameParts = fullName.split(" ");
        return nameParts[nameParts.length - 1];
    }
}
