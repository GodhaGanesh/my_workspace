import java.util.Scanner;
class SimpleCalculator
{
	public static void main(String [] args)
	{
		Scanner sc= new Scanner(System.in);
		
		System.out.println("_______________________________________________________________");
		System.out.println("|-------------------Simple Calculator-------------------------|");
		System.out.println("|_____________________________________________________________|");
		  System.out.print("|    Enter The First Number :-  ");
		int number1 = sc.nextInt();
			
		System.out.println("|                                                             |");
		  System.out.print("|    Enter The Second Number :- ");
		int number2 = sc.nextInt();
		
		System.out.println("|                                                             |");
		  System.out.print("|    Enter The operator :-  ");
		System.out.println("|                                                             |");
		System.out.println("|_____________________________________________________________|");

		char operator = sc.next().charAt(0);

		if(operator=='+')
		{
		System.out.println("|----------"+(number1+number2)+" is the result of Sum---------|");
		}
		else if(operator=='-')
		{
		System.out.println("|----------"+(number1-number2)+" is the result of difference--|");
		}
		else if(operator=='*')
		{
			System.out.println("|----------"+(number1*number2)+" is the result of multiplication------|");
		}
		else if(operator=='/')
		{
			System.out.println("|----------"+(number1/number2)+" is the quotient of division----------|");
		}
		else if(operator=='%')
		{
			System.out.println("|----------"+(number1%number2)+" is the remainder of division---------|");
		}
		else
		{
		System.out.println("|-----------------invalid Operator Try Again !!!!------------|");
		}
		System.out.println("|____________________________________________________________|");
		System.out.println("|                   Thank You !!!!!                          |");
		System.out.println("|____________________________________________________________|");

	}
}