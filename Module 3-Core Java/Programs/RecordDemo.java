import java.util.List;

record Person(String name, int age) {}

public class RecordDemo {

    public static void main(String[] args) {

        List<Person> people = List.of(
                new Person("Suba", 20),
                new Person("Sangee", 17),
                new Person("Yam", 22)
        );

        people.stream()
              .filter(p -> p.age() >= 18)
              .forEach(System.out::println);
    }
}

/*
Sample Output:
Person[name=Suba, age=20]
Person[name=Yam, age=22]
*/