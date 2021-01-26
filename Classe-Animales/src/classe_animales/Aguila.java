package classe_animales;

public class Aguila extends Animales {

    public Aguila(String animal, String nombre, Integer edad, Integer patas, Integer alas, String color) {
        super(animal, nombre, edad, patas, alas, color);
    }

    public void mostrarDatos() {
        System.out.println("Animal: " + getAnimal()
                + "\nNombre:" + getNombre()
                + "\nEdad:" + getEdad()
                + "\nPatas:" + getPatas()
                + "\nAlas:" + getAlas()
                + "\nColor:" + getColor());
    }

    @Override
    public String cuantoVive() {
        return "VIVE ALREDEDOR DE 20 ANIOS";
    }
}
