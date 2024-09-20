public class RightAngleTriangle {
    public static void main(String[] args) {
        int n =5;
        Triangle(n);  
    }
    static void Triangle(int x){
        for(int i = 0; i < x; i++){
            for(int j = 0; j < i+1; j++){               //i+1 to avoid i=0 and j=0 condition
                System.out.print("* ");

            }
            System.out.println(" ");
        }
    }
}
