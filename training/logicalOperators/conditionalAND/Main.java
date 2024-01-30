package training.logicalOperators.conditionalAND;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("mens football team");
        int age;
        char gender;

        System.out.println("How old are you?");
        age = scanner.nextInt();
        System.out.println("Please, are you F or M?");
        gender = scanner.next().charAt(0);


        if(age >= 18 && gender == 'M' || gender == 'm') {
            System.out.println("Welcome to football team");
        }
        else{
            System.out.println("Sorry but you not enjoy to football team");
        }

        scanner.close();
    }
    
}
