package linearSearch;

import java.util.Scanner;

/*You have been given an array of size N consisting of integers. 
In addition you have been given an element M you need to find and 
print the index of the last occurrence of this element M in the array 
if it exists in it, otherwise print -1. Consider this array to be 1 indexed.*/

public class LinearSearch {
	 public static void main(String[] args) throws Exception {
		 Scanner s = new Scanner(System.in);
         int N = s.nextInt();
         int M = s.nextInt();
         
         //Approach 1 - save the index without actually creating array
         int index = -1;
         for(int i = 1; i <= N; i++) {
             if(M == s.nextInt()) {
                 index = i;
             }
         }
         
       //Approach 2 - Take input into array and traverse through
         /*int index = -1;
         int[] array = new int[N];
         for(int i = 0; i < N; i++) {
        	 array[i] = s.nextInt();
             if(M == array[i]) {
                 index = i+1;  //Array is indexed 1
             }
         }*/
         
       //Approach 3 - Take input into array and traverse from right
        /* int index = -1;
         int[] array = new int[N];
         for(int i = 0; i < N; i++) {
        	 array[i] = s.nextInt();
             
         }
         for(int i = N-1; i >= 0; i--) {
        	 if(M == array[i]) {
        		 index = i+1;
        		 break;
             }
         }*/
         
         System.out.println(index);
	 }
}
