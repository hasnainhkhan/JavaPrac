import java.io.File;
class FileSize{
      public static void main(String [] args)
      {
            long fileSize = new File("README.md").length();
            System.out.println(fileSize + " bytes");
      }
}