package p1;

public class RemoveDuplicateElementsInArray 
{
	public static void main(String[] args) 
	{
		int[] arr = {1,2,3,1,2,4,5,5};
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					arr[j]=-1;
				}
			}
		}
		System.out.println("After removing duplicate elements: ");
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i] != -1)
			{
				System.out.println(arr[i]);
			}
		}

	}

}
