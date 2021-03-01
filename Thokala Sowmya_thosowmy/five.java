//java program to find the k-largest elements in a given array
 import java.util.*;
 class five {
   //creating a main method
    public static void main(String[] args) 
    {
        //creating an array of integers
        Integer arr[] = new Integer[]{1, 4, 17, 7, 25, 3, 100};
        //creating a variable for k
        int k = 3;
		System.out.println("Original Array: ");
		System.out.println(Arrays.toString(arr));
		System.out.println(k +" largest elements of the said array are:");
        //sorting an array of elements
        Arrays.sort(arr, Collections.reverseOrder());    
       //loop for printing the k largest elements     
       for (int i = 0; i < k; i++) 
          System.out.print(arr[i] + " ");
      }      
  }