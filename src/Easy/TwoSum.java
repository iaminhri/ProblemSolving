package Easy;

import java.util.Arrays;

public class TwoSum {
    public TwoSum(){
        int arr[] = {3,3};
        int target = 6;
        System.out.println(Arrays.toString(findTwoSum(arr, target)));
    }

    public int[] findTwoSum(int[] nums, int target){
        int []result = new int[2];
        outer:
            for(int i = 0; i < nums.length; i++){
                for(int j = 0; j < nums.length; j++){
                    if(i != j && (nums[i] + nums[j]) == target){
                        result[0] = i;
                        result[1] = j;
                        break outer;
                    }
                }
            }
        return result;
    }
    public static void main(String[] args) {
        new TwoSum();
    }
}
