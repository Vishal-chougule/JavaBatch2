package linkedlist;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Random;
import java.util.Scanner;

public class ShuffleElements {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		LinkedList<Integer> linkedList = new LinkedList<>();
		System.out.println("Enter how number of element you want to insert");
		int numberOfElements = scanner.nextInt();
		for (int i = 0; i < numberOfElements; i++) {
			System.out.println("Enter the element to list");
			int number = scanner.nextInt();
			linkedList.add(number);
		}
		System.out.println("The list before shuffle : " + linkedList);
		Object[] array = linkedList.toArray();
		arrayShuffle(array);
		listDataAdder(array, linkedList);
		System.out.println("The list after shuffle  : " + linkedList.toString());
		System.out.println();
		scanner.close();
	}

	private static void listDataAdder(Object[] array, LinkedList<Integer> linkedList) {
		ListIterator<Integer> List = linkedList.listIterator();
		for (Object e : array) {
			List.next();
			List.set((Integer) e);
		}
	}

	private static void arrayShuffle(Object[] array) {
		Random random = new Random();
		for (int i = 0; i < array.length - 1; i++) {
			int index = random.nextInt(i + 1);
			Object g = array[index];
			array[index] = array[i];
			array[i] = g;
		}
	}
}
