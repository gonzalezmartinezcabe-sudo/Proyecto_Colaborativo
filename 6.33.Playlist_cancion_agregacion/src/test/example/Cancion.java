package test.example;

/**
 * Representa una canción dentro del sistema.
 * Almacena información sobre el título y la duración de la misma
 *
 * @author Juan Manuel García León
 * @version 1.0
 */

public class Cancion {

    private String nombre;
    private double duracion;

    /**
     * Constructor para crear una nueva canción
     *
     * @param nombre Título de la canción
     * @param duracion Duración en segundos (debe ser positiva)
     */
    public Cancion(String nombre, double duracion){
        this.nombre = nombre;
        this.duracion = duracion;
    }

    @Override
    public String toString(){
        return nombre+" | "+duracion;
    }

}
