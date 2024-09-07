package org.example;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class Usuario {

    // Método para iniciar sesión
    public static void iniciarSesion(Scanner scanner) {
        System.out.println("=== Iniciar sesión ===");

        System.out.print("Ingrese su DNI: ");
        String dni = scanner.nextLine();

        System.out.print("Ingrese su contraseña: ");
        String password = scanner.nextLine();

        // Verificar si las credenciales ya están registradas
        if (!credencialesYaRegistradas(dni, password)) {
            // Guardar las credenciales si no están registradas
            guardarCredenciales(dni, password);
        } else {
            System.out.println("El usuario ya está registrado.");
        }

        // Después de iniciar sesión, redirigir al menú de Inicio_Homebanking
        Inicio_Homebanking.mostrarMenu(scanner);
    }

    // Método para verificar si las credenciales ya están registradas
    private static boolean credencialesYaRegistradas(String dni, String password) {
        try {
            // Leer el archivo "usuarios.txt"
            List<String> lineas = Files.readAllLines(Paths.get("usuarios.txt"));

            // Formato de la línea a buscar
            String credencial = "DNI: " + dni + ", Contraseña: " + password;

            // Verificar si la credencial ya está en el archivo
            return lineas.contains(credencial);

        } catch (IOException e) {
            // Si ocurre un error al leer el archivo, asumimos que no está registrado
            System.out.println("No se pudo leer el archivo de usuarios.");
            return false;
        }
    }

    // Método para guardar credenciales en un archivo de texto
    private static void guardarCredenciales(String dni, String password) {
        try {
            FileWriter escritor = new FileWriter("usuarios.txt", true); // "true" para añadir al archivo sin sobrescribir
            escritor.write("DNI: " + dni + ", Contraseña: " + password + "\n");
            escritor.close();
        } catch (IOException e) {
            System.out.println("Ocurrió un error al guardar las credenciales.");
            e.printStackTrace();
        }
    }


    public static void CrearCuenta(Scanner scanner) {

    }
}