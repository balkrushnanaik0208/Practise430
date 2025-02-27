import java.util.Scanner;

public class CompareTwoNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number = ");
        int a = sc.nextInt();
        System.out.println("Enter Second Number");
        int b = sc.nextInt();

        if (a > b) {
            System.out.println("A is greater than B");
        } else if (a == b) {
            System.out.println("A and B are equal");
        } else {
            System.out.println("B is greater than A");
        }
    }
}
