package kunal_khushwaha.methods;

import java.util.*;
public class square {
    public static int squares(){
        int num;
        Scanner read=new Scanner(System.in);
        System.out.print("Enter a number : ");
        num=read.nextInt();
        int square=num*num;
        read.close();
        return square;
    }
    public static void main(String[] args) {
        System.out.println("the square is : "+squares());
        }
}

