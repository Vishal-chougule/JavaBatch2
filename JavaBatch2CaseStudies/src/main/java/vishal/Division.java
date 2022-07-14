package calculator.Interface;

public class Division implements Calculator {

	public void calculate(int firstNumber, int secondNumber) {
		int answer = firstNumber / secondNumber;
		System.out.println("Answer of " + firstNumber + " / " + secondNumber + " = " + answer);
	}
}
