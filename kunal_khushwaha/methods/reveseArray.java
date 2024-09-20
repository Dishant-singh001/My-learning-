package kunal_khushwaha.methods;
import java.util.*;

public class reveseArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5,6 ,7 ,8,9,10,11};
            System.out.println(" old  Array  :  "+Arrays.toString(arr));
        
        System.out.println("reverse Array : "+ Arrays.toString(reverse(arr)));
    }
    public static int[] reverse(int[] a ){
        for(int i=0;i<a.length/2;i++){
            int temp = a[i];
            a[i] = a[a.length-1-i];
            a[a.length-1-i] = temp;
        }
        return a;

    }

    
}
