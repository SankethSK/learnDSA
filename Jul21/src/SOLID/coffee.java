package SOLID;
//[2,2,2,3,4,4,4,5,5,6,6,6,6,6,7,8,8,8,9,9,9]
public class coffee{
	public static void main(String[] args)
	{
		int[] arr= {2,2,2,2,3,3,4,5,5,5,6,6,7,8,8,8,8,9,9,9,9};//2.3.6.8.9
		int n=arr.length;
		int count=1;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{count++;}
			}
			if(count%2==0)
			{
				System.out.print(arr[i]);
			}
		}
	}
}