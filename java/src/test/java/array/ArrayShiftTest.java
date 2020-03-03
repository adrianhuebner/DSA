package array;

import org.junit.Test;
import static org.junit.Assert.*;

public class ArrayShiftTest{

    @Test
    public void testingOddArray(){
        int[] newArray = new int[]{1, 2, 3, 4};
        int[] originalArray = new int[]{1, 2, 4};
        assertArrayEquals(
                "the new array should be [1, 2, 3, 4]",
                newArray,
                ArrayShift.shiftArray(originalArray, 3)
        );
    }

    @Test
    public void testingEvenArray(){
        int[] newArray = new int[]{1, 2, 3, 4, 5};
        int[] originalArray = new int[]{1, 2, 4, 5};
        assertArrayEquals(
                "the new array should be [1, 2, 3, 4, 5]",
                newArray,
                ArrayShift.shiftArray(originalArray, 3)
        );
    }

    @Test
    public void testingEmptyArray(){
        int[] emptyArray = new int[]{};
        int[] newArray = new int[]{1};
        assertArrayEquals(
                "new array should be [1]",
                newArray,
                ArrayShift.shiftArray(emptyArray, 1)
        );
    }

    @Test
    public void testingLongArray(){
        int[] newArray = new int[]{10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        int[] originalArray = new int[]{10, 20, 30, 40, 50, 70, 80, 90, 100};
        assertArrayEquals(
                "new array should be [10, 20, 30, 40, 50, 60, 70, 80, 90, 100]",
                newArray,
                ArrayShift.shiftArray(originalArray, 60)
        );
    }
}
