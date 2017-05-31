package CS1530_Exercise3;
import org.junit.Test;
import static org.junit.Assert.*;
// import CS1530_Exercise3.AdditiveFactorial;

public class FactorialTest {

 @Test
 public void testFactorialTrig1() {
 	assertEquals(AdditiveFactorial.Trig(3), 6);
 }

 @Test
 public void testFactorialTrig2() {
 	assertEquals(AdditiveFactorial.Trig(5), 15);
 }
 @Test
 public void testFactorialTrig3() {
 	assertEquals(AdditiveFactorial.Trig(1), 1);
 }

 @Test
 public void testFactorialLazy1() {
 	assertEquals(AdditiveFactorial.Lazy(5), 16);
 }

 @Test
 public void testFactorialLazy2() {
 	assertEquals(AdditiveFactorial.Lazy(9), 46);
 }

 @Test
 public void testFactorialLazy3() {
 	assertEquals(AdditiveFactorial.Lazy(3), 7);
 }
}
