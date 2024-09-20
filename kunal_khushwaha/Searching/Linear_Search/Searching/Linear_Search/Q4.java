package Searching.Linear_Search;
//Search in 2d array

import java.util.Arrays;

public class Q4 {
    public static void main(String[] args) {
        int[][] arr = {
            {2,4,6,0},
            {1,3,5,6,8,10,90}, 
            {7,9,11},
            {6}
        };
        int target = 11;
        System.out.println(Arrays.toString(search(arr,target)));
    }
    
    //search method 
    static int[]  search(int[][] x,int target){
        for(int i = 0; i < x.length; i++){
            for( int j = 0; j < x[i].length; j++){
                if(x[i][j] == target){
                    return new int []{i,j};
                }
            }
        }
        return new int []{-1,-1};
    }
}
