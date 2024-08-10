import java.util.*;
public class day5strings {
    /*
    public static void main(String[] args) {
        Scanner read =new Scanner(System.in);
        //declaring a string
        String a ="hello";
        //taking a input string
        System.out.println("enter your name");
        String name =read.next();
        //funtion in strings

        //1 concatination
        String b =a.concat(" "+ name);
        String c =a+" "+name;
        System.out.println("method 1 "+b+"\nmethod 2 "+ c);

        //2 length of string
        System.out.println("length of string is "+a.length());

        //3 display each element of a string
        for(int i =0;i<a.length();i++){
            System.out.println(a.charAt(i));
        }

        //4 comparing two strings
        String d = "hello";
        if(a.compareTo(d)==0){
            System.out.println("strings are equal");
        }
        else if(a.compareTo(d)<0){
            System.out.println("a is less than b");
        }
        else{
            System.out.println("a is greater than b");
        }

        // 5 string slicing
        String e =name.substring(1,5);
        System.out.println(e);       


    }
    */
    //string builder and its varios functions
    public static void main(String[] args) {
        //declatring String builder
        StringBuilder name =new StringBuilder("Deshant");
        //funtions of string builder 
        //1 append
        name.append(" is good bouy");
        System.out.println("wrong name     "+name);

        //2 to replace/update a element of the string
        name.setCharAt(1,'i');
        System.out.println("correct name     "+name);

        //3 to add and element in the string at any index
        name.insert(11,"a ");
        System.out.println("name with a      "+name);

        //4 to delete a element from a string
        name.delete(20,21);
        System.out.println("name without u   "+name);

        //5 adding element at the last of the string
        System.out.println("complete sentence     "+name.append("."));

        //6 length of string buildr
        System.out.println("length of string builder is     "+name.length());

        //7 finding character at a spesific index
        System.out.println("character at index 5 is     "+name.charAt(5));

        //8 comparing 
        StringBuilder d = new StringBuilder("Dishant is a good boy.");
        if(name.compareTo(d)==0){
            System.out.println("strings are equal");
        } 
    }    
}
