package Searching.Binary_Search;
// Basic code of Binary search 

/*Binary Search: Efficiently finds a target in a sorted array by repeatedly dividing the search interval in half. 
Compares target with middle element, adjusts search interval accordingly, and repeats until found or interval
 is empty. Time complexity: O(log n). */
public class code {
    public static void main(String[] args) {
        int[] arr = {-2,4,6,9,11,12,14,20,36,48};
        int target = -20;
        System.out.println(BinarySearch(arr, target));
        
    }
    public static int BinarySearch(int[] arr,int target){
        int start = 0, end = arr.length;
        int ans = -1;
        while(start < end){
            
            
            int mid =(start + end)/2;//this can give large value that cant be stored in int datatype
            //int mid = start+(end - start)/2); //use this to by pass that
            
            if(target > arr[mid]){
                start = mid + 1;
            }
            else if(target < arr[mid]){
                end = mid - 1;
            }
            else{
                //ans = 1;
                return mid;
            }
        }
        return ans;
    }
}
