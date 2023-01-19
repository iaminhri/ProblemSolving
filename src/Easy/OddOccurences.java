package Easy;

public class OddOccurences {

    public OddOccurences(){
        int []A = {9, 3, 9, 3, 9, 7, 7, 9, 4, 5, 4, 5, 42};
        int []AA = { 1, 2, 1};
        System.out.println(findOddOccurences(AA));
    }

    public int findOddOccurences(int [] A){
        int temp = 0, count = 0;
        if (A.length == 0)
            return 0;
        for(int i = 0; i < A.length; i++){
            for(int j = 0; j < A.length; j++){
                if(i != j && A[i] == A[j]) {
                    count++;
                    break;
                }
            }
//            System.out.println(count);
            if(count == 0) {
                temp = A[i];
                return temp;
            }
            count = 0;
        }
        return temp;
    }

    public static void main(String[] args) {
        new OddOccurences();
    }
}
