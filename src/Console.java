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
		choose = sc.nextInt();
		while (i < array.length) {

			array[i] = sc.nextInt();
			i++;
		}

		System.out.println(Arrays.toString(array));
		System.out.println(array[0]);
	}

	private void runConsole() {
		printHeader();
		printOptions();
	}

	private void printHeader() {
		System.out.println("_______");
		System.out.println("\nWelcome");
		System.out.println("_______");
	}

	private void printOptions() {
		System.out.println("\nPlease enter your 4-element array below: ");
	}

}
