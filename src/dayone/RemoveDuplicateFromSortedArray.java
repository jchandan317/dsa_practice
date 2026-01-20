package dayone;

import java.util.Arrays;

public class RemoveDuplicateFromSortedArray {

    public static void main(String[] args) {

        int[] arr = {1,2,2,3,3,3,3};
        removeDuplicates(arr);
    }


    // it is 2 pointer pattern
    private static void removeDuplicates(int[] arr) {

        int i = 0;

        if (arr == null || arr.length == 0) {
            return;
        }

        if (arr.length == 1)
            System.out.println(Arrays.toString(arr));


        for (int j = 1; j < arr.length; j++) {
            if (arr[j] != arr[i]) {
                arr[++i] = arr[j];
            }
        }

        System.out.println("Length is " + (i + 1));
    }
}
