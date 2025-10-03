class PrintFace{
    public static void main(String [] args)
    {
        String [] face = new String[5];
        face[0] = "  +\" \" \" \" \" \" +";
        face[1] = "[ |   o    o   |]";
        face[2] = "  |      ^     | ";
        face[3] = "  |     '_'    | ";
        face[4] = "  +____________+";
        for(String a:face){
            System.out.println(a);
        }
    }
}