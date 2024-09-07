package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion = 0;

        while (opcion != 3) {
            System.out.println("=== Bienvenido al Inicio_Homebanking ===");
            System.out.println("Seleccione una opción:");
            System.out.println("1. Iniciar sesión");
            System.out.println("2. Crear cuenta");
            System.out.println("3. Salir");

            try {
                opcion = Integer.parseInt(scanner.nextLine());

                switch (opcion) {
                    case 1:
                        Usuario.iniciarSesion(scanner);
                        break;
                    case 2:
                        Usuario.CrearCuenta(scanner);
                        break;
                    case 3:
                        System.out.println("Saliendo...");
                        break;
                    default:
                        System.out.println("Opción no válida. Intente de nuevo.");
                        break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Por favor, ingrese un número válido.");
            }
        }

        scanner.close();
    }

    public static class HomeBanking {
        // Método para mostrar el menú de homebanking
        public static void mostrarMenu(Scanner scanner) {
            int opcion = 0;

            while (opcion != 3) {
                System.out.println("=== Menú de Inicio_Homebanking ===");
                System.out.println("1. Consultar saldo");
                System.out.println("2. Realizar transferencia");
                System.out.println("3. Salir");

                try {
                    opcion = Integer.parseInt(scanner.nextLine());

                    switch (opcion) {
                        case 1:
                            System.out.println("Su saldo es: $1000.00");
                            break;
                        case 2:
                            Transaccion.transaccion(scanner);
                            break;
                        case 3:
                            System.out.println("Saliendo de Inicio_Homebanking...");
                            break;
                        default:
                            System.out.println("Opción no válida. Intente de nuevo.");
                            break;
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Por favor, ingrese un número válido.");
                }
            }
        }
    }

    public static class Inicio {
        // Método para mostrar el menú de homebanking
        public static void mostrarMenu(Scanner scanner) {
            int opcion = 0;

            while (opcion != 3) {
                System.out.println("=== Menú de Inicio_Homebanking ===");
                System.out.println("1. Consultar saldo");
                System.out.println("2. Realizar transferencia");
                System.out.println("3. Salir");

                try {
                    opcion = Integer.parseInt(scanner.nextLine());

                    switch (opcion) {
                        case 1:
                            System.out.println("Su saldo es: $1000.00");
                            break;
                        case 2:
                            Transaccion.transaccion(scanner);
                            break;
                        case 3:
                            System.out.println("Saliendo de Inicio_Homebanking...");
                            break;
                        default:
                            System.out.println("Opción no válida. Intente de nuevo.");
                            break;
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Por favor, ingrese un número válido.");
                }
            }
        }
    }
}
