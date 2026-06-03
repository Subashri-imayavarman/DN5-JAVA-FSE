public class OperatorPrecedence {
    public static void main(String[] args) {

        int result1 = 10 + 5 * 2;
        int result2 = (10 + 5) * 2;

        System.out.println("Result 1 = " + result1);
        System.out.println("Result 2 = " + result2);
    }
}

/*
Sample Output:
Result 1 = 20
Result 2 = 30
*/