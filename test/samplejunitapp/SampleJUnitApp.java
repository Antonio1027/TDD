package samplejunitapp;

import tdd.Dollar;
import junit.framework.TestCase;
import org.junit.Test;

/**
 * First test
 * @author Antonio Shilon
 */
public class SampleJUnitApp extends TestCase{
    @Test
    public void testMultiplication() {
        Dollar five = new Dollar(5);
        Dollar product = five.times(2);
        assertEquals(10, product.amount);        
        product = five.times(3);
        assertEquals(15, product.amount);
    }
}
