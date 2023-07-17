//Auther :Bharat G FST Batch May 2023
//Date:01/06/2023
//Description:To Print Pyramid
package practice;
public class PracticeTest15 {

    public static void main(String[] args) {
        int rows = 10;
        int numOfRows = 5;
        for (int i = 1; i <= rows; ++i) {
            for (int j = 1; j <= i; ++j) {
                System.out.print("* ");
            }
            System.out.println();

        }
        System.out.println("\n");
        System.out.println("PracticeTest Inverted Pyramid of *");
        System.out.println("\n");
       //PracticeTest Inverted Pyramid of *
        for (int i = rows; i >= 1; --i) {
            for (int j = 1; j <= i; ++j) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
        //PracticeTest Pyramid of Numbers
        System.out.println("\n");
        System.out.println("PracticeTest Pyramid of numbers");
        System.out.println("\n");
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; ++j) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        System.out.println();
        //PracticeTest Pyramid of Numbers
        System.out.println("\n");
        System.out.println("PracticeTest Pyramid of numbers");
        System.out.println("\n");
        for (int i = rows; i >0 ; --i) {
            for (int j = 1; j <= i; ++j) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        System.out.println();

        //PracticeTest Pyramid of  numbers
        System.out.println("\n");
        System.out.println("PracticeTest  Pyramid of Numbers");
        System.out.println("\n");
        for (int i = 1; i <= numOfRows; i++) {

            for (int space = 1; space <= numOfRows - i; space++) {
                System.out.print("  ");
            }

            for (int k = 0; k < 2 * i - 1; k++) {
                System.out.print(k + " ");
            }

            System.out.println();
        }
        System.out.println();

        //PracticeTest Inverted Pyramid of numbers
        System.out.println("\n");
        System.out.println("PracticeTest Inverted Pyramid of numbers");
        System.out.println("\n");
        for (int i = numOfRows; i > 0; --i) {

            for (int space = 1; space <= numOfRows - i; space++) {
                System.out.print("  ");
            }

            for (int k = 0; k < 2 * i - 1; k++) {
                System.out.print(k + " ");
            }

            System.out.println();
        }
        System.out.println();
        //PracticeTest Inverted Pyramid of *
        System.out.println("\n");
        System.out.println("PracticeTest Pyramid of *");
        System.out.println("\n");
        for (int i = 1; i <= numOfRows; i++) {

            for (int space = 1; space <= numOfRows - i; space++) {
                System.out.print("  ");
            }

            for (int k = 0; k < 2 * i - 1; k++) {
                System.out.print("* ");
            }

            System.out.println();

        }
        System.out.println();
        //PracticeTest Inverted Pyramid of *
        System.out.println("\n");
        System.out.println("PracticeTest Inverted Pyramid of *");
        System.out.println("\n");
        for(int i = numOfRows; i > 0; --i) {

            for(int space = 0; space < numOfRows - i; space++) {
                System.out.print("  ");
            }

            for(int j=0; j < 2 * i - 1; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }

    }
}
