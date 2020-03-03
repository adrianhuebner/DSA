package array;

import org.junit.Test;
import static org.junit.Assert.*;

public class ArrayReverseTest {

    @Test
    public void testingReversal(){
        int[] originalArray = new int[]{1, 2, 3, 4, 5};
        int[] newArray = new int[]{5, 4, 3, 2, 1};
        assertArrayEquals(
                "new array should return as [5, 4, 3, 2, 1]",
                newArray,
                ArrayReverse.reverseArray(originalArray)
        );
    }
}
