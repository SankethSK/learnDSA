package Array;
import java.util.*;
public class TwoSum {
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		System.out.print("Enter the size of array; ");
		int n=in.nextInt();
		int[] arr=new int[n];
		System.out.print("Enter the elements of array; ");
		
		for(int i=0;i<arr.length;i++)
		{
			int m=in.nextInt();
			arr[i]=m;
		}
		System.out.print("Enter the target of sum; ");
		int target=in.nextInt();
		for(int i=0;i<arr.length;i++)
		{
			int[] arr2=new int[2];
			for(int j=0;j<arr.length;j++)
			{
				int sum=arr[i]+arr[j];
				
				if(sum==target)
				{
					arr2[0]=arr[i];
					arr2[1]=arr[j];
				}
				
			}
			System.out.print(Arrays.toString(arr2));
			
		}
	}
}
