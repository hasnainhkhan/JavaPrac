class CompareNumber{
      public boolean compare(int a,int b)
      {
            if(a>b){
                  System.out.println("A>B");
            }
            else if(a<b)
            {
                  System.out.println("A<B");
            }
            else if(a!=b){
                  System.out.println("A!=B");
            }
            else if(a==b){
                  System.out.println("A==B");
            }
            return true;
      }
      public static void main(String [] args)
      {
            CompareNumber data = new CompareNumber();
            data.compare(4,3.5);
      }
}