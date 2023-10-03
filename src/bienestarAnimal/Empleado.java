
package bienestarAnimal;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;

public class Empleado extends Persona implements Itrabajoempleado {
   
    List<Animal> listaAnimales;
    
    public Empleado(){
       listaAnimales = new ArrayList();  
    }

    public Empleado(String nombre, String apellido, int identificacion) {
        super(nombre, apellido, identificacion);
         listaAnimales = new ArrayList();
    }

   

    @Override
    public void registrarAnimales(Animal animal) {
        
    if (!animalestaRegistrado(animal)) {
        Date hora = new Date ();
        listaAnimales.add(animal);
        JOptionPane.showMessageDialog(null, "ANIMAL REGISTRADO CON EXITO" + hora);
    } else {
        JOptionPane.showMessageDialog(null, "ESTE ANIMAL YA ESTA REGISTRADO");
     
       }   
    }

private boolean animalestaRegistrado(Animal animal) {
    for (Animal a : listaAnimales) {
        if (a.getIdAnimal() == animal.getIdAnimal()) {
            return true; 
        }
    }
    return false;
}

    @Override
    public void eliminarAnimal(Animal animal) {
        if(!animalestaRegistrado( animal)){
           JOptionPane.showMessageDialog(null, "EL ANIMAL AUN NO HASIDO REGISTRADO");
    }else{
         JOptionPane.showMessageDialog(null, "MASCOTA YA NO SE ENCUENTRA ");
          this.listaAnimales.remove(animal);
        }
       
    }

    public void mostrarlistaAnimales() {
        JOptionPane.showMessageDialog(null, "LISTA DE ANIMALES DISPONIBLES");
         for (Animal a : listaAnimales) {
             JOptionPane.showMessageDialog(null, a.getNombre());        
         }  
    }

    @Override
    public void adoptarAnimales() {
        
    }
     @Override
    public String toString() {
        return "Empleado{" + '}';
    }
}
