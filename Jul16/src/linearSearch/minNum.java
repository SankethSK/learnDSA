package linearSearch;
import java.util.*;
public class minNum {
	public static void main(String[] args)
	{
	
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the size of the Array:");
		int n=in.nextInt();
		int[] arr=new int[n];
		System.out.println("Enter the elements of the Array:");
		for(int i=0;i<arr.length;i++)
		{
			int ele=in.nextInt();
			arr[i]=ele;
		}
		int min=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(min>arr[i])
			{
				min=arr[i];
			}
		}
		System.out.println("The min element of the Array is: "+min);
		
		
	}
}
