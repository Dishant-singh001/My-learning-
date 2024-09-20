package methods;
import java.util.*;
public class arraylist {
    public static void main(String[] args) {
        // Creating an ArrayList
        ArrayList <Integer> list =new ArrayList<>(10);
        int a= 100;
        for(int i=0;i<9;i++){
            list.add(a);
            a+=5;
        }
        //function of ArrayList 
        System.out.println("ArrayList: "+list);
        System.out.println(".remove to remove an element at an index : "+list.remove(3));
        System.out.println(list);
        System.out.println(".set to update avalue at a specific index : "+ list.set(3,54));
        System.out.println(list);
        System.out.println(".get to get lement at a specific index : "+list.get(4));
        System.out.println(list);
        System.out.println(".contains to check if the element is in the arraylist or not : "+list.contains(105));
        System.out.println(list);

        list.add(10);
        list.add(90);
        System.out.println(list);
    }
    
}
