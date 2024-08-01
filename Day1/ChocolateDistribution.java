


import java.util.Arrays;

public class chocolateDistribution {

    // Function to find the minimum difference
    public static int findMinDiff(int[] arr, int n, int m) {
        // If there are no chocolates or students
        if (m == 0 || n == 0) {
            return 0;
        }

        // Number of students cannot be more than number of packets
        if (n < m) {
            return -1;
        }

        // Sort the given packets
        Arrays.sort(arr);

        // Initialize the minimum difference as a large number
        int min_diff = Integer.MAX_VALUE;

        // Find the subarray of size m such that difference of max and min is minimum
        for (int i = 0; i + m - 1 < n; i++) {
            int diff = arr[i + m - 1] - arr[i];
            if (diff < min_diff) {
                min_diff = diff;
            }
        }

        return min_diff;
    }

    public static void main(String[] args) {
        int[] arr1 = {7, 3, 2, 4, 9, 12, 56};
        int m1 = 3;
        System.out.println(findMinDiff(arr1, arr1.length, m1));  // Output: 2

        int[] arr2 = {3, 4, 1, 9, 56, 7, 9, 12};
        int m2 = 5;
        System.out.println(findMinDiff(arr2, arr2.length, m2));  // Output: 6
    }
}
