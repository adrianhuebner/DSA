package array;

import java.util.Arrays;

public class ArrayReverse {

    public static void main(String[] args) {
        int[] array = {0, 10, 20, 30, 40};
        int[] reversedArray = reverseArray(array);
        System.out.println(Arrays.toString(reversedArray));
    }

    public static int[] reverseArray(int[] originalArray){
        int[] newArray = new int[originalArray.length];
        // thanks to Geeks to Geeks website for having a similar solution that I was able to use as a reference
        for(int i = 0; i < originalArray.length; i++){
            newArray[newArray.length - i - 1] = originalArray[i];
        }
        return newArray;
    }
}