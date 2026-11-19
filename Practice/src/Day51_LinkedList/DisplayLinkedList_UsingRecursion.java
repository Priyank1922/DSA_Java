package Day51_LinkedList;

public class DisplayLinkedList_UsingRecursion {

	public static void display(Node head) {
		if (head == null)
			return;
		System.out.print(head.data + " ");
		display(head.next);
	}

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
		Node e = new Node(10);

		a.next = b;
		b.next = c;
		c.next = d;
		d.next = e;

		display(a);

	}
}
