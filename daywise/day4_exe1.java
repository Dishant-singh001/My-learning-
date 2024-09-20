/*
// enter 3 no. and print average 
import java.util.*;
public class day4_exe1{
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int a =read.nextInt();
        int b =read.nextInt();
        int c = read.nextInt();
        double avg =(a+b+c)/3;
        System.out.print("average of the no. is : "+ avg);
        read.close();

    }

}

//2 write a funtion to print the sum of all odd no. from 1 to n
import java.util.*;
public class day4_exe1{
    public static void oddsum(int n){
        int sum = 0;
        for(int i = 1; i<=n;i++){
            if(i%2!=0){
                sum=sum+i;
            }
        }
        System.out.print("sum of odd no. is "+ sum);
        return;
    }
    public static void main(String[]args){
        Scanner read = new Scanner(System.in);
        int n = read.nextInt();
        oddsum(n);

    }
}

// find largest of 2 no. 
import java.util.*;
public class day4_exe1{
    public static void large(int a ,int b){
        if(a<b){
            System.out.println(b+"b is larger");
        }
        else{
            System.out.println(a + " is larger");
        }
    }
    public static void main (String[]args){
        Scanner read = new Scanner(System.in);
        int a = read.nextInt();
        int b =read.nextInt();
        large(a,b);
    }
}

//wap that take no. as input and than print total count of +ve,-ve and zeros entered 
import java.util.*;
public class day4_exe1{
    public static void count(int x,int p,int z,int n){
        Scanner read = new Scanner(System.in);
        if(x>0){
            p +=1;
        }
        else if(x<0){
            n +=1;
        }
        else{
            z +=1;
        }
        System.out.println("1/0");
        int y =read.nextInt();
        if(y==1){
            System.out.println("enter no. again");
            x = read.nextInt();
            count(x,p,z,n);
        }
        else{
            System.out.println("total +ve" + p);
            System.out.println("total -ve" + n);
            System.out.println("total zeros" + z);

        }

       
    }
    public static void main(String[]args){
    int a=0;int p=0;
    int n=0;int z=0;
    Scanner read = new Scanner(System.in);
    while(a<=0){
        System.out.println("enter no.");  
        int x = read.nextInt();
        count(x,p,z,n);
        a+=1;
        }

    } 
}
*/
//febonacci series
import java.util.*;
public class day4_exe1{
    public static void main(String[]args){
        Scanner read = new Scanner(System.in);
        int n = read.nextInt();
        int f1 =0,f2=1;
        for(int i=0;i<=n;i++){
            f1=i;
            f2=f1;
            System.out.println(f1);
            System.out.println(f2);
        }
    }
}
    


