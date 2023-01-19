package Random;

public class Days {
    public Days(){
        System.out.println(solution("Wed", 2));
        System.out.println(solution("Sat", 23));
    }

    public String solution(String s, int k){
        String []arr = {"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};
        int mod = k % 7;
        System.out.println(mod);
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == s){
                if(i+mod >= arr.length-1){
                    mod = mod - (arr.length-i);
                    break;
                }
                else
                    return arr[i+mod];
            }
        }

        return arr[mod];
    }
    public static void main(String[] args) {
        new Days();
    }
}
