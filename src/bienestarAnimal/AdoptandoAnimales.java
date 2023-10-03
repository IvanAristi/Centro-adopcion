
package bienestarAnimal;

import javax.swing.JOptionPane;


public class AdoptandoAnimales {
    
    
    public static void main(String[] args) {
        
    Gato gato1 = new Gato("tequila", "blanco", 'm', true);
    Perro perro1 = new Perro ("pastor", "lucas", "negro", 'm', true);
    Empleado empleado = new Empleado();
    Centroadopcion centro = new Centroadopcion(0, empleado, perro1);
 Registro registro = new Registro ();
 
 registro.opcRegistro();
 
 registro.mostrarRegistro();
 
         
     
       
       
    }
}
