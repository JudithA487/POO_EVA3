/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_11_custom_exception;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author acost
 */
public class EVA3_11_CUSTOM_EXCEPTION {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            // TODO code application logic here
            mensaje();
        } catch (MiException ex) {
            ex.printStackTrace();
        }
    }
    public static void mensaje() throws MiException{
        System.out.println("mensaje");
        throw new MiException("Falla del sistem!!");
    }
    
}
class MiException extends Exception{

    public MiException() {
    }

    public MiException(String message) {
        super(message);
    }
    
}