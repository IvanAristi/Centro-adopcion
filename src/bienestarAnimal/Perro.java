
package bienestarAnimal;

public class Perro extends Animal {

    private String raza;
    
    public Perro() {
    }

    public Perro(String raza, String nombre, String color, char sexo, boolean salud) {
        super(nombre, color, sexo,salud);
        this.raza = raza;
          
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    @Override
    public String toString() {
        return "Perro{" + "raza=" + raza + '}';
    }
    

}
