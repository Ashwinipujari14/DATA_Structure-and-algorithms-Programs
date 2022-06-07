import java.util.Scanner;

public class Binary {

	int arr[];
	public Binary(int size)
	{
		arr = new int [size];
	}
	public void accept()
	{
		int i;
		Scanner sc = new Scanner(System.in);
		for(i=0;i<arr.length-1;i++)
		{
			System.out.println("Enter number");
			arr[i] = sc .nextInt();
			
		}
	}//end of accept_array
	
	public int bin_search(int key)
	{
		int low =0;
		int high = arr.length-1;
		int mid = (low +high/2);
		while(arr[mid]!=key&& (low<=high))
		{
			if(key<arr[mid])
			{
				high = mid -1;
			}
			else
			{
				low = mid + 1;
			}
			mid = (low+high)/2;
		}
	
		if(arr[mid]==key)
		{
			return mid+1;
		}
		else
			return -1;
	}
	
}
