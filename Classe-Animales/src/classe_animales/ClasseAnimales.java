package classe_animales;

public class ClasseAnimales {

    public static void main(String[] args) {

        Perro perro = new Perro("Perro", "Firulais", 5, 4, 0, "Blanco");

        Gato gato = new Gato("Gato", "kirara", 3, 4, 0, "Negro");

        Aguila aguila = new Aguila("Ave", "Pollito", 1, 0, 2, "Calva Blanca Cuerpo Plateado");

        perro.mostrarDatos();
        System.out.println(perro.cuantoVive());
        System.out.println("********************************\n");
        gato.mostrarDatos();
        System.out.println(gato.cuantoVive());
        System.out.println("********************************\n");
        aguila.mostrarDatos();
        System.out.println(aguila.cuantoVive());
        System.out.println("********************************\n");

    }
}
