import java.util.Scanner;

public class AbsoluteValueNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int x = scanner.nextInt();

        int absoluteValue;

        if (x < 0) {
            absoluteValue = -x;
        } else {
            absoluteValue = x;
        }

        System.out.println("Absolute value: " + absoluteValue);

        scanner.close();
        System.out.println();
        System.out.println("Balkrushna");




    }
}
