public class TypeCastingDemo {
    public static void main(String[] args) {

        double num1 = 25.89;
        int value = (int) num1;

        int num2 = 50;
        double result = (double) num2;

        System.out.println("Double Value = " + num1);
        System.out.println("Converted to Int = " + value);

        System.out.println("Int Value = " + num2);
        System.out.println("Converted to Double = " + result);
    }
}

/*
Sample Output:
Double Value = 25.89
Converted to Int = 25
Int Value = 50
Converted to Double = 50.0
*/