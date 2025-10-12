class Calculator extends Addition{

      public static void main(String [] args){
            Divison obj = new Calculator();
            obj.PrintFun();

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

      public void PrintFun(){
            System.out.println("This is Div");
      }
}