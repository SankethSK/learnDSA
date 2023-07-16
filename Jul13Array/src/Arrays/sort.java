package Arrays;
import java.util.*;

public class sort{
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

		int temp;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i;j<arr.length;j++)
			{
				if(arr[j]<arr[i]) {
					temp=arr[j];
					arr[j]=arr[i];
					arr[i]=temp;
				}
			}	
		}
		System.out.println(Arrays.toString(arr));
		in.close();
	}
}
