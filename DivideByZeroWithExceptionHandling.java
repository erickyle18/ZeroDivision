import java.util.InputMismatchException;
import java.util.Scanner;

public class DivideByZeroWithExceptionHandling {

	//demonstrates throwing an exception when a divide-by-zero occurs
	public static int quotient(int numerator, int denominator)
	throws ArithmeticException
	{
		return numerator / denominator;
	}
	
	public static void main(String[] args)
	{
		//create a new scanner object
		Scanner scanner = new Scanner(System.in);
		boolean continueLoop = true;
		
		do
		{
			try		//read two numbers and calculate the quotient
			{
				System.out.print("Please enter an integer numerator: ");
				int numerator = scanner.nextInt();
				System.out.print("Please enter an integer denominator: ");
				int denominator = scanner.nextInt();
				
				int result = quotient(numerator, denominator);
				System.out.printf("%nResult: %d / %d = %d%n", numerator, denominator, result);
				continueLoop = false;
			}
			catch(InputMismatchException inputMismatchException)
			{
				System.out.printf("%nException: %s%n", inputMismatchException);
				scanner.nextLine();
				System.out.printf("You must enter integers. Please try again.%n%n");
			}
			catch(ArithmeticException arithmeticException)
			{
				System.out.printf("%nException: %s%n", arithmeticException);
				System.out.printf("Zero is an invalid denominator. Please try again.%n%n");
			}	
		}while(continueLoop);
		
	}

}
