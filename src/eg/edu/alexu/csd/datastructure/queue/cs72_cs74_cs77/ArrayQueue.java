package eg.edu.alexu.csd.datastructure.queue.cs72_cs74_cs77;

public class ArrayQueue implements IArrayBased {
	private int n;
	private Object[] Q;

	public ArrayQueue(int n) {
		this.n = n;
		Q = new Object[this.n];
	}

	private int front = -1;
	private int rear = -1;
	private int size;

	public int size() {
		return size;
	}

	public boolean isEmpty() {
		return (size == 0);
	}

	private boolean isFull() {
		return (front == rear && front != -1 || front == -1 && rear == n - 1);
	}

	public void enqueue(Object item) {
		if (isFull()) {
			System.out.println("Queue is full!");
			return;
		} else {
			rear = (rear + 1) % n;
			Q[rear] = item;
			size++;
		}
		return;
	}

	public Object dequeue() {
		if (isEmpty()) {
			System.out.println("Queue is empty!");
			return null;
		} else {
			front = (front + 1) % n;
			Object tmp = Q[front];
			if (front == rear) {
				front = -1;
				rear = -1;
			}
			size--;
			return tmp;
		}
	}

}
