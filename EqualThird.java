import java.util.Scanner;
class EqualThird{
      public static void main(String [] args)
      {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter  first number");
            int a = sc.nextInt();
            System.out.println("Enter  first number");
            int b = sc.nextInt();
            System.out.println("Enter  first number");
            int c = sc.nextInt();
            int result = a + b;
            if(result==c){
                  System.out.println("True\n" + "Sum:" +result);
            }
            else
            {
                  System.out.println("True");
            }
      }
}