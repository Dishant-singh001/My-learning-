package Searching.Linear_Search;

public class Solution {
    public static void main(String[] args) {
        int[] nums = {23,34,5};
        System.out.println(findNumbers(nums));
        
    }
    public static int findNumbers(int[] nums) {
        int count = 0;
        for( int i = 0; i < nums.length; i++){
            if(even(nums[i])){
                count++;
            }
        }
        return count;
         
    }
    static boolean even(int num){
        int numbersOfDigit = digits(num);
        return numbersOfDigit % 2 == 0;
    }

    static int digits(int num){
        //int count = 0;
        if(num < 0){
            num *= -1;
        }
        return (int)(Math.log10(num))+1;   // you can also use while loop below 
        // while(num > 0){
        //     num /=  10;
        //     count++;
        // }
        // return count;
    }
}
