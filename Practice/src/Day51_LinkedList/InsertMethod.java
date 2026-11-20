package Day51_LinkedList;

public class InsertMethod {
	public static class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
		}
	}

	public static class linkedlist {
		Node head = null;
		Node tail = null;

		void insertAtEnd(int val) {
			Node temp = new Node(val);
//			tail.next = temp;
//			tail = temp;
			if (head == null) {
				head = temp;
				tail = temp;
			} else {
				tail.next = temp;
				tail = temp;
			}
		}

		void insertAtBeginning(int val) {
			Node temp = new Node(val);
			if (head == null) { // empty list
//				head = temp;
//				tail = temp;
				head = tail = temp;
			} else { // non empty
				temp.next = head;
				head = temp;

			}
		}

		void display() {
			Node temp = head;
			while (temp != null) {
				System.out.print(temp.data + " ");
				temp = temp.next;
			}
			System.out.println();
		}

		int size() {
			Node temp = head;
			int count = 0;
			while (temp != null) {
				count++;
				temp = temp.next;
			}
			return count;
		}

		void insertAtIdx(int idx, int val) {
			Node t = new Node(val);
			Node temp = head;
			if (idx == size()) {
				insertAtEnd(val);
				return;
			}
			for (int i = 1; i <= idx - 1; i++) {
				temp = temp.next;
			}
			t.next = temp.next;
			temp.next = t;
		}
	}

	public static void main(String[] args) {
		linkedlist ll = new linkedlist();
		ll.insertAtEnd(4);
		ll.display(); // 4
		ll.insertAtEnd(5);
		ll.display(); // 4 5
		ll.insertAtEnd(6);
		ll.display(); // 4 5 6
		ll.insertAtBeginning(13);
		ll.display(); // 13 4 5 6
		ll.insertAtIdx(1, 99);
		ll.display(); // 13 99 4 5 6

		ll.insertAtIdx(0, 999);
		ll.display(); //Expected->999 13 99 4 5 6 && Actual->13 999 99 4 5 6 
		System.out.println("============");
		System.out.println("Size of LinkedList:" + " " + ll.size());
	}
}
