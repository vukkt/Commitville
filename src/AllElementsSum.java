
public class AllElementsSum {

	public static void main(String[] args) {
		int[] array_1 = { 7, 19, -3, 0, 177 };
		int[] array_2 = { 4, 34, 2, 178, 180 };
		int[] array_3 = new int[array_1.length];

		for (int element = 0; element < array_1.length; element++) {
			array_3[element] = array_1[element] + array_2[element];
			System.out.println(array_3[element]);
		}

	}

}
