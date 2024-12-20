/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author satur
 */
public class LenguajeProgramacion {
    private int anioCreacion;
    private String caracteristicaPrincipal;
    private String nombre;
    private String utilizacion;

    // Constructor
    public LenguajeProgramacion(int anioCreacion, String caracteristicaPrincipal, String nombre, String utilizacion) {
        this.anioCreacion = anioCreacion;
        this.caracteristicaPrincipal = caracteristicaPrincipal;
        this.nombre = nombre;
        this.utilizacion = utilizacion;
    }

    // Getters permiten obtener los valores de los atributos.
    public int getAnioCreacion() {
        return anioCreacion;
    }

    public String getCaracteristicaPrincipal() {
        return caracteristicaPrincipal;
    }

    public String getNombre() {
        return nombre;
    }

    public String getUtilizacion() {
        return utilizacion;
    }

    // Setters permiten modificar los valores de los atributos.
    public void setAnioCreacion(int anioCreacion) {
        this.anioCreacion = anioCreacion;
    }

    public void setCaracteristicaPrincipal(String caracteristicaPrincipal) {
        this.caracteristicaPrincipal = caracteristicaPrincipal;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setUtilizacion(String utilizacion) {
        this.utilizacion = utilizacion;
    }

    // Método toString
    @Override
    public String toString() {
        return "\n****LenguajeProgramacion****" +
                "\n-Anio de creacion = " + anioCreacion +
                "\n-Caracteristica principal = " + caracteristicaPrincipal +
                "\n-Nombre = " + nombre +
                "\n-Utilizacion = " + utilizacion
                ;
    }
}

















