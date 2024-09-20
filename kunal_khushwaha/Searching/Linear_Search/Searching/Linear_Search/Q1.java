package Searching.Linear_Search;
//Search in strings 
public class Q1 {
    public static void main(String[] args) {
        String name = "Dishant Singh";
        char target = 'k';
        System.out.println(linearSearch(name, target));

    }
    static boolean   linearSearch(String str , char target){
        if (str.length()==0){
             return false;
        }
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == target){
                //to get index
                return true;
                //to get element arr[i]
                // to get true or false return arr[i] == target;
            }
        }
        //This line will executes when target is not found
        return false;
    }
}
