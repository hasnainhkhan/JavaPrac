class ConstCls{
      int a;
      int b;
      int c;
      int result;
      public ConstCls(int a,int b){
            this.a=a;
            this.b=b;
      }
      public ConstCls(int a,int b,int c){
            this.a=a;
            this.b=b;
            this.c=c;
            this.result= a+b+c;
            System.out.println(result);
      }
      public static void main(String[] args)
      {
            ConstCls obj = new ConstCls(2,8,8);
            
      }
}