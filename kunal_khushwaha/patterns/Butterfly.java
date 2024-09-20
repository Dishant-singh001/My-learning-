public class Butterfly{
    public static void main(String[] args) {
        int n = 5;
        butterfly(n);
    }
    static void butterfly(int x){
        for(int i = 0; i < x; i++){
            for(int j = 0; j <= i; j++){
                System.out.print("* ");
            }
            for(int j = x; j > i+1; j--){
                System.out.print("    ");
            }
            for(int j = 0; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i = 1; i < x; i++){
            for(int j = x; j > i; j--){
                System.out.print("* ");
            }
            for(int j = 0; j < i; j++){
                System.out.print("    ");
            }
            for(int j = x; j > i; j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
       
}
