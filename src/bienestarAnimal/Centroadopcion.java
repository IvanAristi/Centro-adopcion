
package bienestarAnimal;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;


public class Centroadopcion {
   
    
  Empleado empleado;
  Animal animal;
  int opc;
  
      public Centroadopcion(int opc,Empleado empleado, Animal animal){
       this.empleado = empleado;
       this.animal=animal;
       this.opc=opc;
       
   }
    
    
    public void accionEmpleado(){
         this.opc = Integer.parseInt(JOptionPane.showInputDialog("DIGITE LA OPCION QUE  DESEA REALIZAR \n '1' para registrar una animal \n '2' para eliminar un animal \n '3' para mostrar la lista de animales"));
        switch(opc){
            case 1: this.empleado.registrarAnimales(animal);
            break;
            
            case 2: this.empleado.eliminarAnimal(animal);
            break;
            
            case 3: this.empleado.mostrarlistaAnimales();
            break;
            
            default: JOptionPane.showMessageDialog(null, "OPCION NO VALIDA ");
        }
    
   
    }
}
