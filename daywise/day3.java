//continuing patterns 
public class day3 {
    public static void main (String[] args){
        int n = 4 ;
        int a =1;
        /*System.out.println("****");
        for(int i=1; i<=n;i++){        
            for(int j=1; j<=i;j++){
                System.out.print('*');                
            }
            for(int j = 1; j<=2*(n-i);j++){
                System.out.print(" ");
            }
            for(int j =1 ; j<=i;j++){
                System.out.print('*');
            }
            System.out.println();  
        }
        for(int i = 1; i<=n;i++){
            for(int j = n; j>=i;j--){
                System.out.print('*');
            }
            for(int j = 1 ;j<=2*i-2;j++ ){
                System.out.print(' ');      
            }
            for(int j =n; j>=i;j--){
                System.out.print('*');
            }
            
            System.out.println( );
        }*/
        for(int i=1; i<=n; i++){
            for(int j=0;j<=i;j++){
                System.out.print(' ');
            }
            for(int j=0;j<=i;j++){
                System.out.print(i);
                System.out.print(' ');
            }
            System.out.println(); 

        }
    }

}
