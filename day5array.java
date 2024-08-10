//defininng array
import java.util.*;
public class day5array {
    /*
    //one d array 
    public static void main(String[]args){
        Scanner read =new Scanner(System.in);
        int[] arr =new int[5]; //defining array
        System.out.println("enter the elements of array");
        for(int i=0; i<5;i++){               //taking input 
            arr[i]=read.nextInt();
        }
        System.out.println("elements of array are");
        for(int j=0;j<5;j++){      //display output
            System.out.print(" " + arr[j]);
            //System.out.println(" ");
        }
        //searching an element
        System.out.println("\nenter element to search");
        int x =read.nextInt();
        for(int k=0;k<5;k++){
            if(arr[k]==x){
                System.out.println("element fount at index:" + k);
            }
        }
    }
*/  
  //two d array
  public static void main(String[] args) {
    Scanner read =new Scanner(System.in);
    //defining 2d array
    System.out.println("enter elements of 2d array");
    int[][] matrix =new int[3][3];
    //inserting values
    for(int i=0;i<3;i++){
        for(int j =0; j<3;j++){
            matrix[i][j]=read.nextInt();
        }
    }

    //display values
    System.out.println("2d matrix is");
    for(int i=0;i<3;i++){
        for(int j=0;j<3;j++){
            System.out.print(matrix[i][j] +" ");
        }
        System.out.println();
    }
    //searching of an element 
    System.out.println("enter element to search");
    int y = read.nextInt();
    for(int i=0;i<3;i++){
        for(int j=0;j<3;j++){
            if(matrix[i][j]==y){
                System.out.println("index of : " + y + " is (" + i + "," + j + ")"); 
            }
        }
    }     
  }
}


