
package bienestarAnimal;

import javax.swing.JOptionPane;


public class Cliente extends Persona {
    private Empleado empleado;

    
    public Cliente() {
    }

    public Cliente(String nombre, String apellido, int identificacion,Empleado atendedor){
        super(nombre, apellido, identificacion);
        this.empleado=atendedor;
        
    }
    public void mostrarListaAnimales(){
       if (this.empleado != null){
           empleado.mostrarlistaAnimales();
       }else{
           JOptionPane.showMessageDialog(null, "EL CLIENTE NO TIENE UN EMPLEADO ASIGNADO");
       }
       
    }
    
    @Override
    public void adoptarAnimales() {
          
    }

    @Override
    public String toString() {
        return "Cliente    " + "empleado  que lo atiende=" + empleado + '}';
    }
    
    
}
