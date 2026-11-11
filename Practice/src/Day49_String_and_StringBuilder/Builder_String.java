package Day49_String_and_StringBuilder;

public class Builder_String {
	public static void main(String[] args) {
//		StringBuilder str = new StringBuilder();
//	StringBuilder strr = new StringBuilder(100);
		StringBuilder str = new StringBuilder("Hello");
		System.out.println(str);
		str.setCharAt(0, 'm');
		System.out.println(str);

		// append
		str.append("world");
		str.append(10);
		System.out.println(str);

		// insert(idx , ch)
		str.insert(5, ' ');
		System.out.println(str);

		// delete(idx ,ch)
		str.deleteCharAt(5);
		System.out.println(str);

		// reverse
		StringBuilder st = new StringBuilder("Prestige");
		st.reverse();
		System.out.println(st);
		st.reverse();

		// Delete(i,j)
		st.delete(2, 4);
		System.out.println(st);

	}
}
