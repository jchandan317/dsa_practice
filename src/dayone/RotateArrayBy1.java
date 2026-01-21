package dayone;

import java.util.Arrays;

public class RotateArrayBy1 {

    public static void main(String[] args) {
        int[] arr = {1,2,2,3,3,3,3};
        System.out.println(Arrays.toString(arr));
        rotateArrayByOne(arr);
        System.out.println(Arrays.toString(arr));
        rotateArrayByK(arr, 15);
        System.out.println(Arrays.toString(arr));
    }

    private static void rotateArrayByOne(int[] arr) {
        int element = arr[0];

        for (int i = 1; i < arr.length; i++) {
            arr[i - 1] = arr[i];
        }

        arr[arr.length - 1] = element;
    }

    private static void rotateArrayByK(int[] arr, int k) {
        k = k % arr.length;
        reverseArray(arr, 0, k - 1);
        reverseArray(arr, k, arr.length - 1);
        reverseArray(arr, 0, arr.length - 1);

    }

    private static void reverseArray(int[] arr, int startIndex, int endIndex) {
        while (startIndex < endIndex) {
            int temp = arr[startIndex];
            arr[startIndex] = arr[endIndex];
            arr[endIndex] = temp;
            startIndex++;
            endIndex--;
        }
    }
}
