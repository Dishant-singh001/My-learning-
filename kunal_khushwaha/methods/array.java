package methods;

import java.util.Arrays;

public class array {
    
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        System.out.println("1D Fixed Array\n"+Arrays.toString(arr1));
        int[][] arr2 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println("\n2D Fixed size Array");
        for (int[] newarr2 : arr2) {
            System.out.println(Arrays.toString(newarr2));
        }
        int [][] arr3={{1, 2, 3}, {4, 5}, {6, 7, 8, 9,}};
        System.out.println("\n2D Variable size Array");
        for (int[] newarr3 : arr3) {
            System.out.println(Arrays.toString(newarr3));
        }
        System.out.println("now what if I don't know the size of array?\nHere comes the concept of arraylist");

    }    
}
