//to demonostrate the Java program that accepts four integer from the user and check whether they are equal or not
import java.util.Scanner;
class first {
 //creating the main method
 public static void main(String[] args)
 {
  //creating the scanner class
  Scanner sc = new Scanner(System.in);
  System.out.println("enter the 4 numbers");
  //reading values from the user
  int n1=sc.nextInt();
  int n2=sc.nextInt();
  int n3=sc.nextInt();
  int n4=sc.nextInt();
  if(n1==n2 && n2==n3 && n3==n4)
  {
   System.out.println("Numbers are equal");
  }
 else {
  System.out.println("Numbers are not equal!");
 }
}
}
