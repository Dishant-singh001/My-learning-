package Searching.Linear_Search;
/* Search in range */
public class Q2 {
    public static void main(String[] args) {
        int[] array ={18, 12, -7, 3, 14, 28};
        int target = 3;
        System.out.println(linearSearch(array , target, 0, 2));
    }
    static boolean linearSearch(int [] arr , int target, int start, int end){
        if (arr.length==0){
             return false;
        }
        for(int i = start; i <= end; i++){
            if(arr[i] == target){
                //to get index
                return true;
                //to get element arr[i]
                // to get true or false return arr[i] == target;
            }
        }
        //This line will executes when target is not found
        return false;
    }
}
