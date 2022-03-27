import java.util.Scanner; 

public class CompareApp {
	public static void main( String[] args )
	{
		Scanner sc = new Scanner(System.in);
		int num1, num2; //assigning num1 and num2 as integers
		System.out.printf("Enter first number: ");
			num1 = sc.nextInt(); //input number1
		System.out.printf("Enter second number: ");
			num2 = sc.nextInt(); //input number2
		if (num1 == num2) { //if num1 equals num2, print nums are equal
			System.out.println("Numbers ARE equal");
		} else
				System.out.println("Numbers ARE NOT equal");
		if (num1 != num2)
		{
			System.out.println("Numbers ARE NOT equal");
		
		if (num1 > num2) //if num1 bigger than num2
		{
			System.out.println("FIRST number BIGGER");
			
		} else if (num2 > num1) //if num2 bigger than num1 print below
		{
			System.out.println("SECOND number BIGGER");
		}
			
		System.out.println("END OF PROGRAM"); //print end of program
}
	}
}

	