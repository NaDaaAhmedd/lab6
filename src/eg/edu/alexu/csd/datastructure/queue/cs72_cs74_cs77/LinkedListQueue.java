package eg.edu.alexu.csd.datastructure.queue.cs72_cs74_cs77;

public class LinkedListQueue implements ILinkedBased {
	private Node front;
	private int size;

	public int size() {
		return size;
	}

	public boolean isEmpty() {
		return (size == 0);
	}

	public void enqueue(Object item) {
		Node n = new Node();
		n.data = item;
		if (size == 0) {
			front = n;
		} else {

			Node i = front;
			while (i.next != null) {
				i = i.next;
			}
			i.next = n;
		}
		size++;
		return;
	}

	public Object dequeue() {
		if (isEmpty()) {
			System.out.println("Queue is empty!");
			return null;
		} else {
			Object tmp = front.data;
			if (front.next != null) {
				front = front.next;
			}
			size--;
			return tmp;
		}
	}

}

class Node {
	Object data;
	Node next;
}
