import java.util.Scanner;
public class Calculator{	
	public static void main(String[] args) { 
	System.out.println("Enter two number. If you want exit - a");
	double num1 = readNumber();
	double num2 = readNumber();
	char operation = readOperation();
	double result;
	    if (operation =='*'){
	    	result = num1 * num2;
	    	System.out.println(result);
	    }
	    if (operation =='/'){
	    	if (num2 == 0) {
	    		System.out.println("Error. Delitel can not be 0");
	    	}
	    	else {
	    	result = num1 / num2;
	    	System.out.println(result);
	    	}	
	    }
	    if (operation =='^'){
	    	result = Math.pow(num1,num2);
	    	System.out.println(result);
	    }
	    if (operation =='+'){
	    	result = num1 + num2;
	    	System.out.println(result);
	    }
	    if (operation =='-'){
	    	result = num1 - num2;
	    	System.out.println(result);
	    }
	    return readNumber();
	}
    /*}
    public static double safeNumber(){
    	double a = Calc.result;
    }*/

	public static char readOperation(){
		System.out.println("Enter operation");
		Scanner ch = new Scanner(System.in);
		char operation = ch.next().charAt(0);
		if ((operation == '*') || ( operation == '/') || (operation == '^') || ( operation == '+') || (operation == '-')){
			return operation;
		}
		else{
			System.out.println("Error. Please enter correct operation");
			return readOperation();
		}
	}
	public static double readNumber(){
		String input = "";
		Scanner sc = new Scanner(System.in);
		boolean incorrectNum = true;
		while ( incorrectNum ){
		    input = sc.nextLine();
			if (isDouble(input)){
				incorrectNum = false;
		    }
		    else 
		    	System.out.println("Error. Enter numbers");
		}
		return Double.parseDouble(input);
    }
	public static boolean isDouble(String input){
		char chr = 0;
		for(int i = 0; i < input.length(); i++){
			chr = input.charAt(i);
			if ((chr == '-') && ( i == 0) && ( chr == 'a')){
			}
			if (chr == 'a'){
				System.exit(0);
			}
			if (Character.isDigit(chr)){
			}
			else if((chr == '.')   && (( i == 0) || ( i == input.length() ))){
			return false;
			}
		}
		return true;
    }
}

 