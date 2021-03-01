//java program to print the contents of a 2-D Boolean array where t will represent true and f will represent false
class three  {
 //creating the main method
 public static void main(String[] args)
 {
  //creating a boolean array
  boolean[][] array={{true,false,true},{false,true,false}};
  int row_length=array.length;
  int col_length=array[0].length;
  //loop checking for the 2-D array
  for(int i=0;i<row_length;i++)
  {
   for(int j=0;j<col_length;j++)
   {
    if(array[i][j])
    {
     System.out.print(" t ");
     }
    else  {
      System.out.print(" f ");
    }
   }
   System.out.println();
  }
 }
}  