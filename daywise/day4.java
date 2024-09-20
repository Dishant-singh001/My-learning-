// funcitons in java 
//1. factorial of a no.
public class day4{
    public static void factorial(int n){
        int fact=1;
        for(int i=1;i<=n;i++){
            fact=fact*i;
            //System.out.print(fact);
        }
        System.out.println(fact);
    }

    public static void main(String[]args){
        factorial(5);
        factorial(9);

        
    }

    
}