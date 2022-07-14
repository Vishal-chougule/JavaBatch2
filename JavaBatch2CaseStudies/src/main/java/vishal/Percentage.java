package calculator.Interface;

public class Percentage implements Calculator {

	public void calculate(int firstNumber, int secondNumber) {
		int answer = secondNumber * 100 / firstNumber;
		System.out.println("Answer of " + firstNumber + " % " + secondNumber + " = " + answer);
	}
}
