/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.LenguajeProgramacion;

/**
 *
 * @author satur
 */
public class GestionLenguaje {
    private LenguajeProgramacion[] arregloLenguajes= new LenguajeProgramacion[FACTOR_CRECIMIENTO]; // Arreglo de lenguajes
    private int contadorLenguajes = 0; // Número actual de lenguajes almacenados
    private static final int FACTOR_CRECIMIENTO = 2; // Tamaño inicial del arreglo

    // Método para agregar un lenguaje
    public void agregarLenguaje(int anioCreacion, String caracteristicaPrincipal, String nombre, String utilizacion) {
        // Verificar si el arreglo está lleno
        if (contadorLenguajes == arregloLenguajes.length) {
            // Redimensionar el arreglo directamente aquí
            LenguajeProgramacion[] nuevoArreglo = new LenguajeProgramacion[arregloLenguajes.length * 2];
            for (int i = 0; i < arregloLenguajes.length; i++) {
                nuevoArreglo[i] = arregloLenguajes[i]; // Copiar elementos al nuevo arreglo
            }
            arregloLenguajes = nuevoArreglo; // Reempsplazar el arreglo original
        }
        // Agregar el nuevo lenguaje
        arregloLenguajes[contadorLenguajes] = new LenguajeProgramacion(anioCreacion, caracteristicaPrincipal, nombre, utilizacion);
        contadorLenguajes++;
    }

    // Método para buscar un lenguaje por nombre
    public LenguajeProgramacion buscarLenguaje(String nombre) {
        for (int i = 0; i < contadorLenguajes; i++) {
            if (arregloLenguajes[i].getNombre().equalsIgnoreCase(nombre)) {
                return arregloLenguajes[i]; // Retornar el lenguaje encontrado
            }
        }
        return null; // Retornar null si no se encuentra
    }

    // Método para eliminar un lenguaje por nombre
    public boolean eliminarLenguaje(String nombre) {
        for (int i = 0; i < contadorLenguajes; i++) {
            if (arregloLenguajes[i].getNombre().equalsIgnoreCase(nombre)) {
                // Desplazar elementos hacia la izquierda
                for (int j = i; j < contadorLenguajes - 1; j++) {
                    arregloLenguajes[j] = arregloLenguajes[j + 1];
                }
                arregloLenguajes[contadorLenguajes - 1] = null; // Limpiar el último espacio
                contadorLenguajes--; // Reducir el contador
                return true; // Retornar true al eliminar
            }
        }
        return false; // Retornar false si no se encuentra
    }

    // Método para obtener un arreglo limpio de lenguajes registrados
    public LenguajeProgramacion[] getArregloLenguajes() {
        // Crear un nuevo arreglo con el tamaño exacto de lenguajes registrados
        LenguajeProgramacion[] resultado = new LenguajeProgramacion[contadorLenguajes];
        for (int i = 0; i < contadorLenguajes; i++) {
            resultado[i] = arregloLenguajes[i];
        }
        return resultado;
    }

    // Método para imprimir todos los lenguajes
    public void imprimirLenguajes() {
        if (contadorLenguajes == 0) {
            System.out.println("No hay lenguajes registrados.");
        } else {
            for (int i = 0; i < contadorLenguajes; i++) {
                System.out.println(arregloLenguajes[i]);
            }
        }
    }
}
