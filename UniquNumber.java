class UniquNumber{
      static int uniqueNumber(){
            //  Generate unique number list
            int count  = 0;
            for(int i = 1; i<=4; i++){
                  for(int j = 1; j<=4; j++)
                  {
                        for(int k = 1; k<=4; k++)
                        {
                              count++;
                              System.out.println(i + "" +j +""+k );
                        }
                  }
            }
            return count;
      }

      public static void main(String [] args)
      {     
            int a = 1;
            uniqueNumber();
            System.out.printf("%d + %d%d  + %d%d%d\n",a,a,a,a,a,a);
      }
}