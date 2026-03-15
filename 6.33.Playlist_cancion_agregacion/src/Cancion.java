//pertenecer a varias playlists. Implementa métodos para añadir y eliminar canciones de
//la playlist y muestra todas las canciones con su duración

public class Cancion {

    private String nombre;
    private double duracion;

    public Cancion(String nombre, double duracion){
        this.nombre = nombre;
        this.duracion = duracion;
    }

    @Override
    public String toString(){
        return nombre+" | "+duracion;
    }

}
