package Searching.Binary_Search;
public class FindinMountainArray{
    public static void main(String[] args) {
        int[] arr = {0,1,2,4,2,1};
        int target = 3;
        System.out.println(FindinIndex(arr,target));

    }
    static int FindinIndex(int [] arr,int target){
        int start = 0;int end = arr.length -1;
        while(start < end){
            int mid = start + (end - start) / 2;
            if(arr[mid] < arr[mid + 1]){
                start = mid + 1;
            }
            else if(arr[mid] > arr[mid + 1]){
                end = mid;
            }
            else{
                return arr[mid];
            
            }
        }
        return SearchInMountainArray(arr, target,start);

    }

    static int SearchInMountainArray(int[] arr, int target,int end){
        int start = 0;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(arr[mid] < target){
                start = mid + 1;

            }
            else if(arr[mid] > target){
                end = mid - 1;
            }
            else{
                return mid;
            }

        }
        return -1;

    }
    
}

