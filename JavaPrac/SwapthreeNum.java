class SwapthreeNum{
    // public static void main(String [] args)
    // {
    //     int temp,a,b;
    //     a = 3;
    //     b = 5;
    //     temp = a;
    //     a = b;
    //     b = temp;
    //     System.out.println(a +" "+ b);
    // }
    public static void main(String [] args)
    {
        // with out third variable
        int a = 20,b=30;
        System.out.println("a : "+ a + " b : "+ b);
        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println("a : "+ a + " b : "+ b);
    }
}