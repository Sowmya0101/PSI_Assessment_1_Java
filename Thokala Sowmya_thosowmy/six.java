//java program that will accept an integer and convert it into a binary representation and count the no.of bits equal to zero
import java.util.Scanner;
import java.util.*;
class six  {
   //creating a method for converting into binary and counting the no.of bits equal to zero
   public static int binaryrep(int num)
   {
    int ctr=0;
    //to convert into a binary representation
    String binaryno = Integer.toBinaryString(num);
    System.out.println("Binary representation is:"+binaryno);
    for(char ch:binaryno.toCharArray())
    {
      ctr+=ch=='0'?1:0;//increamenting the counter if it has zero
     }
   return ctr;
   }
  //creating a main method
 public static void main(String[] args)
 {
  //creating a scanner class
  Scanner sc= new Scanner(System.in);
  System.out.println("Enter number");
  //reading value from the user
  int num=sc.nextInt();
  System.out.print("Number of zero bits:" + binaryrep(num));
 }
}
    
    