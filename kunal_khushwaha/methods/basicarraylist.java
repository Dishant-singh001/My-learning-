package kunal_khushwaha.methods;

import java.util.ArrayList;

public class basicarraylist {
    public static void main(String[] args) {
        // Create an arraylist of integers  
        ArrayList<Integer> list = new ArrayList<Integer>();
        ArrayList<String> str = new ArrayList<String>();
        ArrayList<Boolean> bool= new ArrayList<Boolean>();
        ArrayList<Float> floats= new ArrayList<Float>();
        ArrayList<Double> doubles= new ArrayList<Double>();
        ArrayList<Character> chars= new ArrayList<Character>();

        //Add element to ayyay list
        System.out.println("adding elements in array list ");
        list.add(8);        list.add(9);      
        str.add("hiii");    str.add("hiii");   
        bool.add(true);     bool.add(true);
        floats.add(1.1f);   floats.add(1.1f);
        doubles.add(9.00);  doubles.add(9.00);   doubles.add(9.00);
        chars.add('a');     chars.add('a');      chars.add('a');

        System.out.println("\n"+list+"\n"+str+"\n"+bool+"\n"+floats+"\n"+doubles+"\n"+chars);

        // update an element  
        System.out.println("\nupdate element in array list ");
        list.set(1,99);
        str.set(1,"kunal");
        bool.set(1,false);
        floats.set(1, 2.2f);
        doubles.set(1, 8.00);
        chars.set(1,'b');

        System.out.println("\n"+list+"\n"+str+"\n"+bool+"\n"+floats+"\n"+doubles+"\n"+chars);

        //add an element in between
        System.out.println("\nadd element in between array list ");
        list.add(1, 99);
        str.add(1,"kunal");
        bool.add(1,false);
        floats.add(1, 2.2f);
        doubles.add(1, 8.00);
        chars.add(1,'b');
    
        // print the arraylist
        System.out.println("\n"+list+"\n"+str+"\n"+bool+"\n"+floats+"\n"+doubles+"\n"+chars);

        // remove aelement form the arraylist
        System.out.println("\nremove element from array list ");
        list.remove(1);
        str.remove(1);
        bool.remove(1);
        floats.remove(1);
        doubles.remove(1);
        chars.remove(1);

        System.out.println("\n"+list+"\n"+str+"\n"+bool+"\n"+floats+"\n"+doubles+"\n"+chars);

        //to get an element at an index
        System.out.println("\nget element from array list ");
        System.out.println(list.get(0));
        System.out.println(str.get(0));
        System.out.println(bool.get(0));
        System.out.println(floats.get(0));
        System.out.println(doubles.get(0));
        System.out.println(chars.get(0));
        
        //length of arraylist
        System.out.println("\nlength of array list ");
        System.out.println("\nlength of list: "+list.size());
        System.out.println("length of str"+str.size());
        System.out.println("length of bool"+bool.size());
        System.out.println("length of floats"+floats.size());
        System.out.println("length of doubles"+doubles.size());
        System.out.println("length of chars"+chars.size());

        //for and while loops can also be use
        System.out.println("\nfor loop");
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
        System.out.println("\nwhile loop");
        int j=0;
        while(j<list.size()){
            System.out.println(list.get(j));
            j++;
        }

        //sorting of arraylist
        System.out.println("\nSorting of array list ");
        for (Integer list1 : list) {
            list.add(10-j);
        }
        // Collections.sorting(list);
        System.out.println(list);
    }    
}
