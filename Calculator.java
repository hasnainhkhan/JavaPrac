class Calculator{
    public int add(int a ,int b)
    {
        return a+b;
    }
    public int sub(int a,int b)
    {
        return a-b;
    }
    public int multiply(int a,int b)
    {   int res = sub(a,b);
        System.out.println(res+ "k");
        return a*b;
    }
    public float div(int a,int b)
    {
        
        return (float) a/b;
    }

    public static void main(String [] args)
    {
        Calculator obj = new Calculator();
        System.out.println(obj.add(2,4));
        System.out.println(obj.sub(2,4));
        System.out.println(obj.multiply(2,4) + " Result of multiplication");
        System.out.println(obj.div(21,4) + "Resule of div");
    }
}