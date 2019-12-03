import org.junit.jupiter.api.Test;
import sun.jvm.hotspot.utilities.Assert;

import static org.junit.jupiter.api.Assertions.*;

class SimpleCalculatorMainTest {

    @Test
    void TestAdd()
    {
        assertEquals(4, SimpleCalculatorMain.add(2,2));
        assertEquals(15, SimpleCalculatorMain.add(1,2,3,4,5));
        assertEquals(3, SimpleCalculatorMain.add(1,2));
    }

    @Test
    void TestMultiply()
    {
        assertEquals(6,SimpleCalculatorMain.multiply(3,2));
        assertEquals(120,SimpleCalculatorMain.multiply(1,2,3,4,5));
    }


}