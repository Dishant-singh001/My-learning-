package Searching.Linear_Search;

/*linear search means searching an element linearly 
 * that means one by one comparing it to the array element until we found it using loop 
 * Time Complexcity = O(n)  and Space Complexity = O(1)       */
public class LS_Code{
    
    public static void main(String[] args) {
        int [] a = {1,3,2,5,6,8,7,0,-1};
        int x = -1;
        System.out.println("index : "+ linearSearch(a, x));
    }
    //Search in the array
    static int  linearSearch(int [] arr , int target){
        if (arr.length==0){
             return -1;
        }
        for(int i = 0; i < arr.length; i++){
            if(arr[i]==target){
                //to get index
                return i;
                //to get element arr[i]
                // to get true or false return arr[i] == target;
            }
            
        }
        //This line will executes when target is not found
        return -1;
    }
}