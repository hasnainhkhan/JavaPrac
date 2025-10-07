import java.util.Scanner;
class CustomModulas{
      public static void main(String args[]){
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            int b = sc.nextInt();
            int result = a/b;
            int modu = a -(a/b);
            System.out.println("Modulas is : " + modu);
      }
}