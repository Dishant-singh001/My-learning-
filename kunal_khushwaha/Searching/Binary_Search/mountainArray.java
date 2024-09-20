package Searching.Binary_Search;
//mountain array is like this {1,2,3,4,5,6,7,4,2,1,0}    increase than decrease
//find greatest no. in the arry or peek aaray  //in above array 7 is the biigest no. (peek no.)
public class mountainArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,0,0,0,0,0,0,0};
        System.out.println(peek(arr));
    }
    public static int peek(int[] arr){
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
        return arr[start];
        }
    
}
