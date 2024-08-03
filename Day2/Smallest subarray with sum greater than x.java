// https://www.geeksforgeeks.org/problems/smallest-subarray-with-sum-greater-than-x5651/1

class Solution {

    public static int smallestSubWithSum(int x, int[] arr) {
        int n = arr.length;
        int minLength = n + 1;
        int start = 0;
        int end = 0;
        int currentSum = 0;

        while (end < n) {
            // Add elements to currentSum
            while (currentSum <= x && end < n) {
                currentSum += arr[end++];
            }

            // If currentSum becomes greater than x
            while (currentSum > x && start < n) {
                if (end - start < minLength) {
                    minLength = end - start;
                }
                currentSum -= arr[start++];
            }
        }
        
    return minLength == n + 1 ? 0 : minLength;
        
    }
}
