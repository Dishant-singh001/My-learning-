public class Solution {
    public static void main(String[] args) {
        int A[] ={1, 3, 4, 4, 6, 6, 6, 6, 6, 7 };
        int B = 4;
        System.out.println(solve(A,B));
    }
    public static int solve(int[] A, int B) {
        int start = 0, end = A.length;
        int ans = -1;
        
        if( B >= A[A.length-1]){
            return A.length;
        }
        if(B <= A[0]){
            return 0;
        }
       // System.out.println("hello");
        while(start <= end){
            int mid =(start + (end - start)/2);
            if(B < A[mid]){
                end = mid - 1 ;
                ans = mid ;
            }
            if(B >= A[mid]){
                //ans = mid+1;
                start = mid + 1;
                ans = mid+1 ;
            } 
        }
        return ans;
    }
}
