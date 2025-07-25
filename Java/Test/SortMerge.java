import java.util.*;
class  SortMerge
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size of 1st Array : ");
		int size1 = sc.nextInt();
		int[] arr = new int[size1];
		System.out.println("Give "+size1+" Numbers");
		for (int i = 0; i<size1; i++)
		{
			arr[i] = sc.nextInt();
		}

		System.out.println("Enter the Size of 2nd Array : ");
		int size2 = sc.nextInt();
		int[] arr1 = new int[size2];
		System.out.println("Give "+size2+" Numbers");
		for (int i = 0; i<size2; i++)
		{
			arr1[i] = sc.nextInt();
		}
		int[] res = new int[size1+size2];

		int i = 0;
		int j = 0;
		int k = 0;

		while (i<arr.length && j<arr1.length)
		{
			if (arr[i]<=arr1[j])
			{
				res[k++]=arr[i];
				i++;
			}
			else
			{
				res[k++]=arr1[j];
				j++;
			}
		}
		while (i<arr.length)
		{
			res[k++]=arr[i];
			i++;
		}
		while (j<arr1.length)
		{
			res[k++] = arr1[j];
			j++;
		}
		System.out.println("sorted");
		for (int i=0; i<(size1+size2); i++)	//reuse of the i declaration;
		{
			System.out.print(res[i]+" ");
		}
	}
}
