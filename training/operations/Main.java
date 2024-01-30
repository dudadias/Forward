package training.operations;

public class Main {
    public static void main(String[] args) {
        int a = 80;
        int b = 50;
        int addition = a + b;

        System.out.println(addition);

        int c = 8;
        int d = 3;
        int subtraction = c - d;

        System.out.println(subtraction);

        int e = 4;
        int f = 9;
        int multiplication = f * e;

        System.out.println(multiplication);

        int g = 10;
        int h = 2;
        int division = g / h;

        System.out.println(division);

        int i = 30;
        int j = 5;
        int remainder = i % j;

        System.out.println(remainder);

        int expression = 1 + 3 * 4 - 2;
        System.out.println(expression);

        int expressionParentheses = (1 + 3) * (4 - 2);
        System.out.println(expressionParentheses);

        int minusExpressionParentheses = -(100 + 4);
        System.out.println(minusExpressionParentheses);

        int unaryPlus = +5;
        System.out.println(unaryPlus);

        int unaryMinus = -8;
        System.out.println(unaryMinus);

    }
}