import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestFizzBuzz {
    
    FizzBuzz fizzBuzz = new FizzBuzz();
    @Test
    public void test_avec_1_retourne_1() {
        assertEquals(fizzBuzz.decode(1) ,1);
    }

    @Test
    public void test_avec_2_retourne_2() {
        assertEquals(fizzBuzz.decode(2) ,2);
    }
}
