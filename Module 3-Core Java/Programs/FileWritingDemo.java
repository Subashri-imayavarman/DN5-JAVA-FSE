import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWritingDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter text: ");
            String text = sc.nextLine();

            FileWriter fw = new FileWriter("output.txt");
            fw.write(text);
            fw.close();

            System.out.println("Data Written Successfully");

        } catch(IOException e) {
            System.out.println("File Error");
        }

        sc.close();
    }
}

/*
Sample Input:
Hello CTS

Sample Output:
Data Written Successfully
*/