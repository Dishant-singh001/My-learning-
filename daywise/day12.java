
import java.util.Arrays;           //used to converst array into string using .toString function

//sorting 1 bubble sort ,2 insertion sort ,3 selection sort ,4 merge sort ,5 quick sort ,mud sort

public class day12 {
    public static void main(String[]args){
        int arr[]={9,8,7,6,5,4,3,2,1};
        //-------------------------------------BUBBLE SORT-----------------------------------
        for(int i=0;i<=arr.length-1;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println("Bubble sort    : "+Arrays.toString(arr));

        //-------------------------------------INSERTION SORT-----------------------------------
        for(int i=1;i<arr.length;i++){
            int sorted=arr[i];
            int j=i-1;
            while(j>=0 && sorted<arr[j]){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=sorted;
        }
        System.out.println("Insertion sort : "+Arrays.toString(arr));

        //-------------------------------------SELECTION SORT-----------------------------------
        for(int i=0;i<arr.length-1;i++){
            int smallest=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[smallest]){
                    smallest=j;
            }
        }
        int temp=arr[smallest];
        arr[smallest]=arr[i];
        arr[i]=temp;
        }
    System.out.println("Selection sort : "+Arrays.toString(arr));

    //-----------------------------------------MERGE SORT ---------------------------------------
    
    }
}

