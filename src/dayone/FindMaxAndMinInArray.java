package dayone;

public class FindMaxAndMinInArray {

    public static void main(String[] args) {

        int[] arr = {-1, 5, 0, 2, 20, 1};
        System.out.println(findMax(arr));
        System.out.println(findMin(arr));
    }

    private static int findMax(int[] arr) {
        int length = arr.length;

        if (length == 0) return -1;
        if (length == 1) return arr[0];

        int max = arr[0];

        for (int i = 1; i < length; i++) {
            max = Math.max(max, arr[i]);
        }
        return max;
    }

    private static int findMin(int[] arr) {
        int length = arr.length;

        if (length == 0) return -1;
        if (length == 1) return arr[0];

        int min = arr[0];

        for (int i = 1; i < length; i++) {
            min = Math.min(min, arr[i]);
        }
        return min;
    }
}
