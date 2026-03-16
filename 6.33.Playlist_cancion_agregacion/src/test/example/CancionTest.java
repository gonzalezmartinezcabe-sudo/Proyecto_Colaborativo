package test.example;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CancionTest {

    @Test
    void testToString() {
        Cancion c = new Cancion("Creep", 2.40);

        String resultado = c.toString();

        assertEquals("Creep | 2.4", resultado);
    }

}