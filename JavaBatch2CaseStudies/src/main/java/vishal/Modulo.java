package calculator.Interface;

public class Modulo implements Calculator {

	public void calculate(int firstNumber, int secondNumber) {
		int answer = firstNumber % secondNumber;
		System.out.println("Answer of " + firstNumber + " mod " + secondNumber + " = " + answer);

	}

}
