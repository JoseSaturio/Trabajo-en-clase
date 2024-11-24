/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Vista;

import Controlador.GestionLenguaje;
import Modelo.LenguajeProgramacion;
import java.util.Scanner;

/**
 *
 * @author satur
 */
public class SistemaRegistro {
    
    private static GestionLenguaje gestionLenguaje = new GestionLenguaje();

    public static void main(String[] args) {
        menu();
    }

    private static void menu() {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n--- Sistema de Registro de Lenguajes de Programacion ---");
            System.out.println("1. Agregar Lenguaje");
            System.out.println("2. Buscar Lenguaje");
            System.out.println("3. Eliminar Lenguaje");
            System.out.println("4. Imprimir Lenguajes");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opcion: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer

            switch (opcion) {
                case 1:
                    agregarLenguaje(scanner);
                    break;
                case 2:
                    buscarLenguaje(scanner);
                    break;
                case 3:
                    eliminarLenguaje(scanner);
                    break;
                case 4:
                    gestionLenguaje.imprimirLenguajes();
                    break;
                case 5:
                    System.out.println("Saliendo del sistema...");
                    break;
                default:
                    System.out.println("Opcion no valida. Intente de nuevo.");
            }
        } while (opcion != 5);

        scanner.close();
    }

    private static void agregarLenguaje(Scanner scanner) {
        System.out.print("Ingrese el anio de creacion: ");
        int anioCreacion = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer
        System.out.print("Ingrese la caracteristica principal: ");
        String caracteristicaPrincipal = scanner.nextLine();
        System.out.print("Ingrese el nombre del lenguaje: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese la utilizacion: ");
        String utilizacion = scanner.nextLine();

        gestionLenguaje.agregarLenguaje(anioCreacion, caracteristicaPrincipal, nombre, utilizacion);
        System.out.println("Lenguaje agregado exitosamente.");
    }

    private static void buscarLenguaje(Scanner scanner) {
        System.out.print("Ingrese el nombre del lenguaje a buscar: ");
        String nombre = scanner.nextLine();
        LenguajeProgramacion lenguaje = gestionLenguaje.buscarLenguaje(nombre);
        if (lenguaje != null) {
            System.out.println("Lenguaje encontrado: " + lenguaje);
        } else {
            System.out.println("Lenguaje no encontrado.");
        }
    }

    private static void eliminarLenguaje(Scanner scanner) {
        System.out.print("Ingrese el nombre del lenguaje a eliminar: ");
        String nombre = scanner.nextLine();
        if (gestionLenguaje.eliminarLenguaje(nombre)) {
            System.out.println("Lenguaje eliminado exitosamente.");
        } else {
            System.out.println("Lenguaje no encontrado.");
        }
    }
    
}
