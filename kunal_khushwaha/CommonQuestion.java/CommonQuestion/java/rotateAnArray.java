public class rotateAnArray {
    public static void main(String[] args) {
        int[] arr={1,2,4,8,16,32,64};
        int element = 4;          // for 3 array will be {16,32,64,1,2,4,8}
        rotatearray(arr,element) ;
    }
    static void rotatearray(int []arr,int element){
        int[] newArray=new int[arr.length];
        element =arr.length - element;
        for( int i = 0; i  < arr.length; i++){
            newArray[i] = arr[(i + element)%arr.length];
            //newArray[i] = arr[(i + arr.length - element) % arr.length];   //use this directly instead 
        }
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        for(int i = 0; i < newArray.length; i++){
            System.out.print(newArray[i] + " ");
        }

    }
    
}
