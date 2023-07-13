package Arrays;
import java.util.*;
public class Array2D {
	public static void main(String[] args)
	{
		int n;
		int m;
		Scanner in=new Scanner(System.in);
		System.out.println();
		System.out.print("ENter the numer of rows:");
		n=in.nextInt();
		int[][] arr=new int[n][]; 
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter the size of inner array "+i +":-");
			m=in.nextInt();
			arr[i]=new int[m];
		}

		
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter the elememts of inner array "+i);
			for(int j=0;j<arr[i].length;j++)
			{
				arr[i][j]=in.nextInt();
			}
		}
		
	/*	for(int i=0;i<n;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.print(arr[i][j]);
			}
			System.out.println();
			3
		}
		[[I@6d78f375
		  [[I@6d78f375
		  [[I@6d78f375
		
		for(int i=0;i<n;i++)
			{
				System.out.print(arr.toString());
				System.out.println();
				
			}/*output
			
		[[I@6d78f375
		  [[I@6d78f375
		  [[I@6d78f375
			*/
		

			for(int i=0;i<n;i++)
			{
				System.out.print(Arrays.toString(arr[i]));
				System.out.println();
				
			}
		in.close();
		
	}
}
