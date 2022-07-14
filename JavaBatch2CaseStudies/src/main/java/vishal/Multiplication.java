package calculator.Interface;

public class Multiplication implements Calculator {

	public void calculate(int firstNumber, int secondNumber) {
		int answer = firstNumber * secondNumber;
		System.out.println("Answer of " + firstNumber + " * " + secondNumber + " = " + answer);
	}
}
