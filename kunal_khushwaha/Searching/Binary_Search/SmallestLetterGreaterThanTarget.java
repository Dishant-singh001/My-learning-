// package DSA.kunal_khushwaha.Searching.Binary_Search;
// class ceilingOfAlphabet {
//     public static void main(String[] args) {
//         char [] ch ={'c','d','j'};
//         char target = 'j';
//         System.out.println(nextGreatestLetter(ch, target)); // Output: 
//     }
//     static char nextGreatestLetter(char [] letters, char target){
//         int start = 0, end = letters.length - 1;
//         char ans = 'a';
//         if(target> letters[0]){
//             return letters[0];
//         }
//         if(target > letters[letters.length-1]){
//             return letters[0];
//         }
//         while(start < end){
//             int mid = start + (end - start)/ 2;
//             if(target > letters[mid]){
//                 start = mid + 1;
//                 ans = letters[mid + 1];
//             }
//             else{
//                 end = mid - 1;
//                 ans = letters[mid];
//             }
//         }
//         return ans;
//     }

    
// }
package Searching.Binary_Search;

class SmallestLetterGreaterThanTarget {
    public static void main(String[] args) {
        char[] ch = {'e','e','e','e','e','e','n','n','n','n'};
        char target = 'e';
        System.out.println(nextGreatestLetter(ch, target)); // Output: j
    }

    public static char nextGreatestLetter(char[] letters, char target) {
        int start = 0, end = letters.length - 1;
        while(start <= end){
            int mid = start + ( end - start)/2; 
            if(target < letters[mid]){
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
       }
       return letters[start % letters.length];     
        
    }
} 

