package dayone;

public class CheckIfArraySorted {

    public static void main(String[] args) {
        int[] arr = {-1, 5, 0, 2, 20, 1};
        System.out.println(isSorted(arr));

        int[] anotherArray = {1,1,1,1,1,1};
        System.out.println(isSorted(anotherArray));
    }

    private static boolean isSorted(int[] arr) {

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1])
                return false;
        }
        return true;
    }
}
