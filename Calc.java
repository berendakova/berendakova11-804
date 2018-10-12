import java.util.Scanner;
public class Calc{
	public static void main(String[] args) {
		System.out.println("Enter operation: * ; / ; + ; - ; ^ ");
		Scanner ch = new Scanner(System.in);
		char operation = ch.nextChar();
		if ((operation == '*') || ( operation == '/') || (operation == '^') || ( operation == '+') || (operation == '-')) {
			System.out.println("Enter two numbers");
			Scanner in = new Scanner(System.in);
			double num1 = in.nextInt();
			double num2 = in.nextInt();
			double result = 1;
		}
		else 
			System.out.println("Error. Uncorrect operation");
		if (operation = '*'){
			 result = num1 * num2;
		}
		if (operation = '/'){
			 result = num1 / num2;
		}
		if (operation = '^'){
			 result = 1;
			for (int i = 0 ; i <= num2; i++);{
				result = num1 * result;
			}
		}
		if (operation = '+'){
			result = num1 + num2;
		}
		if (operation = '-'){
			result = num1 - num2;
		}
            System.out.println(result);
	}

}