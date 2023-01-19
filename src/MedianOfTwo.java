import java.util.Arrays;

public class MedianOfTwo {

    public MedianOfTwo(){
        int []num1 = {1,2,6};
        int []num2 = {3,4,5};
        System.out.println(findMedianSortedArrays(num1, num2));
    }

    public double findMedianSortedArrays(int[] num1, int[] num2){
        int[] mergedArray = new int[num1.length + num2.length];
        int i = 0;
        int mid = 0;
        while(i < num1.length){
            mergedArray[i] = num1[i];
            i++;
        }

        for(int j = 0; j < num2.length; j++){
            mergedArray[i] = num2[j];
            i++;
        }

        Arrays.sort(mergedArray);

        mid = (mergedArray.length) / 2;

        double medianF = 0.0;

        if(mergedArray.length % 2 != 0)
            medianF = mergedArray[mid];
        else{
            medianF = (double) (mergedArray[mid] + mergedArray[mid-1]) /2 ;
        }

        System.out.println(Arrays.toString(mergedArray));
        return medianF;
    }

    public static void main(String[] args) {
        new MedianOfTwo();
    }
}
