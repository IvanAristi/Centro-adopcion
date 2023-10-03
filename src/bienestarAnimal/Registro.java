
package bienestarAnimal;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;


public class Registro {
     List<Persona> listaPersonas;
    Persona persona;
    Empleado empleado;
    Cliente cliente;
    Animal animal;
    Centroadopcion centro;
   int opc;
   
   public Registro (){  
     this.listaPersonas = new ArrayList<>();  
   }

   public Registro (Cliente cliente,Persona persona,Centroadopcion centro){
       this.cliente=cliente;
       this.centro = centro;
       this.centro = new Centroadopcion(opc, empleado, animal);
      
   }
   public Registro (Empleado empleado, Persona persona,Centroadopcion centro){
       this.empleado=empleado;
       this.persona = persona;
       this.centro = centro;
      
   }
   
    public Registro(int opc,Centroadopcion centro) {
        this.centro = centro;
        this.opc = opc;
        
    }
   
   public void opcRegistro(){
        
       this.opc = Integer.parseInt(JOptionPane.showInputDialog("\t \n BIENVENIDO \n COMO DESEA REGISTRARSE? \n DIGITE '1' PARA REGISTRARSE COMO CLIENTE \n DIGITE '2' PARA REGISTRARSE COMO EMPLEADO DEL CENTRO DE ADOPCION "));
     switch (opc){
         case 1: registroCliente();
                
         
         break;
     case 2 : registroEmpleado();
            this.centro.accionEmpleado();
     break;
     
     default: JOptionPane.showMessageDialog(null, "OPCION NO VALIDA ");
     
     }
   }
    public void registroCliente(){
        Cliente cliente = new Cliente ();
        this.listaPersonas.add(cliente);
      JOptionPane.showMessageDialog(null, "BIENVENIDO \n SU REGISTRO SERA COMO CLIENTE\n GRACIAS POR CONTRIBUIR AL CUIDADO DE LOS ANIMALES ");
       cliente.setNombre(JOptionPane.showInputDialog("DIGITE SU NOMBRE"));
        cliente.setApellido(JOptionPane.showInputDialog("DIGITE SU APELLIDO"));
        cliente.setIdentificacion(Integer.parseInt(JOptionPane.showInputDialog("DIGITE SU contraseña")));
        JOptionPane.showMessageDialog(null, "BIENVENIDO AL CENTRO DE ADOPCION \n \t " +cliente.getNombre().toUpperCase() +"SU REGISTRO FUE EXITOSO! \n" );
    }
   
    public void registroEmpleado(){
    Empleado empleado = new Empleado();
     this.listaPersonas.add(empleado);
    JOptionPane.showMessageDialog(null, "\tBIENVENIDO \n SU REGISTRO SERA COMO EMPLEADO DEL CENTRO DE ADOPCION\n GRACIAS POR CONTRIBUIR AL CUIDADO DE LOS ANIMALES \n"); 
    empleado.setNombre(JOptionPane.showInputDialog("DIGITE SU NOMBRE"));
        empleado.setApellido(JOptionPane.showInputDialog("DIGITE SU APELLIDO"));
        empleado.setIdentificacion(Integer.parseInt(JOptionPane.showInputDialog("DIGITE SU contraseña")));
    JOptionPane.showMessageDialog(null, "BIENVENIDO A NUESTRO  CENTRO DE ADOPCION \n \t" +empleado.getNombre().toUpperCase() + " \n SU REGISTRO FUE EXITOSO! \n" );
    
    }
    
    
    public void mostrarRegistro(){
     
     if   (this.listaPersonas != null){
         for(Persona a : listaPersonas){
             JOptionPane.showMessageDialog(null, "Personas registradas " +a.getNombre() + "" +a.toString());
         }
         }else{
              JOptionPane.showMessageDialog(null, "no hay registro de personas " );   
                 } 
     
     }
    }

        
        
    
    

    
 
     

