package training.logicalOperators.conditionalOR;

public class Main {
    public static void main(String[] args) {
       int semesterAverage = 8;
       int finalExam = 6;

        if ((semesterAverage >= 90) || (finalExam >= 90)) {
            System.out.println ("Student grade is A");
        }
        else {
            System.out.println("Student grade is B or less ");
        }
    }
    
    
}
