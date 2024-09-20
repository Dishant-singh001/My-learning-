public class reversequitriangle {
    public static void main(String[] args) {
        int n = 5;
        reversequitri(n);
    }
    static void reversequitri(int x){
        for(int i=0; i<x;i++){
            for(int j = 0; j < i;j++){
                System.out.print(" ");
            }
            for(int j =x;j>i;j--){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    
}
