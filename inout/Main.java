package inout;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String name = new String();

        System.out.println("What is your name?");
        name = scanner.nextLine();

        System.out.println("Hello " +name+ "! Welcome to Java World!");
        scanner.close();

    }
    
}
