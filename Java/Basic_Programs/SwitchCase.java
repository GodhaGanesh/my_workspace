import java.util.Scanner;
class SwitchCase 
{
	public static void main(String[] args) 
	{
		/*int option = 7;

		switch (option)
		{
			case 1 : System.out.println("Case One");
			break;
			case 2 : System.out.println("Case Two");
			break;
			case 3 : System.out.println("Case Three");
			break;
			case 4 : System.out.println("Case Four");
			break;
			case 5 : System.out.println("Case Five");
			break;
			default : System.out.println("Enter Valid");
		}



		char choice = 'a';

		switch (choice)
		{
			case 'a' : System.out.println("Case a");
			break;
			case 'b' : System.out.println("Case b");
			break;
			case 'c' : System.out.println("Case c");
			break;
			case 'd' : System.out.println("Case d");
			break;
			case 'e' : System.out.println("Case e");
			break;
			default : System.out.println("Enter Valid");
		}


		String name = "Kannappa";

		switch (name)
		{
			case "Ganesh" : System.out.println("Junior Dev");
			break;
			case "Pavan" : System.out.println("Senior Dev");
			break;
			case "Surya" : System.out.println("CEO");
			break;
			case "Kannappa" : System.out.println("Manchu Anna");
			break;
			case "kattappa" : System.out.println("kattu Banisa");
			break;
			default : System.out.println("Enter Valid");
		}*/

	
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Your Grade :-  ");
		char grade = sc.next().charAt(0);

		
		switch(grade)
		{
			case 'A':case'a': String r = "Frist Rank";
			break;
			case 'B':case'b': String r = "Second Rank";
			break;
			case 'C':case'c': String r = "Frist Class";
			break;
			case 'D':case'd': String r = "Second Class";
			break;
			case 'E':case'e': String r = "Just Pass";
			break;
			case 'F':case'f': String r = "Failed in the Exam";
			break;
		}

		System.out.println("You Got "+r);
	}
}
