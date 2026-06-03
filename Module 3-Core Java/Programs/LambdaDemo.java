import java.util.ArrayList;
import java.util.Collections;

public class LambdaDemo {

    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();

        names.add("Yam");
        names.add("Suba");
        names.add("Sangee");
        names.add("Pavi");

        Collections.sort(names,
                (a, b) -> a.compareTo(b));

        System.out.println(names);
    }
}

/*
Sample Output:
[Pavi, Sangee, Suba, Yam]
*/