import java.util.Arrays;
import java.util.Scanner;

public class Menu {
	boolean exit = false;
	int[] array = new int[5];
	Scanner sc = new Scanner(System.in);
	int i = 0;

	public static void main(String[] args) {
		Menu menu = new Menu();
		menu.runMenu();
	}

	public void runMenu() {
		printHeader();
		printMenu();
		int choice = getInput();
		performAction(choice);

	}

	private void printMenu() {
		System.out.println("\n1) Please enter your array length and elements ");
		System.out.println("2) Calculate Minumum element in array ");
		System.out.println("3) Calculate Maximum element in array ");
		System.out.println("4) Calculate Sum of elements in array ");
		System.out.println("5) Calculate Average value from elements in array ");
		System.out.println("6) Exit ");
	}

	private void printHeader() {
		System.out.println("----------------");
		System.out.println(" Array app menu ");
		System.out.println("----------------");
	}

	private int getInput() {

		int choice = -1;
		while (choice < 1 || choice > 6) {

			try {
				System.out.println("\nEnter your choice ");
				choice = Integer.parseInt(sc.nextLine());

				if (choice < 1 || choice > 6) {
					System.out.println("Invalid selection");
				}
				if (choice == 6) {
					System.out.println("Are you sure you want to exit? press 6 if yes");
					choice = Integer.parseInt(sc.nextLine());
				}

			} catch (NumberFormatException e) {
				System.out.println("\nPlease type a number within options");

			}

		}

		return choice;

	}

	private void performAction(int choice) {

		switch (choice) {

		case 1:
			int elements;

			System.out.println("Enter the number of elements ");
			elements = sc.nextInt();

			System.out.println("Enter the elements of the array: ");

			// for (int i = 0; i < array.length; i++) { note: this always asks for number of
			// elements defined in class Menu
			while (i < elements) {
				array[i] = sc.nextInt();
				i++;

			}
			System.out.println(Arrays.toString(array));

			break;

		case 2:

			System.out.println("is this even initialized?");
			int minValue = array[i];
			while (i < array.length) {
				if (array[i] < minValue) {
					minValue = array[i];
				}
			}
			System.out.println("Min value is " + minValue);

			break;
		case 3:
			int maxValue = array[i];
			while (i < array.length) {
				if (array[i] > maxValue) {
					maxValue = array[i];
				}
			}
			System.out.println("Max value is " + maxValue);
			break;
		case 4:

			break;
		case 5:

			break;
		case 6:
			exit = true;
			System.out.print("Exiting...");

			break;

		}
	}
}
