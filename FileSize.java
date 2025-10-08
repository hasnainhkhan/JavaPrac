import java.util.Scanner;
import java.io.File;
class FileSize{
      public static void main(String [] args)
      {
           long filesize =  new File("Calculator.java").length();
           System.out.println(filesize + " bytes");

      }
}