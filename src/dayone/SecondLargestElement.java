package dayone;

import java.util.PriorityQueue;

public class SecondLargestElement {

    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 1, 1, 1};
        System.out.println(find2ndLargest(arr));
        System.out.println(findUnique2ndLargest(arr));
        System.out.println(findKthLargest(arr, 2));
    }


    //with duplicates
    private static int find2ndLargest(int[] arr) {
        if (arr == null || arr.length < 2)
            throw new IllegalArgumentException("Need at least 2 elements");

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int i : arr) {
            if (i >= largest) {
                secondLargest = largest;
                largest = i;
            } else if (i > secondLargest) {
                secondLargest = i;
            }
        }
        return secondLargest;
    }

    //unique element
    private static int findUnique2ndLargest(int[] arr) {

        if (arr == null || arr.length < 2)
            throw new IllegalArgumentException("Need at least 2 elements");

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        boolean presentInArray = false;

        for (int x : arr) {
            if (x > largest) {
                secondLargest = largest;
                largest = x;
            } else if (x > secondLargest && x != largest) {
                secondLargest = x;
            } else if (x == Integer.MIN_VALUE) {
                presentInArray = true;
            }
        }

        if (presentInArray || secondLargest > Integer.MIN_VALUE) {
            return secondLargest;
        }
        return -100;
    }

    //use min heap logic
    //Imp note : if need to find unique element, then first use HashSet(),
    // then use same logic
    private static int findKthLargest(int[] arr, int k) {

        if (arr == null || arr.length == 0) throw new IllegalArgumentException("Empty array");
        if (k < 1 || k > arr.length) throw new IllegalArgumentException("k out of range");


        PriorityQueue<Integer> queue = new PriorityQueue<>(k);

        for (int x : arr) {
            if (queue.size() < k) {
                queue.offer(x);
            } else if (queue.peek() < x){
                queue.poll();
                queue.offer(x);
            }
        }

        return queue.peek();
    }
}
