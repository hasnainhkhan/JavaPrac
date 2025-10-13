/* Write a Java program that accepts three integers from the user. 
It returns true if the second number is higher than the first number and
 the third number is larger than the second number. If "abc" is true, the 
 second number does not need to be larger than the first number. */
import java.util.Scanner;
class NumberCom{
      public static void main(String [] args){
       Scanner sc = new Scanner(System.in);
       int a = sc.nextInt();
       int b = sc.nextInt();
       int c = sc.nextInt();
   if (a > b || b > c) {
    System.out.println(true);
} else if(c>a){
    System.out.println(true);
}
else{
      System.out.println(false);
}


      }
}