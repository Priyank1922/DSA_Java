package Day51_LinkedList;

public class Display_LinkedList_ReverseOrder {

	public static void display(Node head) {
		if (head == null)
			return;
		System.out.print(head.data + " ");
		display(head.next);
	}

	public static void displayReverse(Node head) {
		if (head == null)
			return;
		displayReverse(head.next);
		System.out.print(head.data + " ");
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

		System.out.println("Linked list in correct order");
		display(a);
		System.out.println();
		System.out.println("In reverseOrder") ;
		displayReverse(a);

	}
}
