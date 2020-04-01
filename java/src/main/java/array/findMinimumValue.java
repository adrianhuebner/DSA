package array;

public class findMinimumValue {

    public static int getMinimumValue(int[] inputtedArray){
        // going to store the value at index 0 of the array that will be used to compare all the other values in the array
        int minimum = inputtedArray[0];
        // looping through the array starting at index 1 because minimum is the 0 index value of the array
        for(int i = 1; i < inputtedArray.length; i++){
            // if the array at i (where we are at in the for loop) is smaller than minimum change the value of minimum to the current value of the array
            if(inputtedArray[i] < minimum){
                minimum = inputtedArray[i];
            }
        }
        return minimum;
    }
}
