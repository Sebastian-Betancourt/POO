import java.util.Scanner;

public class Taller {
    public static void main(String[] args) {
        // Crear una instancia de Scanner
        Scanner input = new Scanner(System.in);

        // Leer el nombre del usuario
        System.out.print("Ingresa tu nombre: ");
        String nombre = input.nextLine();

        // Leer la edad del usuario
        System.out.print("Ingresa tu edad: ");
        int edad = input.nextInt();

        // Leer la altura del usuario
        System.out.print("Ingresa tu altura en metros (por ejemplo, 1.75): ");
        double altura = input.nextDouble();

        // Mostrar la información ingresada
        System.out.println("Información del usuario:");
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Altura: " + altura + " metros");

        // Cerrar el scanner
        input.close();
    }
}
