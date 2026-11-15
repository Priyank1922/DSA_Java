package Day51_LinkedList;

public class BasicLL {
	public static class Node {
		int data; // value
		Node next; // address of next node

		Node(int data) {
			this.data = data;
		}
	}

	public static void main(String args[]) {
		Node ab = new Node(333);
		System.out.println(ab.data);
		System.out.println(ab);
		System.out.println(ab.next);

		System.out.println("--------------------");
		// create linked list
		Node a = new Node(5);
		System.out.println(a.next); // null
		Node b = new Node(3);
		Node c = new Node(9);
		Node d = new Node(8);
		Node e = new Node(16);
		// 5->3->9->8->16
		a.next = b;
		System.out.println(a); // $Node@7291c18f
		System.out.println(a.next); // $Node@7291c18f
		System.out.println(b); // $Node@7291c18f
		System.out.println(c); // $Node@7cc355be

		System.out.println(b.data);
		System.out.println(a.data);
		System.out.println(a.next.data);
		
		b.next = c; //5->3->9  8  16
		c.next = d; //5->3->9->8  16
		d.next  = e;  //5->3->9->8->16
	}
}
