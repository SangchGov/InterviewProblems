import org.example.StringSplitter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class StringSplitterTest {

    @Test
    public void testStringSplitter() {
        String givenString = "String";
        List<String> result = StringSplitter.split(givenString, 4);
        Assertions.assertEquals(List.of("Stri", "ng"), result);
    }

    @Test
    void testException() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> StringSplitter.split("String", 0));
    }

    @Test
    void testException1() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> StringSplitter.split("", 4));
    }

    @Test
    void testException3() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> StringSplitter.split(null, 0));
    }




}
