package Searching.Binary_Search;
// Ceiling of a number  eg ceiling of 34 in array a={1,3,5,7,17,18,33,35,66} ans 35 
// just greater than 34 
public class Q1 {
    public static void main(String[] args) {
        int [] arr = {2,3,5,9,14,16,18};
        for (int num : arr){
            //System.out.println(num);
            System.out.print("  "+ceiling(arr, num+1)); //ans = 3,5,9,14,16,18,-1
        }        
    }
    static int ceiling(int [] arr, int target){
        int start = 0, end = arr.length-1;
        int ans = arr[0];
        if(target >= arr[arr.length-1]){
            return -1;
        }
        while(start != end+1){
            int mid = (start + end)/2;
            if(arr[mid] < target){
                //ans = arr[mid+1];
                start = mid + 1;
                ans = arr[start];
            }
            else if(arr[mid] > target){
                ans = arr[mid];
                end = mid - 1;
                //ans = arr[end];
            }
            else{
                ans = arr[mid+1];
                return ans;
            }
        }
        return ans;
    }    
}
