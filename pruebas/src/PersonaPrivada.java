import java.util.Scanner;

public class PersonaPrivada {
    private String nombre;
    private int edad;
    private double altura;

    public PersonaPrivada(String nombre, int edad, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.altura = altura;
    }

    public void mostrarDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Altura: " + altura + " metros");
    }

    public boolean esMayorDeEdad() {
        return edad >= 18;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el nombre: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese la edad: ");
        int edad = scanner.nextInt();

        System.out.print("Ingrese la altura (en metros): ");
        double altura = scanner.nextDouble();

        PersonaPrivada persona = new PersonaPrivada(nombre, edad, altura);

        persona.mostrarDatos();

        if (persona.esMayorDeEdad()) {
            System.out.println(nombre + " es mayor de edad.");
        } else {
            System.out.println(nombre + " no es mayor de edad.");
        }

        scanner.close();
    }
}