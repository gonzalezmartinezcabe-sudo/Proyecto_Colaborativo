//Crea una relación de agregación entre java.Playlist y java.Cancion. Una misma canción puede
//pertenecer a varias playlists. Implementa métodos para añadir y eliminar canciones de
//la playlist y muestra todas las canciones con su duración
public class Playlist {

    private String nombrePlaylist;
    private String autor;
    private Cancion[] arrayCancion;
    private int contador;

    public Playlist(String nombrePlaylist, String autor, int numeroCanciones){
        this.nombrePlaylist=nombrePlaylist;
        this.autor=autor;
        this.arrayCancion=new Cancion[numeroCanciones]; //EL ARRAY SE CREA AQUÍ
        contador = 0;
    }

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

    public void quitarCancion(Cancion cancionEjemplo){
        int posicion = -1;
        //RECORREMOS LA PLAYLIST EN BUSCA DE LA CANCION
        for(int i = 0; i < contador; i++){
            if(arrayCancion[i] == cancionEjemplo){
                posicion = i;

            }
        }

        if(posicion != -1){

            // Desplazar a la izquierda
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

    public void mostrarPlaylist(){
        System.out.println("La "+nombrePlaylist+" tiene las siguientes canciones: ");
        for(int i = 0; i < arrayCancion.length; i++){
            System.out.println(arrayCancion[i]);
        }
    }


}
