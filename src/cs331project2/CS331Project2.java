/*
 * This program tests different methods to find the k-th smallest element
 * in a list.  It implements three different algorithms to verify the
 * complexities of the algorithms.  
 */

package cs331project2;

/**
 *
 * @author Charles O'Neal
 */
public class CS331Project2 {

   
   public static void main(String[] args) {
      // TODO code application logic here
   }
   
   public static int Selectkth1(int [] array, int n, int k) {
   array = mergeSort(array, 0, array.length);
   
   
   return array[k];
}
   
   public static int [] mergeSort (int [] array, int first, int n) {
      
      int n1 = n/2;
      int n2 = n - n1;
      
      return array;
      
   }
   
   public static int [] merge (int [] low, int [] high ) {
      
      int[] temp = new int[low.length + high.length];
      
      
       
      return temp;
   }
}
