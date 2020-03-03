package array;

import org.junit.Test;
import static org.junit.Assert.*;

public class BinarySearchArrayTest {

    @Test
    public void returnsIndex(){
        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        assertEquals(
                "the index should be 3",
                3,
                BinarySearch.binarySearch(array, 4)
        );
    }

    @Test
    public void noKeyFoundArray(){
        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        assertEquals(
                "The index should be -1",
                -1,
                BinarySearch.binarySearch(array, 10)
        );
    }

    @Test
    public void testingOddArrayWithKey(){
        int[] array = new int[]{1, 2, 3, 4, 5};
        assertEquals(
                "The index should be 2",
                2,
                BinarySearch.binarySearch(array, 3)
        );
    }

    @Test
    public void singleArrayCheck(){
        int[] array = new int[]{2};
        assertEquals(
                "The index should be 0",
                0,
                BinarySearch.binarySearch(array, 2)
        );
    }
}
