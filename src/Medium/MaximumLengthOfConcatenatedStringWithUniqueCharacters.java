package Medium;

import java.util.List;

public class MaximumLengthOfConcatenatedStringWithUniqueCharacters {

    public int maxLength(List<String> arr) {
        int curr = 0;
        String max = "";
        return validConcatsLL(curr, arr, max);
    }

    private int validConcatsLL( int curr, List<String> arr, String max ){

        if(curr == arr.size())
        {
            if(!checkDuplicate(max)){
                return max.length();
            }
            return 0;
        }
        int size1 = validConcatsLL(curr+1, arr, max);
        int size2 = validConcatsLL(curr+1, arr, max+arr.get(curr));

        return Math.max(size1, size2);
    }

    boolean checkDuplicate(String max) {
        for (int i = 0; i < max.length(); i++) {
            for (int j = i + 1; j < max.length(); j++) {
                if (max.charAt(i) == max.charAt(j))
                    return true;
            }
        }
        return false;
    }
}
