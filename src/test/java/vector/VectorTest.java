package test.java.vector;
import main.java.vector.Vector;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class VectorTest {

    @Test
    public void testConstructorAndGetters() {
        Vector v = new Vector(3, 4);
        assertEquals(3, v.getX(), 0.0001);
        assertEquals(4, v.getY(), 0.0001);
    }

    @Test
    public void testCopyConstructor() {
        Vector original = new Vector(1, 2);
        Vector copy = new Vector(original);
        assertEquals(1, copy.getX(), 0.0001);
        assertEquals(2, copy.getY(), 0.0001);
        assertThrows(IllegalArgumentException.class, () -> {
            new Vector(null);
        });
    }

    @Test
    public void testSetters() {
        Vector v = new Vector();
        v.setX(5);
        v.setY(6);
        assertEquals(5, v.getX(), 0.0001);
        assertEquals(6, v.getY(), 0.0001);
    }

    @Test
    public void testMagnitude() {
        Vector v = new Vector(3, 4);
        assertEquals(5, v.getMagnitude(), 0.0001);
    }

    @Test
    public void testNormalization() {
        Vector v = new Vector(3, 4);
        Vector normalized = v.asNormalized();
        assertEquals(0.6, normalized.getX(), 0.0001);
        assertEquals(0.8, normalized.getY(), 0.0001);
        assertThrows(IllegalArgumentException.class, () -> {
            new Vector(0, 0).asNormalized();
        });
    }

    @Test
    public void testAddition() {
        Vector v1 = new Vector(1, 2);
        Vector v2 = new Vector(3, 4);
        Vector sum = v1.add(v2);
        assertEquals(4, sum.getX(), 0.0001);
        assertEquals(6, sum.getY(), 0.0001);
        assertThrows(IllegalArgumentException.class, () -> {
            v1.add(null);
        });
    }

    @Test
    public void testFromPolar() {
        Vector v = Vector.fromPolar(Math.PI / 4, Math.sqrt(2));
        assertEquals(1, v.getX(), 0.0001);
        assertEquals(1, v.getY(), 0.0001);
        assertThrows(IllegalArgumentException.class, () -> {
            Vector.fromPolar(-1, 1);
        });
        assertThrows(IllegalArgumentException.class, () -> {
            Vector.fromPolar(7, 1);
        });
        assertThrows(IllegalArgumentException.class, () -> {
            Vector.fromPolar(Math.PI, -1);
        });
    }
}
