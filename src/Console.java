import java.util.Arrays;
import java.util.Scanner;

public class Console {
	boolean exit = false;
	int[] array = new int[4];
	Scanner sc = new Scanner(System.in);
	int i = 0;
	int choose;
	int choice;

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
			choice = sc.nextInt();
			{
				if (choice != 0) {
					getInput();

				} else {
					exit = true;
					System.out.println("Exiting...");
					System.out.println("Thank You for trying out my first array application! ");
					System.exit(0);

				}

				if (choose == 2) {
					minValue();
					choice = sc.nextInt();
					{
						if (choice != 0) {
							getInput();

						} else {
							exit = true;
							System.out.println("Exiting...");
							System.out.println("Thank You for trying out my first array application! ");
							System.exit(0);
						}
						if (choose == 3) {
							avgValue();
							choice = sc.nextInt();
							{
								if (choice != 0) {
									getInput();

								} else {
									exit = true;
									System.out.println("Exiting...");
									System.out.println("Thank You for trying out my first array application! ");
									System.exit(0);
								}
							}
							if (choose == 4) {
								sumValue();
								choice = sc.nextInt();
								{
									if (choice != 0) {
										getInput();

									} else {
										exit = true;
										System.out.println("Exiting...");
										System.out.println("Thank You for trying out my first array application! ");
										System.exit(0);
									}
								}
							}
						}
					}
				}
			}
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
		System.out
				.println("\nContinue investigating the array ? Press any number continue investigating and 0 to exit ");

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
		System.out
				.println("\nContinue investigating the array ? Press any number continue investigating and 0 to exit ");
	}

	private void avgValue() {
		int avg = 0;
		for (int i : array) {
			avg += i;

		}
		avg = avg / array.length;

		System.out.print("Calculating average value from an array ");
		System.out.print(Arrays.toString(array) + "...");
		System.out.println("\nAverage value is " + avg);
		System.out
				.println("\nContinue investigating the array ? Press any number continue investigating and 0 to exit ");
	}

	private void sumValue() {
		int sum = 0;
		for (int i : array) {
			sum += i;

		}

		System.out.print("Calculating sum of values from an array ");
		System.out.print(Arrays.toString(array) + "...");
		System.out.println("\nThe sum of values is " + sum);
		System.out
				.println("\nContinue investigating the array ? Press any number continue investigating and 0 to exit ");
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
