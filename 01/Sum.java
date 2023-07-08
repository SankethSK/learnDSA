import java.util.*;
public class Sum
{
    public static void main(String[] args)
    {
        int b;
        float a;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the two numbers:-");
        a=sc.nextFloat();
        int d=(int)(a);
        b=sc.nextInt();
        int c=d+b;
        System.out.println("The Sum of two numbers are:-"+c);
        //Type casting int to byte
        int bx=16;
        byte by=(byte)(bx);
        System.out.println(by);
    }
}