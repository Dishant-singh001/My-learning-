package Searching.Linear_Search;
//Find minimum and maximum number
public class Q3 {
    public static void main(String[] args) {
        int[] arr ={1,4,6,8,0,10,3,-8,-5,-43};
        System.out.println("minimum : "+ minimum(arr));
        System.out.println("Maximum : "+ maximum(arr));
    }
    //minimum method
    static int minimum(int[] arr){
        int min =arr[0];
        for(int i = 0; i < arr.length; i++){
            if(min > arr[i]){
                min = arr[i];
            }
        }
        return min;
    }
    //maximum method 
    static int maximum(int[] arr){
        int max =arr[0];
        for(int i = 0; i < arr.length; i++){
            if(max < arr[i]){
                max = arr[i];
            }
        }
        return max;
    }
}

