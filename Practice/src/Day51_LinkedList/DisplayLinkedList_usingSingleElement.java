package Day51_LinkedList;

public class DisplayLinkedList_usingSingleElement {

	public static class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
		}
	}

	public static void main(String[] args) {
		Node a = new Node(5);
		Node b = new Node(2);
		Node c = new Node(4);
		Node d = new Node(8);

		a.next = b;
		b.next = c;
		c.next = d;

		System.out.println(a.data);
		System.out.println(a.next.data);
		System.out.println(a.next.next.data);
		System.out.println(a.next.next.next.data);

	}
}
