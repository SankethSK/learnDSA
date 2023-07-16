package linearSearch;
import java.util.*;

public class evenDigits {
    public static void main(String[] args) {
        int count = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of the Array:");
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the Array:");
        for (int i = 0; i < arr.length; i++) {
            int ele = in.nextInt();
            arr[i] = ele;
        }
        for (int i = 0; i < arr.length; i++) {
            int n1 = arr[i];
            int digits = 0; 
            while (n1 != 0) {
                n1 = n1 / 10;
                digits++;
            }
            if (digits % 2 == 0) {
                count++;
            }
        }
        System.out.println("Number of elements with even digits: " + count);
        in.close();
    }
}
