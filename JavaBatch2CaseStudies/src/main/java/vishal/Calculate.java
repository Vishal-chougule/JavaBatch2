package calculator.Interface;

import java.util.InputMismatchException;
import java.util.Scanner;
public class Calculate {
	public static void main(String[] args) {
		boolean flag = true;
		while (flag) {
			try {
				Scanner scanner = new Scanner(System.in);
				System.out.println("Enter first number");
				int firstNumber = scanner.nextInt();
				System.out.println("Enter second number");
				int secondNumber = scanner.nextInt();
				scanner.nextLine();
				System.out.println("Enter operator +, -, *, /, %, mod");
				String operator = scanner.nextLine();
				if (operator.equals("+")) {
					Addition add = new Addition();
					add.calculate(firstNumber, secondNumber);
				} else if (operator.equals("-")) {
					Substraction sub = new Substraction();
					sub.calculate(firstNumber, secondNumber);
				} else if (operator.equals("*")) {
					Multiplication multi = new Multiplication();
					multi.calculate(firstNumber, secondNumber);
				} else if (operator.equals("/")) {
					Division div = new Division();
					div.calculate(firstNumber, secondNumber);
				} else if (operator.equals("mod")) {
					Modulo mod = new Modulo();
					mod.calculate(firstNumber, secondNumber);
				} else if (operator.equals("%")) {
					Percentage percent = new Percentage();
					percent.calculate(firstNumber, secondNumber);
				} else {
					System.out.println("Somthing went wrong try again...");
				}
				
			} catch (InputMismatchException ex) {
				System.out.println("Invalid input. Insert only Integer values.");
			} catch (ArithmeticException ex) {
				System.out.println("Airthmetic Exception Occured. Number Cannot be divided by zero.");
			} catch(Exception e) {
				System.out.println("Something went wrong..!");
			}
		}
	}
}


