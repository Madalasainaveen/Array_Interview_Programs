package p1;

public class LargestNumberInArray {

	public static void main(String[] args)
	{
		int arr[] = {10,20,30,40,50};
		int max=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(max<arr[i])
			{
				max=arr[i];
			}
		}
		System.out.println("Maximum value in array:"+max);


	}

}
