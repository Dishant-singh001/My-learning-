package Searching.Linear_Search;
// even digits in a number li 2 has 1 digit ,56 has two digit that is even

public class Q5leetcode {
    public static void main(String[] args) {
        int[] nums = { 12,24,-24,4,5,67,-9090,9065};
        //3 even digit no. 18, 1764, 98
        System.out.println(even(nums)); 
    }
    static int even(int [] x){
        //int count = 0;
        int evendigit = 0;
        for(int i = 0; i < x.length; i++){
            int count = 0;
            int digit = x[i];
            if(digit < 0){
                digit *=-1;
            }
            while(digit > 0){
                count++;
                digit /= 10;
            }
            if(count%2==0){
                
                evendigit++;
            }
        }

        return evendigit;
    }  
}
