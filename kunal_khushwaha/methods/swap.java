package kunal_khushwaha.methods;
public class swap {
    public static String[] swap_string(String x,String y){
        String temp=x;  
        x=y;
        y=temp;
        String r []={x,y};
        return r;
    }
    public static void main (String[]args){
        String a="Hello";
        String b="World";

        System.out.println("Before swapping: a = "+a+" b = "+b);
        String [] result = swap_string(a,b);
        System.out.println("After swapping: a = "+result[0]+" b = "+result[1]);
        //String is immutable so the data is changed on temporary bases , the actual parameters are still the same 
    }
}

