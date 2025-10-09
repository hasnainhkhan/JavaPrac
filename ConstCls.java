class ConstCls{
      int a;
      int b;
      int c;
      int result;
      public ConstCls(int a,int b){
            this.a=a;
            this.b=b;
      }
      public ConstCls(int k,int l,int m){
            a=k; // same name means use this.ref variable otherwise directly
            b=l;
            c=m;
            this.result= a+b+c;
            System.out.println(result);
      }
      public static void main(String[] args)
      {
            ConstCls obj = new ConstCls(2,8,8);
            
      }
}