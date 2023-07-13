package Arrays;
import java.util.*;
public class reverseArrbySwapping {
	public static void main(String[] args) {
		int n;
		Scanner in=new Scanner(System.in);
		System.out.print("Enter the size of the array:");
		n=in.nextInt();
		int[] arr=new int[n];
		System.out.println("Enter the elements of array:-");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=in.nextInt();
		}
		System.out.println("The elements of array:-"+Arrays.toString(arr));
		int start=0;
		int end=arr.length-1;
		while(start<end)
		{
			swap(arr,start,end);
			start++;
			end--;
		}
		System.out.print("The elements of array after swaping:-"+Arrays.toString(arr));
		in.close();
 	}
	/*public static void swap(int num1,int num2)
	{
		int temp=num1;
		num1=num2;
		num2=temp;
	}*/
	public static void swap(int[] arr,int start,int end)
	{
		int temp=arr[start];
		arr[start]=arr[end];
		arr[end]=temp;
	}
}
