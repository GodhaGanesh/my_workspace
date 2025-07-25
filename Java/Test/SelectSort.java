//import java.util.*; missing 
class SelectSort 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size of array : ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter "+size+" Elements ");
		for (int i = 0; i<size; i++)
		{
			arr[i] = sc.nextInt();
		}
		for (int i= 0;i<size ;i++ )
		{
			for (int j = i+1; j<size; j++)
			{
				if (arr[i]>arr[j])
				{
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println("!!Sorted!!");
		System.out.println("After sorting");

		for (int i = 0; i<size;i++ )
		{
			System.out.print(arr[i]+" ");
		}
	}
}
