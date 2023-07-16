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

		int[] product=new int[n];
		for(int i=0;i<arr.length;i++)
		{
			int m=0;
			int mul=1;
			while(m<n)
			{
				mul=(mul*arr[m]);
				m++;
			}
			product[i]=mul/arr[i];
		}
		System.out.println(Arrays.toString(product));
		in.close();
	}
}
