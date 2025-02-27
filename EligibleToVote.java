import java.util.Scanner;

public class EligibleToVote {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = sc.nextInt();

        if(age>=18)
        {
            System.out.println("The person is eligible for voting");
        }
        else
        {
            System.out.println("The person not eligible for voting");
        }
        System.out.println("Change from Swapnil");
    }
    
}
