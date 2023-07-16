package linearSearch;
import java.util.*;
public class searcginRange {
	public static void main(String[] args)
	{

		Scanner in=new Scanner(System.in);
		System.out.println("Enter the size of the Array:");
		int n=in.nextInt();
		int[] arr=new int[n];
		System.out.println("Enter the elements of the Array:");
		for(int i=0;i<arr.length;i++)
		{
			int ele=in.nextInt();
			arr[i]=ele;
		}
		System.out.println("Enter the elements to be found from the Array:");
		int target=in.nextInt();
		
		System.out.println("Enter the start range of the Array:");
		int start=in.nextInt();
		
		System.out.println("Enter the end range of the Array:");
		int end=in.nextInt();
				
		
		System.out.println("The elements of the Array is:"+Arrays.toString(arr));
		System.out.println("The target element is:"+target);
		System.out.println("The start index is:"+start);
		System.out.println("The end index is:"+end);
		
		int ans=search(arr,target,start,end);
		System.out.println(ans);
	
	}
	static int search(int[] arr,int target,int start,int end)
	{
		if(arr.length==0)
		{
			return -1;
		}
		for(int i=start;i<=end;i++)
		{
			if(target == arr[i])
			{
				return i;
				
			}
			
		}
		return -1;
	}
}
