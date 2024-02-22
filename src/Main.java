import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //variable initializations, declarations
        int smallerNumber, greaterNumber, a, b;
        int greatestCommonFactor = 1, leastCommonMultiple = 0;

        //scanner initialization and user inputs
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the first number: ");
        a = scanner.nextInt();
        System.out.print("Please enter the second number: ");
        b = scanner.nextInt();

        smallerNumber = Math.min(a, b);
        greaterNumber = Math.max(a, b);

        //while loop to calculator the greatest common factor
        int i = 1;
        while (i <= smallerNumber) {
            i++;
            if (smallerNumber % i == 0 && greaterNumber % i == 0) {
                greatestCommonFactor = i;
            }
        }

        //while loop to calculate the greatest common factor
        int j = 1;
        while (j <= (smallerNumber * greaterNumber)) {
            if (j % smallerNumber == 0 && j % greaterNumber == 0) {
                leastCommonMultiple = j;
                break;
            }
            j++;
        }

        System.out.println("Greatest Common Factor is: " + greatestCommonFactor);
        System.out.println("Least Common Multiple is " + leastCommonMultiple);

    }
}