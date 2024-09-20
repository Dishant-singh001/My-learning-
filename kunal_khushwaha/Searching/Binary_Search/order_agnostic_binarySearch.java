package Searching.Binary_Search;

public class order_agnostic_binarySearch {
    public static void main(String[] args) {
        //int[] arr = {-2,4,6,9,11,12,14,20,36,48}; //use for assending binary seach
        int [] arr ={90, 50, 48, 39, 30, 22, 13, 3, -1, -13};
        int target = 48;
        //check for assending and decending order 
        //compare fisrst and alast element only ,1st and 2nd arr not taken because they can be same
        // eg {2,2,2,2,2,3,4,5,6}  1st and 2nd are same
        if(arr[0] > arr[arr.length-1]){
            System.out.println(DecendingBinarySearch(arr, target));
        }
        else{
            System.out.println(AssendingBinarySearch(arr, target));
        }
        
    }
    public static int AssendingBinarySearch(int[] arr,int target){
        int start = 0, end = arr.length - 1;
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

    //
    
    public static int DecendingBinarySearch(int[] arr,int target){
        int start = 0, end = arr.length-1;
        int ans = -1;
        while(start < end){
            
            
            int mid =(start + end)/2;//this can give large value that cant be stored in int datatype
            //int mid = start+(end - start)/2); //use this to by pass that
            
            if(target > arr[mid]){
                end = mid - 1;   //changed
            }
            else if(target < arr[mid]){
                start = mid + 1;     //changed
            }
            else{
                //ans = 1;
                return mid;
            }
        }
        return ans;
    }
    
}
