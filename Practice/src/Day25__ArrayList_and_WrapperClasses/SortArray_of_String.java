package Day25__ArrayList_and_WrapperClasses;

import java.util.ArrayList;
import java.util.Collections;

public class SortArray_of_String {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("Welcome");
		list.add("To");
		list.add("Aabc");
		list.add("Qqwe");
		System.out.println("Original list:::" + list);
		Collections.sort(list);
		System.out.println("Sorted list:::" + list);
		Collections.sort(list, Collections.reverseOrder());
		System.out.println("Descending order sort:::" + list);
	}
}
