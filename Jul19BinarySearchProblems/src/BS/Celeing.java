package BS;

import java.util.Scanner;

public class Celeing {
	public static void main(String[ ] args)
	{
		Scanner in=new Scanner(System.in);
		System.out.print("Enter the size of the array:");
		int n=in.nextInt();
		System.out.print("Enter the array in Aescending order:");
		int[] arr=new int[n];
		for(int i=0;i<arr.length;i++)
		{
			int m=in.nextInt();
			arr[i]=m;
		}
		System.out.print("Enter the target to find:");
		int target=in.nextInt();
		int start=0;
		int end=arr.length-1;
		while(start<=end)
		{
			int mid=start+(end-start)/2;
			if(arr[mid]==target)
			{
				System.out.println(mid);
				break;
			}
			else if(arr[mid]<target)
			{
				start=mid+1;
			}
			else if(arr[mid]>target){
				end=mid-1;
			}

		}
		System.out.println(arr[start]);
		in.close();
	}

}
