import java.util.Arrays;
import java.util.Scanner;

public class Console {
	boolean exit = false;
	int[] array = new int[4];
	Scanner sc = new Scanner(System.in);
	int i = 0;
	int choose;

	public static void main(String[] args) {
		Console console = new Console();
		console.runConsole();
		console.getInput();
	}

	public void getInput() {
		// choose = sc.nextInt();
		while (i < array.length) {

			array[i] = sc.nextInt();
			i++;
		}

		System.out.println(Arrays.toString(array));
		// System.out.println(array[0]); just to check if first element has adequate
		// value
		System.out.println("\nNow that you have selected your 4-element array values, choose what to do with them");
		printOptions();
		choose = sc.nextInt();
		while (choose < 1 || choose > 4) {
			System.out.println("Please choose adequate option");
			choose = sc.nextInt();
		}
		// return;
		if (choose == 1) {
			maxValue();
		}
		if (choose == 2) {
			minValue();
		}
		if (choose == 3) {
			avgValue();
		}
	}

	private void maxValue() {
		int max = array[0];
		for (int i = 0; i < array.length; i++) {
			if (max < array[i]) {
				max = array[i];
			}
		}
		System.out.print("Calculating maximum element from an array ");
		System.out.print(Arrays.toString(array) + "...");
		System.out.println("\nMaximum value is " + max);

	}

	private void minValue() {
		int min = array[0];
		for (int i = 0; i < array.length; i++) {
			if (min > array[i]) {
				min = array[i];
			}
		}
		System.out.print("Calculating minimum element from an array ");
		System.out.print(Arrays.toString(array) + "...");
		System.out.println("\nMinimum value is " + min);

	}

	private void avgValue() {
		int avg = 0;
		for (int i = 0; i < array.length; i++) {

		}
	}

	private void runConsole() {
		printHeader();
		printElements();
	}

	private void printHeader() {
		System.out.println("_______");
		System.out.println("\nWelcome");
		System.out.println("_______");
	}

	private void printElements() {
		System.out.println("\nPlease enter your 4-element array below: ");
	}

	private void printOptions() {
		System.out.println("\n1) Find Maximum Value");
		System.out.println("2) Find Minimum Value");
		System.out.println("3) Find Average Value");
		System.out.println("4) Find Sum of Values");

	}
}
