package Arrays;
import java.util.*;

public class MaxMin {
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		System.out.print("Enter the size:");
		int n=in.nextInt();
		System.out.print("Enter the elemnts:");
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
		{
			int m=in.nextInt();
			arr[i]=m;
		}
		System.out.println(Arrays.toString(arr));
		
		int min=arr[0];
		int max=0;
		for(int i=0;i<arr.length;i++)
		{
			if(min>arr[i])
			{
				min=arr[i];
			}
			
			if(max<arr[i])
			{
				max=arr[i];
			}
			
		}
		System.out.println("Max: "+max+ " Min: "+min);
		in.close();
	}
}
