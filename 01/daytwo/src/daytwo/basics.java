package daytwo;
import java.util.*;

public class basics {
    public static void main(String[] args) {
        sum();
    }

    public static void sum() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the two numbers:");
        System.out.print("Enter the first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = sc.nextInt();
        int sum = num1 + num2;
        System.out.println("Sum of two numbers is: " + sum);
        sc.close();
    }
}
	

