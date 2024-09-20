//wap to print all permutations of a given string 
public class day26{
    public static void permu(String str,String permutation){
        if(str.length()==0){
            System.out.print(permutation+" ");
            return;
        }

        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            String newString=str.substring(0,i)+str.substring(i+1);
            permu(newString,permutation+ch);
        }
    }
    public static void main(String []args){
        permu("abcd","");
    }
}