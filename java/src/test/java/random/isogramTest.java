package random;

import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class isogramTest {
    @Test
    public void FixedTests() {
        assertEquals(true, isogram.isIsogram("Math"));
        assertEquals(true, isogram.isIsogram("olive"));
        assertEquals(false, isogram.isIsogram("gooseliver"));
        assertEquals(false, isogram.isIsogram("supsuckers"));
        assertEquals(false, isogram.isIsogram("ctctc"));
        assertEquals(false, isogram.isIsogram("CoFfEe"));
        assertEquals(true, isogram.isIsogram("help"));
        assertEquals(true, isogram.isIsogram(""));
    }
}
