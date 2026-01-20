package dayone;

import java.util.Arrays;

public class ReverseArray {

    public static void main(String[] args) {
        int[] arr = {-1, 5, 0, 2, 20, 1};

        System.out.println(Arrays.toString(arr));
        reverseArray(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void reverseArray(int[] arr) {
        int length = arr.length;
        int i = 0, j = length - 1;

        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
}
