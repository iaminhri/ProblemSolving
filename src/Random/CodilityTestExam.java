package Random;

import java.util.Arrays;

public class CodilityTestExam {

    String resultBin = "";

    public CodilityTestExam(){
        System.out.println(binaryGap(1041 ));
    }

    public int binaryGap(int num){
        convertToBin(num);
        if(num < 1)
            return 0;

        int []countArr = new int[resultBin.length()];
        int count = 0;
        int j = 0;

        for(int i = 0; i < resultBin.length(); i++){
            if((i+1) < resultBin.length()){
                if(resultBin.charAt(i) == '1' && resultBin.charAt(i+1) == '0')
                {
                    int k = i;
                    while (resultBin.charAt(k+1) != '1' && (k+1) < resultBin.length()-1){
                        count++;
                        k++;
                    }
                }
            }
            countArr[j] = count;
            count = 0;
            j++;
        }

        return resultBin.isEmpty() ? 0 :  Arrays.stream(countArr).max().getAsInt();
    }

    public int convertToBin(int num){
        int mod;

        if(num == 0 || num == 1) {
            resultBin += num;
            return 0;
        }

        mod = num % 2;
        resultBin += mod;
        return convertToBin(num/2);
    }
    public static void main(String[] args) {
        new CodilityTestExam();
    }
}
