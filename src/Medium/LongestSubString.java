package Medium;

import java.util.ArrayList;

public class LongestSubString {
    String result = "";
    ArrayList<String> subStringList = new ArrayList();

    public LongestSubString(){
        String s = "asjrgapa";
        System.out.println(findLongestSubstring(s));
    }

    public int findLongestSubstring(String str){
        if(str.length() == 1){
            return str.length();
        }
        for(int i = 0; i < str.length(); i++)
            subString(str, i);
        System.out.println(subStringList);
//        return maxLength(subStringList);
        return 0;
    }

    public int maxLength(ArrayList<Integer> list){
        int max = 0;
        for(Integer i : list){
            if(i > max)
                max = i;
        }
        return max;
    }

    public String subString(String str, int i){
        String check = "";

        if(str != null && i+1 <= str.length()){
            if(str.charAt(i) == '\n') {
                return "";
            }
            else{
                check += str.charAt(i);
                if(result.contains(check)) {
                    subStringList.add(result);
                    result = "";
                }
                result = result + str.charAt(i);
                subString(str, i+1);
            }
        }
//        subStringList.add(result.length());
        return result;
    }

    public static void main(String[] args) {
        new LongestSubString();
    }
}
