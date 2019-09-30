import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TestingString {
    public static void main (String [] args)
        throws FileNotFoundException {

            File file = new File("CircusEmployees.js");
            System.out.println("exists " + file.exists());
            System.out.println("canRead " + file.canRead());
            Scanner input = new Scanner(file);
            while(input.hasNextLine()) {
                String[] info = input.nextLine().split("         ");
                for (int i = 0; i < info.length; i++) {
                    info[i] = info[i].trim();
                    System.out.println("word: " + info[i]);
                }
            }






    }
}
