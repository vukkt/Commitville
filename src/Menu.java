import java.util.Scanner;

public class Menu {
	boolean exit = false;
	int[] array = new int[10];

	public static void main(String[] args) {
		Menu menu = new Menu();
		menu.runMenu();
	}

	public void runMenu() {
		printHeader();
		while (!exit) {
			printMenu();
			int choice = getInput();
			performAction(choice);
		}
	}

	private void printMenu() {
		System.out.println("\n1) Please enter your array length and elements ");
		System.out.println("2) Calculate Minumum element in array ");
		System.out.println("3) Calculate Maximum element in array ");
		System.out.println("4) Calculate Sum of elements in array ");
		System.out.println("5) Calculate Average value from elements in array ");
		System.out.println("6) Calculate Average value from elements in array ");
	}

	private void printHeader() {
		System.out.println("----------------");
		System.out.println(" Array app menu ");
		System.out.println("---------------- ");
	}

	private int getInput() {

		Scanner kb = new Scanner(System.in);
		int choice = -1;
		while (choice < 1 || choice > 5) {
			try {
				System.out.println("\nEnter your choice ");
				choice = Integer.parseInt(kb.nextLine());
			} catch (NumberFormatException e) {
				System.out.println("Invalid selection");
			}
			if (choice < 1 || choice > 5) {
				System.out.println("Invalid selection");
			}
		}
		return choice;
	}

	private void performAction(int choice) {

		int elements;

		Scanner sc = new Scanner(System.in);
		int i = 0;
		
		System.out.println("Enter the number of elements ");
		elements = sc.nextInt();

		System.out.println("Enter the elements of the array: ");
		while (i < elements) { // for (int i = 0; i < elements; i++) { this is for loop equivalent to used
		i++;
		array[i] = sc.nextInt();
		
		switch (choice) {

		case 1:

			int minValue = array[i];
			for (int i = 0; i < array.length; i++) {
				if (array[i] > minValue) {
					minValue = array[i];
				}
			}
			System.out.println("Min value is " + minValue);
			break;
		case 2:
			int maxValue = array[i];
			for (int i = 0; i < array.length; i++) {
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
			break;
		}
	}

}