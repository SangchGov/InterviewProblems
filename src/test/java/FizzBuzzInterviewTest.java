import org.example.FizzbuzzTestInterview;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FizzBuzzInterviewTest {

    FizzbuzzTestInterview fizzBuzzTestInterview = new FizzbuzzTestInterview();

    @Test
    void test3(){
        var bytes = fizzBuzzTestInterview.fizzBuzzInterview(3);
        Assertions.assertArrayEquals("Fizz".getBytes(), bytes);
    }

    @Test
    void test5(){
        var bytes = fizzBuzzTestInterview.fizzBuzzInterview(5);
        Assertions.assertArrayEquals("Buzz".getBytes(), bytes);
    }

    @Test
    void test3n5(){
        var bytes = fizzBuzzTestInterview.fizzBuzzInterview(15);
        Assertions.assertArrayEquals("FizzBuzz".getBytes(), bytes);
    }

    @Test
    void testException(){
        Assertions.assertThrows(IllegalArgumentException.class, () -> fizzBuzzTestInterview.fizzBuzzInterview(1));
    }
}
