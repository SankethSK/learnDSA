package linearSearch;
import java.util.*;
public class linearSearchin2D {
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
		for(int i=0;i<n;i++)
		{
				System.out.print(Arrays.toString(arr[i]));
				System.out.println();		
		}
		System.out.print("Enter the numer to be searched:");
		int num=in.nextInt();

		int[] pos=new int[2];
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				if(arr[i][j]==num)
				{
					pos[0]=i;
					pos[1]=j;
				}
			}
		}	
		System.out.println("The position is:"+Arrays.toString(pos));
		in.close();
	}
}
