package Searching.Binary_Search;
public class infiniteArray {
    public static void main(String[] args) {
        int arr[] = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50,51,52,53,54,55,56,57,58,59,60,61,62,63,64,65,66,67,68,69,70,71,72,73,74,75,76,77,78,79,80,81,82,83,84,85,86,87,88,89,90,91,92,93,94,95,96,97,98,99,100};
        int target = 39;
        System.out.println("index : "+(ans(arr,target)));
    }
    public static int ans(int[] arr,int target){
        int start = 0;int end = 1;   //taking size as 2 initially
        
        while(arr[end] < target){     //double the size each time when you dont get  the size where the target lies in 
            int newstart = end + 1;
            end = end + (end - start + 1)*2;
            start = newstart;
        }
        //System.out.println(start+" "+end);   /just to cheak the end and start value
        return BinarySearch(arr, target,start,end);
    }
    public static int BinarySearch(int arr[],int target,int start , int end){
        while (start <=end) { 
            int mid = start + (end - start)/2;

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
