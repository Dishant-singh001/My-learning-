public class emptytriangle {
    public static void main(String[] args) {
        int n = 5;
        emptytri(n);
    }
    static void emptytri(int x){
        for(int i = 0; i < x; i++){
            for( int j = 0; j < x; j++){
                if(i == j || i + j == x - 1 || i == 0 || i == x-1){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
        System.out.println();
        }
    }
}

