/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bienestarAnimal;

/**
 *
 * @author dariv
 */
abstract public class Persona {
    private String nombre;
    private String apellido;
    private int identificacion;

    public Persona (){
        
    }
    
    
    public Persona(String nombre, String apellido, int identificacion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.identificacion = identificacion;
    }

    public int getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(int identificacion) {
        this.identificacion = identificacion;
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
    
    public abstract void adoptarAnimales();

    @Override
    public String toString() {
        return "{" + "nombre=" + nombre + ", apellido=" + apellido + ", apellido=" + apellido + ", identificacion=" + identificacion + '}';
    }
    

    
}
