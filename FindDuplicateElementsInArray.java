package p1;

public class FindDuplicateElementsInArray {

	public static void main(String[] args) 
	{
		int[] arr = {1,2,2,3,3,5,4,6,5,8,7,1};
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					System.out.println("Duplicate Elements:"+arr[i]);
				}
			}
		}

	}

}
