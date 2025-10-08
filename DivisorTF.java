import java.util.*;
class DivisorTF{

      public static void main(String [] args){
      for(int a = 1; a<=100; a++)
      {     
            if(a % 3 ==0 || a%5 == 0){
                        if(a%5 == 0 && a%3 ==0){
                              System.out.println("Divided by both number:" + a);
                        }
                        else if(a%5 == 0){
                              System.out.println("Divided by 5:" + a);
                        }
                        else if(a%3==0){
                              System.out.println("Divided by 3:" + a);
                        }
                  }
            else{
                  System.out.println("not divided by any " + a);
            }
      }
      
}
}