package classe_animales;

public abstract class Animales {

    private String animal;
    private String nombre;
    private Integer edad;
    private Integer patas;
    private Integer alas;
    private String color;

    public Animales(String animal, String nombre, Integer edad, Integer patas, Integer alas, String color) {
        this.animal = animal;
        this.nombre = nombre;
        this.edad = edad;
        this.patas = patas;
        this.alas = alas;
        this.color = color;
    }

    public String getAnimal() {
        return animal;
    }

    public String getNombre() {
        return nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    public Integer getPatas() {
        return patas;
    }

    public Integer getAlas() {
        return alas;
    }

    public String getColor() {
        return color;
    }

    public abstract String cuantoVive();

}
