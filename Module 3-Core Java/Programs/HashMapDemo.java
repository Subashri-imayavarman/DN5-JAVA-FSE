import java.util.HashMap;
import java.util.Scanner;

public class HashMapDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        HashMap<Integer, String> students = new HashMap<>();

        students.put(101, "Suba");
        students.put(102, "Sangee");
        students.put(103, "Yam");

        System.out.print("Enter Student ID: ");
        int id = sc.nextInt();

        if(students.containsKey(id))
            System.out.println("Name: " + students.get(id));
        else
            System.out.println("ID Not Found");

        sc.close();
    }
}

/*
Sample Input:
102

Sample Output:
Name: Sangee
*/