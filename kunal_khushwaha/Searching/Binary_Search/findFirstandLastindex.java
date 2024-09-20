
package Searching.Binary_Search;
import java.util.Arrays;
public class findFirstandLastindex {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 5, 5, 5, 6, 7, 8, 9, 10};
        int target = 5;
        int[] result = binarySearch(arr, target);
        System.out.println(Arrays.toString(result));
    }
    static int[] binarySearch(int[] arr, int target) {
        int start = 0, end = arr.length - 1;
        int[] ans = new int[2];
        ans[0] = -1; // Initialize to -1 to indicate not found
        ans[1] = -1;

        // Find the first occurrence
        while (start <= end) {
            int middle = start + (end - start) / 2;
            if (arr[middle] < target) {
                start = middle + 1;
            } else if (arr[middle] > target) {
                end = middle - 1;
            } else {
                ans[0] = middle;
                end = middle - 1; // Search for the leftmost occurrence
            }
        }
        // Find the last occurrence
        start = ans[0]; // Start from the first occurrence found
        end = arr.length - 1;
        while (start <= end) {
            int middle = start + (end - start) / 2;
            if (arr[middle] < target) {
                start = middle + 1;
            } else if (arr[middle] > target) {
                end = middle - 1;
            } else {
                ans[1] = middle;
                start = middle + 1; // Search for the rightmost occurrence
            }
        }
        return ans;
    }
}