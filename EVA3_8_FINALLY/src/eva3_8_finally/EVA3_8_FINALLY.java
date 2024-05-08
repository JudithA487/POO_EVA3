/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_8_finally;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author acost
 */
public class EVA3_8_FINALLY {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try{
        Scanner captu = new Scanner(System.in);
        System.out.println("Introduce un numero entero: ");
        int nume = captu.nextInt();
        System.out.println("El valor capturado es: " + nume);
    }catch(InputMismatchException e){
        //lo que queremos hacer con la excepcion
        System.out.println("El valor introducido no es un numero entero");}
     finally{
             //usar para ejecutar codigo critico para el programa
             //terminar procesos, cerrar archivos o conexiones 
             //liberar recursos etc
             //NADA EVITA QUE SE PUEDA PRODUCIR UNA EXCEPCION EN ESTE
             //BLOQUE DE CODIGO
             /*int x = 100, y = 0;
             int divi = x / y;*/
             System.out.println("ESTA INSTRUCCION SIEMPRE SE VA A EJECUTAR");
             }
    }
    }
    

