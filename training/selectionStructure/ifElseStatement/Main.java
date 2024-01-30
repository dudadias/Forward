package training.selectionStructure.ifElseStatement;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int age;

        System.out.println("Hello! We are organazing a party house");
        System.out.println("How old are you?");
        age = scanner.nextInt();


        if (age < 18) {
            System.out.println("Sorry but you can not enter to party house");
        }

        else {
            System.out.println("Welcome to fiest");
        }

        scanner.close();
    }
    
}
