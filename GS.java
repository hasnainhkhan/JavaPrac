class GS extends New{
      
      public static void main(String [] args)
      {
            System.out.println("Hello");
            New obj = new New();
            obj.setName("Hasnain");
            obj.setClases("seven");
            System.out.println(obj.toString());

      }
}

class New{
      private String name;
      private String clases;
      
      public New(String name, String clases){
            this.name = name ;
            this.clases = clases;
      }
      public New(){

      }
      public void setName(String name){
            this.name = name;
      }
      public String getName(){
            return name;
      }

      public void setClases(String clases){
            this.clases = clases;
      }
      public String getClases(){
            return clases;
      }

      
      public String toString(){
            return name + clases ;
      }
}