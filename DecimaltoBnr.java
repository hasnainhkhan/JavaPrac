class DecimaltoBnr{
    public static void main(String [] args)
    {
        String name ="Hasnain";
        
        System.out.println(name);

        String myname = new StringBuilder(name).reverse().toString();
        if(name.equals(myname)){
            System.out.println("Palidrom");
        
        }
        else{
            System.out.println("Not Palidrom");
        }
        System.out.println(myname);

    }
}