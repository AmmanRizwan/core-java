import java.io.File;
import java.io.IOException;
import java.io.FileReader;

public class JavaIO {
  public static void main(String[] args) {

    // File
    File file = new File("text.txt");

    System.out.println(file.exists());
    System.out.println(file.getAbsolutePath());
    System.out.println(file.canRead());
    System.out.println(file.canWrite());
    System.out.println(file.canExecute());

    try {
      // FileReader 
      FileReader fileReader = new FileReader("text.txt");

      int content;
      String writeMemory = "";
      
      while ((content = fileReader.read()) != -1) {
        writeMemory += (char) content;
        System.out.print((char) content);
      }
      System.out.println();
      System.out.println();

      fileReader.close();

      System.out.println("This content is store in the writeMemory:");
      System.out.println(writeMemory);
    }
    catch (IOException e) {
      System.out.println("There is an error to open a file.");
    }
  }
}