package Day51_LinkedList;

public class LengthMethod__LinkedList {
	public static class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
		}

		public static void display(Node head) {
			if (head == null)
				return;
			System.out.print(head.data + " ");
			display(head.next);
		}

		public static int length(Node head) {
			int count = 0;
			while (head != null) {
				count++;
				head = head.next;
			}
			return count;
		}

		public static void main(String[] args) {
			Node a = new Node(5);
			Node b = new Node(6);
			Node c = new Node(7);
			Node d = new Node(8);
			Node e = new Node(9);
			Node f = new Node(10);

			a.next = b;
			b.next = c;
			c.next = d;
			d.next = e;
			e.next = f;

			display(a);
			System.out.println();
			System.out.println("===========");
			System.out.println(length(a));

		}
	}
}
