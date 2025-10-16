package HashMap;

import org.example.HashMap.RandomNote;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RandomNoteTest {

    RandomNote randomNote = new RandomNote();

    @Test
    void test1() {

        String ransomNote = "a";
        String magazine = "b";

        boolean result = randomNote.randomNote(ransomNote,magazine);

        Assertions.assertFalse(result);

    }

    @Test
    void test2() {

        String ransomNote = "aa";
        String magazine = "ab";

        boolean result = randomNote.randomNote(ransomNote,magazine);

        Assertions.assertFalse(result);

    }

    @Test
    void test3() {

        String ransomNote = "aa";
        String magazine = "aab";

        boolean result = randomNote.randomNote(ransomNote,magazine);

        Assertions.assertTrue(result);

    }

}
