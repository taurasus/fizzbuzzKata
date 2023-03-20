import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestFizzBuzz {
    
    FizzBuzz fizzBuzz = new FizzBuzz();
    @Test
    public void test_avec_1_retourne_1() {
        assertEquals(fizzBuzz.decode(1) ,"1");
    }

    @Test
    public void test_avec_2_retourne_2() {
        assertEquals(fizzBuzz.decode(2) ,"2");
    }
    
    @Test
    public void test_avec_3_retourne_fizz() {
        // Given
        int entry = 3;
        
        // When
        String result = fizzBuzz.decode(entry);
        
        // Then
        assertEquals(result,"fizz");
    }
}
