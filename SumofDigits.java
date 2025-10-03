class SumofDigits{
      public static void main(String [] args)

      {     
            SumofDigits obj = new SumofDigits();
            System.out.println("Hello" + obj.sum(3025));
            System.out.println(Math.PI/6);
      }

      public int sum(long n){
            int sum = 0;
            while (n!=0){
                  sum += n % 10;
                  n/= 10;
            }
            return sum;

      }
}