
public class EvenElementsArraySum {

	public static void main(String[] args) {
		int sum = 0;
		int[] array = { 1, 20, 3, 48 };
		for (int element : array) {
			if (element % 2 == 0) {
				sum += element;
			}
		}
		System.out.println("The sum is " + sum);
	}
}