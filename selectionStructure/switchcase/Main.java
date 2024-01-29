package selectionStructure.switchcase;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Brasel Bank");
        int option;

        System.out.println("1) Deposit");
        System.out.println("2) Withdraw");
        System.out.println("3) Take Loan");
        System.out.println("4) Pay By Card (debit or credit)");
        System.out.println("5) See registration data");
        System.out.println("6) See account information");
        System.out.println("7) See credit card information");
        System.out.println("0) Exit");

        option = scanner.nextInt();

        switch (option) {
            case 1:
                System.out.println("Message: Operation Performed Successfully");
                break;
            case 2:
                System.out.println("Message: Operation Performed Successfully");
                break;
            case 3:
                System.out.println("Message: Operation Performed Successfully");
                break;
            case 4:
                System.out.println("Message: Operation Performed Successfully");
                break;
            case 5:
                System.out.println("Message: Operation Performed Successfully");
                break;
            case 6:
                System.out.println("Message: Operation Performed Successfully");
                break;
            case 7:
                System.out.println("Message: Operation Performed Successfully");
                break;
            default:
                System.out.println("Invalid option. Please choose a valid option.");
                break;
        }

        scanner.close();
    }
}
