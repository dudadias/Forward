package repeatingStructure.doWhileStatement;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int old;
        do {
            System.out.println("Press 0 to exit");
            old = scanner.nextInt();

        } while(old != 0);
        scanner.close();
    }
    
}
