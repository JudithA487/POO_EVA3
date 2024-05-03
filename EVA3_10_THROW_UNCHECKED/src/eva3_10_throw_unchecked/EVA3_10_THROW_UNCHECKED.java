/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_10_throw_unchecked;

/**
 *
 * @author acost
 */
public class EVA3_10_THROW_UNCHECKED {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        Persona perso = new Persona(); 
        perso.setNombre("Judtih");
        perso.setApellido("Acosta");
        perso.setEdad(19);
                
              
       
    }
    
}
class Persona{
    String nombre;
    String apellido;
    private int edad;

    public Persona() {
        this.nombre = " ";
        this.apellido = " ";
        this.edad = 0;
    }

    public Persona(String nombre, String apellido, int edad) throws Exception {
        this.nombre = nombre;
        this.apellido = apellido;
        if((edad < 0) || (edad > 150))
            throw new RuntimeException("Valor capturado en la edad no es valido");
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) throws Exception {
        if((edad < 0) || (edad > 150))
           throw new RuntimeException("Valor capturado en la edad no es valido");
        this.edad = edad;
    }
    
    }
