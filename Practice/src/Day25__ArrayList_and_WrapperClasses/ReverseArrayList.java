package Day25__ArrayList_and_WrapperClasses;

import java.util.ArrayList;
import java.util.Collections;

public class ReverseArrayList {
//	static void reverseList(ArrayList<Integer> list) {
//		int i = 0;
//		int j = list.size() - 1;
//		while (i < j) {
//			Integer temp = Integer.valueOf(list.get(i));
//			list.set(i, list.get(j));
//			list.set(j, temp);
//			i++;
//			j--;
//		}
//	}

	public static void main(String[] args) {
		ArrayList<Integer> l1 = new ArrayList<>();
		l1.add(0);
		l1.add(10);
		l1.add(3);
		l1.add(5);
		l1.add(22);
		l1.add(10);
		System.out.println("Original list:::" + l1);

//		reverseList(l1);
		Collections.reverse(l1);
		System.out.println("Reversed list:::" + l1);
	}
}
