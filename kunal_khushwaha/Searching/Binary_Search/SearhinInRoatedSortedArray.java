package Searching.Binary_Search;
/*roated sorted array means ?
1st rotation mai last element aage aajaiga phir agal aagai aaiga phir agla 
arr={1,2,3,4,5}   //sorted array
arr={5,1,2,3,4}   // after 1 rotation 
arr={4,5,1,2,3}   // after 2 rotation

logic 1. find the pivot(biggest no.)
      2. we will find pivot by binary search  logic both the left and right values are less than the mid one
      condition will be arr[mid] > arr[mid+1] also
                        arr[mid-1] > arr[mid] 
      3. if mid is the pivot then return mid
      2. now search in first half(0 to pivot) AND second half (pivot+1 to arr.length-1) 

*/
public class SearhinInRoatedSortedArray {
    
}
