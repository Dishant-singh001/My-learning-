package kunal_khushwaha.collections;
import java.util.ArrayList;
public class arraylist {
    public static void main(String[] args) {
        // Create an array list
        ArrayList<String> list = new ArrayList<>();
        //<name of arrayList>.add(<element>)  is use to add an  element to arraylist
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");

        //<name of arrayList>.addAll(<Another list>)  is use to add a list to the arraylist
        String [] str={"kiwi","pineapple"};
        list.addAll(java.util.Arrays.asList(str));
        System.out.println(list);

        //<name of arrayList>.remove(<index>)  is use to remove an  element to arraylist
        list.remove(2);
        System.out.println(list);

        //<name of arrayList>.set(<index>,<element>)  is use to update an  element at an index of arraylist
        list.set(1,"Grapes");
        System.out.println(list);

        //<name of arrayList>.add(<index>,<element>)  is use to add an  element at an index of arraylist
        list.add(1,"orange");
        System.out.println(list);

        //<name of arrayList>.contains(<element>)  is use to check if an  element is present in arraylist
        System.out.println(list.contains("Apple"));

        //<name of arrayList>.indexOf(<element>)  is use to find index of  an  element in arraylist
        System.out.println(list.indexOf("Apple"));

        //<name of arrayList>.get(<index>)  is use to get the value at  an index of arraylist
        System.out.println(list.get(3));

        //<name of arrayList>.add(<element>)  is use to add an  element to arraylist

    }
}
