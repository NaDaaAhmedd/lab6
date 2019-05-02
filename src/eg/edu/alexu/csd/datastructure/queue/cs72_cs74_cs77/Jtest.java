package eg.edu.alexu.csd.datastructure.queue.cs72_cs74_cs77;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Scanner;

import org.junit.jupiter.api.Test;

class Jtest {

	@Test
	void test() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayQueue q = new ArrayQueue(n);

		q.enqueue(5);
		q.enqueue(10);
		q.enqueue(15);
		q.enqueue(20);

		Object s = q.dequeue();
		assertEquals(s, 5);

		Object s1 = q.dequeue();
		assertEquals(s1, 10);

		boolean b = q.isEmpty();
		assertEquals(false, b);

		Object s2 = q.dequeue();
		assertEquals(s2, 15);

		int size = q.size();
		assertEquals(size, 1);

		Object s3 = q.dequeue();
		assertEquals(s3, 20);

		boolean b1 = q.isEmpty();
		assertEquals(true, b1);

		sc.close();

		LinkedListQueue Q = new LinkedListQueue();

		Q.enqueue(100);
		Q.enqueue(200);
		Q.enqueue(300);
		Q.enqueue(400);
		Q.enqueue(500);

		Object z = Q.dequeue();
		assertEquals(z, 100);

		Object z1 = Q.dequeue();
		assertEquals(z1, 200);

		boolean B = Q.isEmpty();
		assertEquals(false, B);

		Object z2 = Q.dequeue();
		assertEquals(z2, 300);

		int si = Q.size();
		assertEquals(si, 2);

		Object z3 = Q.dequeue();
		assertEquals(z3, 400);

		Object z4 = Q.dequeue();
		assertEquals(z4, 500);

		boolean B1 = Q.isEmpty();
		assertEquals(true, B1);

		Q.enqueue(20);
		int si2 = Q.size();
		assertEquals(si2, 1);

	}

}
