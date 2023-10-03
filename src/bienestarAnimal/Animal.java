
package bienestarAnimal;

/**
 *
 * @author dariv
 */
public class Animal {
    private String nombre,color;
    private char sexo;
    private int idAnimal;
    private boolean salud= false;
    private static int contAnimal;
    

    public Animal (){
        
    }
    
    
    public Animal(String nombre, String color, char sexo, boolean salud) {
        this.nombre = nombre;
        this.color = color;
        this.sexo = sexo;
        this.salud=salud;
        this.idAnimal = ++Animal.contAnimal;  
    }

   

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public int getIdAnimal() {
        return idAnimal;
    }

    public void setIdAnimal(int idAnimal) {
        this.idAnimal = idAnimal;
    }

    @Override
    public String toString() {
        return "Animal{" + "nombre=" + nombre + ", color=" + color + ", sexo=" + sexo + ", idAnimal=" + idAnimal + '}';
    }
    
    
    
    
    
     
}
