import java.util.Scanner;
class DivideWmodulas {
    public static void main(String[] args) 
       {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter two numbers : ");
            int a = sc.nextInt();
            int b = sc.nextInt();
            int div = a/b;

            int modu = a - (div * b);
            System.out.println("Division is : " + div);
            System.out.println("Modulas is : " + modu);
    }

}