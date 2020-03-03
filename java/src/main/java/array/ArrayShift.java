package array;

import java.util.Arrays;

public class ArrayShift{

    public static void main(String[] args) {
        int[] array = {1, 2, 4, 5};
        int newValue = 3;
        int[] newArray = shiftArray(array, newValue);
        System.out.println(Arrays.toString(newArray));
    }

    public static int[] shiftArray(int[] originalArray, int addedValue){
        int[] newArray = new int[originalArray.length + 1];
        int midpoint = newArray.length / 2;
        for(int i = 0; i < newArray.length; i++){
            if(i < midpoint){
                newArray[i] = originalArray[i];
            } else if(midpoint == i){
                newArray[i] = addedValue;
            } else{
                newArray[i] = originalArray[i - 1];
            }
        }
        return newArray;
    }
}