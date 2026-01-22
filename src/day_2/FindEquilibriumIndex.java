package day_2;

public class FindEquilibriumIndex {

    public static void main(String[] args) {

        int[] nums = {1, 7, 3, 6, 5, 6};
        System.out.println(findIndex(nums));
    }

    private static int findIndex(int[] arr) {

        int length = arr.length;
        int[] preSum = new int[length];
        int[] postSum = new int[length];
        preSum[0] = arr[0];
        postSum[length - 1] = arr[length - 1];

        for (int i = 1; i < arr.length; i++) {
            preSum[i] = preSum[i - 1] + arr[i];
        }

        for (int i = length - 2; i >= 0; i--) {
            postSum[i] = postSum[i + 1] + arr[i];
        }

        for (int i = 0; i < length; i++) {
            if (preSum[i] == postSum[i]) {
                return i;
            }
        }
        return -1;
    }
}
