package Day25__ArrayList_and_WrapperClasses;

import java.util.ArrayList;

public class ArrayList_Work {
	public static void main(String args[]) {

		ArrayList<Integer> l1 = new ArrayList<>();
		ArrayList<Boolean> l2 = new ArrayList<>();
		ArrayList<Float> l3 = new ArrayList<>();

		// add new element
		l1.add(5);
		l1.add(6);
		l1.add(7);
		l1.add(8);
		// get an element at index i
		System.out.println(l1.get(1));

		// print with for loop
		for (int i = 0; i < l1.size(); i++) {
			System.out.println(l1.get(i));
		}

		// print arraylist directly
		System.out.println(l1);

		// adding element at some index i
		l1.add(1, 100);
		System.out.println(l1);

		// modify element at index i
		l1.set(1, 10);
		System.out.println(l1);

		// removing an element at index i
		l1.remove(1);
		System.out.println(l1);

		// remove an element e without knowing index
		l1.remove(Integer.valueOf(7));
		System.out.println(l1);
		l1.remove(Integer.valueOf(33));
		System.out.println(l1);

		// checking if an element exists
		boolean ans = l1.contains(Integer.valueOf(6));
		System.out.println(ans);

		ArrayList r = new ArrayList();
		r.add(2);
		r.add("adsds");
		r.add(true);
		r.add(24.23);
		System.out.println(r);
	}
}
