package stack;

public class LinkedListStack<E> implements Stack<E> {
	private class Node<T> {
		T data;
		Node<T> next;

		Node(T data) {
			this.data = data;
		}

		public String toString() {
			if (next == null)
				return data.toString();
			return data.toString() + ", " + next.toString();
		}
	}

	Node<E> first;

	@Override
	public boolean isEmpty() {
		return (first == null);
	}

	@Override
	public E top() throws Underflow {
		if (isEmpty())
			throw new Underflow();
		return first.data;
	}

	@Override
	public LinkedListStack<E> push(E element) {
		Node<E> newNode = new Node<>(element);
		newNode.next = first;
		first = newNode;
		return this;
	}

	@Override
	public LinkedListStack<E> pop() throws Underflow {
		if (isEmpty())
			throw new Underflow();
		first = first.next;
		return this;
	}
	@Override
	public String toString() {
		if (first == null)
			return "";
		return first.toString();

	}
}
