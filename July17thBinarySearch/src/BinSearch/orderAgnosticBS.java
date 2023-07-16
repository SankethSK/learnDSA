package BinSearch;

import java.util.Scanner;

public class orderAgnosticBS {
	public static void main(String[ ] args)
	{
		Scanner in=new Scanner(System.in);
		System.out.print("Enter the size of the array:");
		int n=in.nextInt();
		System.out.print("Enter the array in any sorted order:");
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
		boolean isAescending=arr[start]<arr[end];
		while(start<=end)
		{
			int mid=start+(end-start)/2;
			
			if(arr[mid]==target)
			{
				System.out.println(mid);
				break;
			}
			if(isAescending==true)
			{
				if(arr[mid]<target)
				{
					start=mid+1;
				}
				else if(arr[mid]>target){
					end=mid-1;
				}
				else {

					System.out.println(-1);	
				}

			}
			else {
				if(arr[mid]>target)
				{
					start=mid+1;
				}
				else if(arr[mid]<target){
					end=mid-1;
				}
				else {

					System.out.println(-1);	
				}				
			}
			
		}

		in.close();
	}

}
//
//1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20
//20 19 18 17 16 15 14 13 12 11 10 9 8 7 6 5 4 3 2 1
