import java.util.Arrays;
public class Solution2 {
    public static void main(String[] args) {
        int A [] = {9,1};
        int B[] = {1,2,3,4}; 
        System.out.println(Arrays.toString(solve(A,B)));


    }
    public static int [] solve(int A[], int B[]){
        int result[] = new int[A.length + B.length];
        int idx = 0;
        for (int i = 0; i < B.length; i++){
            if(B[i] > A[A.length-1]){
                result[idx] = -1;
                idx++;
            }
            int start = 0, end = A.length -1;
            while( start <= end){
                int mid = start + (end - start)/2;
                if (A[mid] < B[i]){
                    start = mid + 1;
                }
                else if( A[mid] > B[i]){
                    end = mid -1;
                }
                else{
                    result[idx] = 0;
                    idx++;
                }
            }
        }
        return result;
    }
}
