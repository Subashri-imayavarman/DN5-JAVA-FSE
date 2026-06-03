public class PatternMatchingDemo {

    static void checkType(Object obj) {

        switch(obj) {

            case Integer i ->
                System.out.println("Integer Value: " + i);

            case String s ->
                System.out.println("String Value: " + s);

            case Double d ->
                System.out.println("Double Value: " + d);

            default ->
                System.out.println("Unknown Type");
        }
    }

    public static void main(String[] args) {

        checkType(100);
        checkType("Suba");
        checkType(25.5);
    }
}

/*
Sample Output:
Integer Value: 100
String Value: Suba
Double Value: 25.5
*/