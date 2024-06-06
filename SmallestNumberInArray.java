package p1;

public class SmallestNumberInArray {

	public static void main(String[] args) 
	{
		int arr[] = {10,20,30,40,50};
		int min=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(min>arr[i])
			{
				min=arr[i];
			}
		}
		System.out.println("Minimum value in array:"+min);

	}

}
