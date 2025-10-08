import java.util.Scanner;
class OddNumber{
      public static void main(String [] args)
      {    
            boolean flag = false;
      //      Scanner sc = new Scanner(System.in);
      //      System.out.println(":");
      //      int num = sc.nextInt();
           for(int a = 0; a<100; a++) 
           {
            if(a%2==0){
                  System.out.println(a);
                  flag = true;
            }
           }
           if(flag == true){
            System.out.println("True");
           }
           else{
            System.out.println("False");
           }
           
      }
}