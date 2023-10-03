
package bienestarAnimal;


public class Gato extends Animal {

    public Gato() {
    }

    public Gato(String nombre, String color, char sexo, boolean salud) {
        super(nombre, color, sexo, salud);
        
        
    }
   
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append('}');
        return sb.toString();
    }
 
    
    
    
}
