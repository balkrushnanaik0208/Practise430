import java.util.Scanner;

public class DrivingLicense {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = sc.nextInt();
        System.out.println("Enter your exp");
        int exp = sc.nextInt();
        System.out.println("Enter your violations");
        int violations = sc.nextInt();

        if(age>=18 && age<65)
        {
            if(exp>=2 && violations<=3)
            {
                System.out.println("Eligible for Driving License");
            }

            }
            System.out.println("Not Eligible");
        }

    }

