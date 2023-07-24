package BS;
import java.util.*;
public class SmallestLetter {
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		char arr[]= {'a','e','g','j','k','n','s','t'};
		char target='t';
		int position=bs(arr,target);
		System.out.println("The position of next smallest element is: "+position);
		in.close();
	}
	static int bs(char[] arr,char target)
	{
		int start=0;
		int end=arr.length-1;
		while(start<end)
		{
			int mid=(start+end)/2;
			if(arr[mid]==target)
			{
				return mid+1;
			}
			else if(target>arr[mid])
			{
				start=mid+1;
			}
			else if(target>arr[mid])
			{
				end=mid-1;
			}
		}
		return 0;
		
		
	}
}
