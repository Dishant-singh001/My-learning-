package Searching.Linear_Search;

public class for_each {
    public static void main(String[] args) {
        String name = "Dishant Singh";
        char target = 'D';
        System.out.println(linearSearch(name, target));
    }
    static boolean  linearSearch(String str , char target){
        if (str.length()==0){
             return false;
        }
        for (char ch : str.toCharArray() ){
            if (ch == target){
                return true;
            }
        }  
        return false;  
    }
}
