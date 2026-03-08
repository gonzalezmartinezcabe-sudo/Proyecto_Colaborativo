public class Main{
    public static void main(String[] args){

        Cancion c1 = new Cancion("Retour a vega", 3.30);
        Cancion c2 = new Cancion("Creep", 2.40);
        Cancion c3 = new Cancion("Song 2", 2.35);
        Cancion c4 = new Cancion("Where is my mind", 4);
        Cancion c5 = new Cancion("Evil", 4.30);
        Cancion c6 = new Cancion("so busted", 2);

        Playlist p1 = new Playlist("Britpop", "Juanma", 2);
        Playlist p2 = new Playlist("Favoritos", "Juanma", 5);

        p1.anadirCancion(c2);
        p1.anadirCancion(c3);
        p1.anadirCancion(c1);//DEBERÍA NO AÑADIRSE PORQUE ESTÁ LLENA

        p1.mostrarPlaylist();

        p2.anadirCancion(c1);
        p2.anadirCancion(c2);
        p2.anadirCancion(c3);
        p2.anadirCancion(c4);
        p2.anadirCancion(c5);
        p2.anadirCancion(c6);//Debería no añadirse

        p2.mostrarPlaylist();

        p2.quitarCancion(c1);
        p2.quitarCancion(c3);
        p2.mostrarPlaylist();


    }
}
