// Linear search or sequential search is a method for finding a particular value in a list.
// Linear search is the simplest search algorithm.
// For a list with n items, the best case is when the value is equal to the first element of the list, in which only one comparison in needed.
// The worst case is when the value is not in the list(or occurs only once at the end of the list), in which n comparisons are needed.
// Linear searches don't require the collection to be sorted.

public class MyLinearSearch {
 
    public static int linerSearch(int[] arr, int key){
         
        int size = arr.length;

        for(int i=0;i<size;i++){
            if(arr[i] == key){
                return i;
            }
        }
        return -1;
    }
     
    public static void main(String a[]){
         
        int[] arr1= {23,45,21,55,234,1,34,90};
        
        int searchKey = 34;
        
        System.out.println("Key "+searchKey+" found at index: "+linerSearch(arr1, searchKey));
        
        int[] arr2= {123,445,421,595,2134,41,304,190};
        
        searchKey = 421;
        
        System.out.println("Key "+searchKey+" found at index: "+linerSearch(arr2, searchKey));
    }
}


// Output:
// --------
// Key 34 found at index: 6
// Key 421 found at index: 2

