package training.arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = {0, 0, 0, 0, 0, 0, 1, 2, 4, 2, 1};

        for (int i = 0; i < array.length; i++) {
            if (i == 10) {
                System.out.printf("%5d: ", 100);
            } else {
                System.out.printf("%02d-%02d: ", i * 10, i * 10 + 9);
            }

            for (int stars = 0; stars < array[i]; stars++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
