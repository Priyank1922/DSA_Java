package Day25__ArrayList_and_WrapperClasses;

import java.util.ArrayList;
import java.util.Collections;

public class SortArrayList {

	public static void main(String[] args) {
		ArrayList<Integer> l1 = new ArrayList<>();
		l1.add(0);
		l1.add(10);
		l1.add(3);
		l1.add(5);
		l1.add(22);
		l1.add(10);
		System.out.println("Original list:::" + l1);

		Collections.sort(l1);
		System.out.println("Acending order sorted list:::" + l1);

		Collections.sort(l1, Collections.reverseOrder());
		System.out.println("Descending order sorted list:::" + l1);
	}
}
