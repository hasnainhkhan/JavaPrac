import java.util.Scanner;
class Polygon
{
      public static void main(String [] args)      
      {
            Scanner obj = new Scanner(System.in);
            System.out.println("Enter value side and distance:");
            long a = obj.nextLong();
            long b = obj.nextLong();
            System.out.println(polygon(a,b));
      }
      public static int polygon(long a,long s){
            int poly = (int)(a *  s * s);
            double b = (4*.56);
            int c = (int)b;
            int result = poly / c ;
            return result;
      }
}