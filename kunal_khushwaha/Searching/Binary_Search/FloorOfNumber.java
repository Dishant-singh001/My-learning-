
package Searching.Binary_Search;

public class FloorOfNumber {
    public static void main(String[] args) {
        int[] arr = {2,3,5,9,14,16,18};
        int target = 1;
        System.out.println(floor(arr, target));
    }
    public static int floor(int arr[],int target){
        int start = 0, end = arr.length-1;
        int ans = -1;
        if(target > arr[arr.length-1]){
            return arr[arr.length-1];
        }
        if( target < arr[0]){
            return -1;
        }
        while(start <= end){
            int mid = start + (end-start)/2;
            if(arr[mid] == target){
                return mid;
            }
            if(target < arr[mid]){
                end = mid -1;
                ans = end;
            }
            if (target > arr[mid]){
                start = mid + 1;
                ans = mid;
            }
        }
        return ans;
    }
}
