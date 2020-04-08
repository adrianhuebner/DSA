package random;

import java.util.Arrays;

public class isogram {
    public static boolean  isIsogram(String str) {
        str = str.toLowerCase();
        int length = str.length();

        char characterArray[] = str.toCharArray();

        Arrays.sort(characterArray);
        for(int i = 0; i < length - 1; i++){
            if(characterArray[i] == characterArray[i + 1])
                return false;
        }
        return true;
    }
}
