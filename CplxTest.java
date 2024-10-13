import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class CplxTest {
    private static Cplx cplx = new Cplx(2,3);

    @Test
    void CompareCplxArr(){
        assertArrayEquals(cplx.getCplxArr(), new double[]{2.0, 3.0});
    }

    @Test
    void testToString(){
        assertEquals(cplx.toString(), "2.0 + 3.0i");
    }

    @Test
    void testAddAss(){
        assertEquals(cplx.addAss(new Cplx(2,3)), new Cplx(4,6));
    }

    @Test
    void testSubAss(){
        assertEquals(cplx.subAss(new Cplx(2,3)), new Cplx(0,0));
    }

    // after creating the cplx as the static. Every tests effect the result of the array and that's why the outcome can be changed

    @BeforeEach
    void setup(){
        cplx = new Cplx(2,3);
    }
}