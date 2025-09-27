class PalidRom{
    private static String name = "madam";
    public String reve(String rev){
        String rever = new StringBuilder(rev).reverse().toString();
        System.out.println(rever);
        return rever;
    }
    public String palidrome(String rever){
        PalidRom obj = new PalidRom();
        String r = obj.reve(name);
        boolean d = name.equals(r);
        if(d == true){
            System.out.println("Palidrom");
        }
        else{
            System.out.println("Not Palid rom");
        }
        return d + "";
    }
    public static void main(String [] args){
        System.out.println(palidrome(name));
        

  }}