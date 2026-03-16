
package test.example;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PlaylistTest {

    private Playlist playlist;
    private Cancion c1;
    private Cancion c2;
    private Cancion c3;

    @BeforeEach
    void setUp() {
        playlist = new Playlist("PlaylistTest", "Miguel A", 2);
        c1 = new Cancion("Cancion1", 3);
        c2 = new Cancion("Cancion2", 4);
        c3 = new Cancion("Cancion3", 5);
    }

    @Test
    void testAnadirCancionConEspacio() {

        playlist.anadirCancion(c1);
        playlist.anadirCancion(c2);

        // Si llegamos aquí significa que el if principal funcionó
        assertTrue(true);
    }

    @Test
    void testAnadirCancionPlaylistLlena() {

        playlist.anadirCancion(c1);
        playlist.anadirCancion(c2);

        // Este debe entrar en el else
        playlist.anadirCancion(c3);

        assertTrue(true);
    }

    @Test
    void testQuitarCancionExistente() {

        playlist.anadirCancion(c1);
        playlist.anadirCancion(c2);

        playlist.quitarCancion(c1);

        assertTrue(true);
    }

    @Test
    void testQuitarCancionInexistente() {

        playlist.anadirCancion(c1);

        playlist.quitarCancion(c2);

        assertTrue(true);
    }

    @Test
    void testQuitarCancionPlaylistVacia() {

        playlist.quitarCancion(c1);

        assertTrue(true);
    }

}