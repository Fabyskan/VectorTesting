package vector;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class VectorTest {

    @Test
    public void testConstructorAndGetters() {
        Vector v = new Vector(3, 4);
        assertEquals(3, v.getX(), 0.0001);
        assertEquals(4, v.getY(), 0.0001);
    }
}
