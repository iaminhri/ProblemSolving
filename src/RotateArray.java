import javax.sound.midi.Soundbank;
import java.util.Arrays;

public class RotateArray {
    public RotateArray(){
        int []arr = {3,8,9,7,6};
        int []arr2 = {1, 2, 3, 4};
        int []arr3 = {0};

        System.out.print("Before Rotate: ");
        System.out.println(Arrays.toString(arr));
        rotateArr(arr, 1);
        System.out.print("After Rotate: ");
        System.out.println(Arrays.toString(arr));
    }

    public void rotateArr(int[] arr, int k){
        if(k < 1 || arr.length <= 1)
            return;

        int temp, temp2, end;

        while (k > 0){
            end = arr[arr.length-1];

            temp = arr[1];
            arr[1] = arr[0];
            arr[0] = temp;

            for(int i = 1; i < arr.length; i++){
                if(i+1 >= arr.length)
                    break;
                temp2 = arr[i+1];
                arr[i+1] = temp;
                temp = temp2;
            }
            arr[0] = end;
            k--;
        }
    }

    public static void main(String[] args) {
        new RotateArray();
    }
}
