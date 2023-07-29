package insert;
import java.util.*;
public class insertionSort {
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<arr.length;i++) {
			int m=in.nextInt();
			arr[i]=m;
		}
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=i+1;j>0;j--)
			{
				if(arr[j]<arr[j-1])
				{
					swap(arr,j,j-1);
				}
			}
		}
		for(int i=0;i<arr.length;i++) {
			
			System.out.print(arr[i]);
		}
	}
	public static void swap(int[] arr,int j,int i)
	{
		int temp=arr[j];
		arr[j]=arr[i];
		arr[i]=temp;
	}
	
}
