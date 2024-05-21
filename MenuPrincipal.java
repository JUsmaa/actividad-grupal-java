import java.util.Scanner;

public class MenuPrincipal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            mostrarMenu();
            opcion = scanner.nextInt();

            switch(opcion) {
                case 1:
                    caidaLibre(scanner);
                    break;
                case 2:
                    leyesDeNewton(scanner);
                    break;
                case 3:
                    momentoYEquilibrio(scanner);
                    break;
                case 0:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida, por favor intenta de nuevo.");
            }
        } while(opcion != 0);

        scanner.close();
    }

    private static void mostrarMenu() {
        System.out.println("Ingrese el número del ejercicio que quieres realizar:");
        System.out.println("1. Caída libre");
        System.out.println("2. Leyes de Newton");
        System.out.println("3. Momento y equilibrio");
        System.out.println("0. Salir");
    }

    private static void caidaLibre(Scanner scanner) {
        System.out.print("Ingrese el tiempo de caída (en segundos): ");
        double tiempo = scanner.nextDouble();

        final double g = 9.81; // Aceleración debido a la gravedad en m/s^2
        double altura = 0.5 * g * tiempo * tiempo; // h = (1/2) * g * t^2

        System.out.printf("La altura desde la cual el objeto cayó es: %.2f metros%n", altura);
    }

    private static void leyesDeNewton(Scanner scanner) {
        System.out.print("Ingrese la masa del objeto (en kilogramos): ");
        double masa = scanner.nextDouble();

        System.out.print("Ingrese la aceleración (en m/s^2): ");
        double aceleracion = scanner.nextDouble();

        double fuerza = masa * aceleracion; // F = m * a

        System.out.printf("La fuerza aplicada al objeto es: %.2f Newtons%n", fuerza);
    }

    private static void momentoYEquilibrio(Scanner scanner) {
        System.out.print("Ingrese la fuerza aplicada (en Newtons): ");
        double fuerza = scanner.nextDouble();

        System.out.print("Ingrese la distancia desde el punto de apoyo (en metros): ");
        double distancia = scanner.nextDouble();

        double momento = fuerza * distancia; // M = F * d

        System.out.printf("El momento de fuerza es: %.2f Newton-metros%n", momento);
    }
}