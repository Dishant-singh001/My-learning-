import java.util.Scanner;
public class armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int n = sc.nextInt();
        // for single output 
        System.out.print( n+" is armstrong : "+isarmstrong(n));
        // for multiple output
        for(int i=1000;i<1000;i++){
            if(isarmstrong(i)){
                System.out.println(i);
                }
        }
        sc.close();
    }
    public static boolean isarmstrong(int n){
        int temp = n;
        int sum=0;
        while(n>0){
            int rem=n%10;
            sum=sum+rem*rem*rem;
            n=n/10;
        }
        return sum==temp;
    } 
}
