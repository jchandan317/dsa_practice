package day_2;

import java.util.HashMap;
import java.util.Map;

public class ElementWithMaxFreq {

    public static void main(String[] args) {

        int[] arr = {4};
        System.out.println(maxFreq(arr));
    }

    private static int maxFreq(int[] arr) {
        Map<Integer, Integer> freqMap = new HashMap<>();
        int max = 0;
        int num = Integer.MIN_VALUE;

        for (int x : arr) {
            int count = freqMap.getOrDefault(x, 0);
            freqMap.put(x, count + 1);
            if (count + 1 > max) {
                max = count + 1;
                num = x;
            }
        }
        return num;
    }
}
