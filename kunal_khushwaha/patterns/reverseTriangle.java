public class reverseTriangle {
    public static void main(String[] args) {
        int n = 5;
        reversetri(n);
    }
    static void reversetri(int x){
        for(int i = 0; i < x; i++){
            for(int j = x; j > i; j--){
                //j=j-i;
                System.out.print(j-i+" ");
            }
            System.out.println();
        }
    }
    
}
