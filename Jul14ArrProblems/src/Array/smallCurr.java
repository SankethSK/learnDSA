package Array;
import java.util.*;
public class smallCurr {
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		System.out.print("Enter the size of the array:");
		int n=in.nextInt();
		System.out.print("Enter the elements of the array:");
		int[] arr=new int[n];
		for(int i=0;i<arr.length;i++)
		{
			int m=in.nextInt();
			arr[i]=m;
		}
		
		int i=0;
//		while(i<=arr.length)
//		{
//			
//		}
		for(i=0;i<arr.length;i++)
		{

			int[] arr2=new int[n];

			for(int j=0;j<arr.length;j++)
			{	
				if(arr[i]>arr[j])
				{
					arr2[j]=arr[j];
				}
				
			}
			System.out.println("The element " +arr[i]+ " is Greater than:"+Arrays.toString(arr2)+" ");
			
		}
		
		in.close();
	}
}
