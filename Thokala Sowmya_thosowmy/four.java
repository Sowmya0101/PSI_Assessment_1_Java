//java program to print an array after changing the rows and columns of a given twodimensional array
import java.util.Scanner;
 class four {
    //creating the main method
     public static void main(String[] args) {
           //creating a 2-D array
	    int[][] twodarray = {
				{10, 20, 30},
				{40, 50, 60}
	       };
	     System.out.print("Original Array:\n"); 
              //calling method 
	      print_array(twodarray);
              System.out.print("After changing the rows and columns of the said array:");
              //calling method
	      change(twodarray);
		}
      //method for changing the rows and columns
	private static void change(int[][] twodarray) {
		int[][] newtwodarray = new int[twodarray[0].length][twodarray.length];
		
		for (int i = 0; i < twodarray.length; i++) {
			for (int j = 0; j < twodarray[0].length; j++) {
				newtwodarray[j][i] = twodarray[i][j];
			}
		}
		
		print_array(newtwodarray);
	}

	private static void print_array(int[][] twodarray) {
		for (int i = 0; i < twodarray.length; i++) {
			for (int j = 0; j < twodarray[0].length; j++) {
				System.out.print(twodarray[i][j] + " ");
			}
			System.out.println();
		}
	
	}
}
