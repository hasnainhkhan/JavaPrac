class AreaofHexagon{
      public static void main(String [] args)
      {
            System.out.println(area(7));
      }
      public static long area(long s){

            double result = (6*s*s)/(4*.57);
            return (long)result;
      }
}