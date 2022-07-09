
import java.util.*;

class Addtiton{
	public void addition(float a, float b) {
		System.out.println("Addition is : "+ (a+b));
	}
}

class Substraction extends Addtiton{
	public void substraction(float a, float b) {
		System.out.println("Substraction is : "+( a-b));
	}
}
class Multiplication extends Substraction{
	public void multiplication(float a, float b) {
		System.out.println("Multiplication is : "+ (a*b));
	}
}

class Division extends Multiplication{
	public void division(float a, float b) {
		System.out.println("Division is : "+ (float)(a/b));
	}
}

class Module extends Division{
	public void module(float a, float b) {
		System.out.println("Module is : "+ (a%b));
	}
}

class Percent extends Module{
	public void percent(float a, float b) {
		float percent = a * (b/100);
		System.out.println(a + " Percent "+b+" is : "+ percent);
	}
}

public class Calculator {
	public static void main(String[] args) {
		float a, b;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter first number: ");
		a = scan.nextFloat();
		System.out.println("Enter second number: ");
		b = scan.nextFloat();
		scan.nextLine();
		System.out.println("Enter operator [+, -, *, /, mod, %]: ");
		String operator = scan.nextLine();
		Percent percent = new Percent();
		if(operator.equals("+")) {
			percent.addition(a, b); 
		}else if(operator.equals("-")) {
			percent.substraction(a, b);
		}else if(operator.equals("*")) {
			percent.multiplication(a, b);
		}else if(operator.equals("/")) {
			percent.division(a, b); 
		}else if(operator.equals("mod")) {
			percent.module(a, b); 
		}else if(operator.equals("%")) {
			percent.percent(a, b);
		}else {
			System.out.println("Invalid Operator: ");
		}
		scan.close();
	}
}
