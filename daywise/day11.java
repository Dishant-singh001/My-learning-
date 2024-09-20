//bit manupulation
import java.util.*;
public class day11 {
    public static void main(String[] args) {
        Scanner read =new Scanner(System.in);
        //-------------------------------------get bit()-----------------------------------------------
        System.out.print("get bit\nenter number : ");
        int a=read.nextInt();
        System.out.print("enter position : ");
        int position =read.nextInt();
        int bitmask=1<<position;

        if((bitmask&a)==0){
            System.out.println("at position "+ position+" bit is 0");
        }
        else{
            System.out.println("at position "+position+" bit is 1");
        }
        //--------------------------------------set bit()------------------------------------------------
        // kisi bhi specific position ki bit ko 1 bana nai kai liye use karte h 
        System.out.println("\nSet bit to 1");
        int b=read.nextInt();
        int newbit=bitmask|b;
        System.out.println("new no. is : "+newbit);
        //------------------------------------clear bit()-------------------------------------------------
        //kisi bhi specific postision ki bit zero ban jaigi
        System.out.println("clear bit to 0 ");
        int c=read.nextInt();
        int clearbit=bitmask&(~c);
        System.out.println("new no. is : "+ clearbit);
        //-----------------------------------update bit()-------------------------------------------------
        //kisi bhi specific position ki bit ko 1 or 0 ban jaigi
        System.out.println("update bit 0 or 1");
        int d=read.nextInt();
        if(d==0){
            int updatebit=bitmask&(~d);
            System.out.println("new no. is : "+updatebit);
        }
        else if(b==0){
            int updatebit=bitmask|d;
            System.out.println("new no. is : "+updatebit);
        }
        else{
            System.out.println("invalid input");
        }


    



    }
    
}
