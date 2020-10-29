package UnitTestForDesign;

import Design_Test.Oristrch;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OristrchTest {

    @Test
    public void evaluateTest() throws Exception{

        Oristrch or = new Oristrch();
        int sum = or.evaluate("1+2+3");

        assertEquals(5, sum);
    }

}