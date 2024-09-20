package Searching.Binary_Search;

public class SearchinmountainArray {
    public static void main (String []args){
        int arr[] = {0,1,2,3,4,2,1};
        int target = 4;
        int peek = max(arr);
        //System.out.println(target + " is present at index : " + search1starr(arr,target,0,peek));
        //System.out.println(target + " is present at index : " + search2ndarr(arr,target,peek,arr.length));
        System.out.println(target + " is present at index : " + search1starr(arr,target,0,peek) + ","+search2ndarr(arr,target,peek,arr.length));
    }
    static int max(int[] arr){
        int start = 0, end = arr.length;
        int ans = -1;
        while(start < end){
            int mid = start + (end - start)/2;
            if(arr[mid] > arr[mid + 1]){
                end = mid;
                ans = mid;
            }
            else if(arr[mid] < arr[mid + 1]){
                start = mid + 1;
                ans = start;
            }
            
        }
        //System.out.println(ans);  
        return ans;  
    }

    static int search1starr(int[] arr, int target ,int start , int end ){
        while(start <= end){
            int mid = start + (end - start)/2;
            
            if(arr[mid] == target){
                return mid;
            }
            else if(arr[mid] > target){
                end = mid -1;
            }
            else if(arr[mid] < target){
                start = mid +1;
            }
        }
        return -1;
    }
    static int search2ndarr(int[] arr, int target ,int start , int end ){
        while(start <= end){
            int mid = start + (end - start)/2;
            
            if(arr[mid] == target){
                return mid;
            }
            else if(arr[mid] < target){
                end = mid -1;
            }
            else if(arr[mid] > target){
                start = mid +1;
            }
        }
        return -1;
    }
}
