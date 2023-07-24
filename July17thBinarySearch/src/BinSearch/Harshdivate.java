package BinSearch;
import java.util.*;
public class Harshdivate {
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		System.out.print("Enter the size of the array:");
		int n=in.nextInt();
		System.out.print("Enter the elements of array :");
		int[] arr=new int[n];
		for(int i=0;i<arr.length;i++)
		{
			int m=in.nextInt();
			arr[i]=m;
		}
		System.out.println(Arrays.toString(arr));
//		int sum=0;
		int product=1;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>0)
			{
				product=product*arr[i];
			}
			else
			{
				product=product/1;
			}
		}

		int[] newArr=new int[arr.length];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>0)
			{
//				product=product*arr[i];
				newArr[i]=product/arr[i];
			}
			else
			{
				newArr[i]=0;
			}
		}
		
		System.out.println(Arrays.toString(newArr));
		in.close();
	}
}