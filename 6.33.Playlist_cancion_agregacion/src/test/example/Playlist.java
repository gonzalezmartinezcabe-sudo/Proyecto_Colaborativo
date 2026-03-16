package test.example;

/**
 * Clase que gestiona una lista de reproducción de canciones
 * Permite añadir, eliminar y mostrar el contenido de la playlist
 *
 * @author Juan Manuel García León
 * @version 1.0
 */
public class Playlist {

    private String nombrePlaylist;
    private String autor;
    private Cancion [] arrayCancion;
    private int contador;

    public Playlist(String nombrePlaylist, String autor, int numeroCanciones){
        this.nombrePlaylist=nombrePlaylist;
        this.autor=autor;
        this.arrayCancion=new Cancion[numeroCanciones];
        contador = 0;
    }


    /**
     * Añade una nueva canción a la lista si hay espacio disponible
     *
     * @param cancionEjemplo Objeto de tipo Canción que se desea añadir
     * @return true si se añadió correctamente, false en caso contrario
     */
    public void anadirCancion(Cancion cancionEjemplo){
            if(contador < arrayCancion.length){
                arrayCancion[contador]=cancionEjemplo;
                System.out.println(arrayCancion[contador]+" añadida a "+nombrePlaylist);
                contador++;
            }
            else{
                System.out.println("No se pueden añadir más canciones a "+nombrePlaylist+", playlist llena");
            }
    }

    /**
     * Busca y elimina una canción específica de la lista
     *
     * @param cancionEjemplo La canción que se desea eliminar
     */

    public void quitarCancion(Cancion cancionEjemplo){
        int posicion = -1;
        for(int i = 0; i < contador; i++){
            if(arrayCancion[i] == cancionEjemplo){
                posicion = i;

            }
        }

        if(posicion != -1){


            for(int i = posicion; i < contador - 1; i++){
                arrayCancion[i] = arrayCancion[i + 1];
            }

            arrayCancion[contador - 1] = null;
            contador--;

            System.out.println(cancionEjemplo + " eliminada de " + nombrePlaylist);
        } else {
            System.out.println("La canción no está en la playlist");
        }
    }

    /**
     * Imprime por consola todos los detalles de la playlist y sus canciones
     */
    public void mostrarPlaylist(){
        System.out.println("La "+nombrePlaylist+" tiene las siguientes canciones: ");
        for(int i = 0; i < arrayCancion.length; i++){
            System.out.println(arrayCancion[i]);
        }
    }


}
