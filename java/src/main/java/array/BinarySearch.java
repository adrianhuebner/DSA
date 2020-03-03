package array;

public class BinarySearch{
    public static int binarySearch(int[] sortedArray, int searchKey){
        // Used my code in Javascript for same challenge as a reference
        // Also read through: https://www.geeksforgeeks.org/binary-search/ to see what differences that there may be between the two languages
        int startingPoint = 0;
        int endingPoint = ((sortedArray.length - 1) / 2);
        while(startingPoint <= endingPoint){
            int midPoint = ((startingPoint + endingPoint) / 2);
            if(sortedArray[midPoint] == searchKey){
                return midPoint;
            } else if(sortedArray[midPoint] < searchKey){
                startingPoint = midPoint + 1;
            } else if(sortedArray[midPoint] > searchKey){
                endingPoint = midPoint - 1;
            }
        }
        return -1;
    }
}