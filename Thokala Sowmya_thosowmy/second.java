//java program to that accepts two double variables and test if both strictly between 0 and 1
import java.util.Scanner;
class second {
 //creating main method
 public static void main(String[] args)
 {
  //creating a scanner class
  Scanner sc = new Scanner(System.in);
  System.out.println("enter the 2 numbers");
  //reading the values from the user
  double n1=sc.nextDouble();
  double n2=sc.nextDouble();
  if(n1>0 && n1<1 && n2>0 && n2<1)
  {
   System.out.println("True");
  }
 else {
  System.out.println("False");
 }
}
}
