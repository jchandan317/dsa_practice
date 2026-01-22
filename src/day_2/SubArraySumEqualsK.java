package day_2;

import java.util.HashMap;
import java.util.Map;

public class SubArraySumEqualsK {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        int k = 3;
        System.out.println(isSubArrayEqualsK(nums, k));
        System.out.println(countSubArraysEqualsK(nums, k));
    }

    private static boolean isSubArrayEqualsK(int[] arr, int k) {
        int length = arr.length;

        int[] prefixSum = new int[length];
        Map<Integer, Integer> sumFreq = new HashMap<>();

        prefixSum[0] = arr[0];
        sumFreq.put(0, 1);

        for (int i = 1; i < length; i++) {
            prefixSum[i] = prefixSum[i - 1] + arr[i];
            if (sumFreq.containsKey(prefixSum[i] - k)) {
                return true;
            }
            sumFreq.put(prefixSum[i], sumFreq.getOrDefault(prefixSum[i], 0) + 1);
        }
        return false;
    }

    private static int countSubArraysEqualsK(int[] arr, int k) {
        int length = arr.length;

        int[] prefixSum = new int[length];
        Map<Integer, Integer> sumFreq = new HashMap<>();

        prefixSum[0] = arr[0];
        sumFreq.put(0, 1);

        int count = 0;

        for (int i = 1; i < length; i++) {
            prefixSum[i] = prefixSum[i - 1] + arr[i];
            if (sumFreq.containsKey(prefixSum[i] - k)) {
                count++;
            }
            sumFreq.put(prefixSum[i], sumFreq.getOrDefault(prefixSum[i], 0) + 1);
        }
        return count;
    }
}
