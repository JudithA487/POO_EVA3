/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_7_uso_exception;

import java.util.Scanner;

/**
 *
 * @author acost
 */
public class EVA3_7_USO_EXCEPTION {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
    try{  
        Scanner captu = new Scanner(System.in);
       System.out.println("Introduce un numero: ");
        int nume = captu.nextInt();
        
        for (int i = nume; i <= nume; i++) {
            System.out.println("nume");
        }
    }catch(Exception e){
        e.printStackTrace();
    }
    int nume = 0;
    switch(nume){
        case 1:
            System.out.println("Introduce un numero: ");
            break;
            
            
    }
       
    }
    
}
