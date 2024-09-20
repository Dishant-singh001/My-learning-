public class numequiTriangle {
    public static void main(String[] args) {
        int n = 5;
        numtriangle(n);
    }
    static void numtriangle(int x){
        for(int i =0;i<x;i++){
            for(int j=x-1;j>i;j--){
                System.out.print(" ");
            }
            for(int j = 0; j < i+1; j++){
                System.out.print(j+1+" ");
            }  
            System.out.println();
        }
    }   
}
