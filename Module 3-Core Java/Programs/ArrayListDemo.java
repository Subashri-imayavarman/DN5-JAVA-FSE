import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<String> students = new ArrayList<>();

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        sc.nextLine();

        for(int i = 1; i <= n; i++) {
            System.out.print("Enter Name: ");
            students.add(sc.nextLine());
        }

        System.out.println("Student List:");

        for(String name : students) {
            System.out.println(name);
        }

        sc.close();
    }
}

/*
Sample Input:
3
Suba
Sangee
Yam

Sample Output:
Student List:
Suba
Sangee
Yam
*/