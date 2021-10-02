import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		ArrayList v = new ArrayList();
		v.add("this");
		v.add("is");
		v.add("a");
		v.add("string");
		v.add("array");

		for (int i = 0; i < v.size(); i++) {

			System.out.print((String) v.get(i) + " ");
		}

	}
}
