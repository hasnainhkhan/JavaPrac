class Calculator extends Addition{
      int a = 10;
      int b = 5;

      public static void main(String [] args){
            Divison obj = new Calculator();
            obj.Div();

            Substraction obj1 = new Calculator();
            obj1.PrintFun();
      }
}
class Addition extends Substraction{
      public void PrintFun(){
            System.out.println("This is subs");
      }
}
class Substraction extends Multiplication{
      public void PrintFun(){
            System.out.println("This is Div");
      }
}
class Multiplication extends Divison{
      public void PrintFun(){
            System.out.println("This is Div");
      }
}
class Divison{

      public int Div(){
            this.a = a;
            this.b = b;
            return a/b;
      }
}