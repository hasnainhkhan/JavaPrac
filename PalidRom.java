class PalidRom{
    private static String name = "0madam0";
    public String reve(String rev){
        String rever = new StringBuilder(rev).reverse().toString();
        return rever;
    }
    public String palidrome(String str){
        String a = reve(str);
        boolean d = str.equals(a);
        if(d == true){
            System.out.println("Palidrom");
        }
        else{
            System.out.println("Not Palid rom");
        }
        return d + "" ;
    }
    public static void main(String [] args){
        PalidRom obj = new PalidRom();
        System.out.println(obj.palidrome(name));
        

  }}