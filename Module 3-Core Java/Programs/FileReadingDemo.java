import java.io.File;
import java.util.Scanner;

public class FileReadingDemo {

    public static void main(String[] args) {

        try {

            File file = new File("output.txt");
            Scanner read = new Scanner(file);

            while(read.hasNextLine()) {
                System.out.println(read.nextLine());
            }

            read.close();

        } catch(Exception e) {
            System.out.println("File Not Found");
        }
    }
}

/*
Content in output.txt:
Hello CTS

Output:
Hello CTS
*/