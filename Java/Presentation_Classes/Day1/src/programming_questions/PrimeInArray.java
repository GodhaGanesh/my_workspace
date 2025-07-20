package programming_questions;

public class PrimeInArray {
	public static void main(String[] args) {
		int[] numbers = {2,3,89,48,39,27,17,28};
		
		System.out.print("Prime Numbers in Given Array :- ");
		
		for(int i = 0; i<numbers.length;i++) {
			if(isPrime(numbers[i]))
				System.out.print(numbers[i]+", ");
		}
	}
	
	public static boolean isPrime(int num) {
		for(int i = 2;i<num/2;i++)
			if(num%i==0)
				return false;
		return true;
	}
}
