package day_2;

public class SumOfSubArray {

    public static void main(String[] args) {
        int[] nums = {2, -1, 3, 5};
        int L=1, R=3;
        System.out.println(sum(nums, L, R));
    }

    private static int sum(int[] arr, int start, int end) {
        int length = arr.length;

        int[] prefixSum = new int[length + 1];

        prefixSum[0] = arr[0];

        for (int i = 1; i < length; i++) {
            prefixSum[i] = prefixSum[i - 1] + arr[i];
        }

        int endSum = prefixSum[end];
        int startSum = prefixSum[start - 1];

        return endSum - startSum;
    }
}
