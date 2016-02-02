package com.ap;

public class LinkedListMain {

	static Node head;

	public static void main(String[] args) throws Exception {

		add(1);
		add(2);
		add(3);
		add(4);
		// printList();
		// removeNodeAt(0);
		// removeNodeAt(1);
		// printList();
		// removeNodeAt(2);
		// removeNodeAt(3);
		// printList();
		// System.out.println("Linked list size: " +getSize());
		// swapNodes(0, 2);
		// printList();
		reverseLinkedList();
	}

	public static void printList() {

		Node node;
		System.out.println("*****************");
		node = head;
		while (node != null) {
			System.out.println(node.getData());
			node = node.getNextNode();
		}
		System.out.println("*****************");
	}

	public static void reverseLinkedList() throws Exception {
		System.out.println("before");
		printList();
		int lSize = getSize();
		for (int i = 0; i < lSize / 2; i++) {
			swapNodes(i, lSize - i - 1);
		}
		System.out.println("after");
		printList();
	}

	public static void add(int data) {

		Node n = new Node(data);
		n.setNextNode(head);
		head = n;
	}

	public static void removeNodeAt(int position) throws Exception {

		if (head == null) {
			throw new Exception("Linked list empty");
		}

		Node node;
		Node prevNode;
		int i = 0;

		node = head;
		prevNode = node;
		while (node != null) {
			if (position == 0) {
				head = node.getNextNode();
				return;
			} else if (i == position) {
				prevNode.setNextNode(node.getNextNode());
				node = null;
				return;
			}
			prevNode = node;
			node = node.getNextNode();
			i++;
		}
	}

	public static int getSize() {
		if (head == null) {
			return 0;
		} else {
			Node node;
			node = head;
			int i = 0;
			while (node != null) {
				i++;
				node = node.getNextNode();
			}
			return i;
		}
	}

	public static void swapNodes(int firstNodePosition, int secondNodePosition) throws Exception {
		System.out.println("Printing linked list before swap");
		printList();
		if (head == null) {
			throw new Exception("Linked list empty");
		}
		if (firstNodePosition == secondNodePosition) {
			System.out.println("Why you doing this :P");
		}

		Node node = head;
		Node firstNode = null;
		Node secondNode = null;
		Node prevNode = null;
		Node firstNodePrev = null;
		Node secondNodePrev = null;

		int i = 0;

		while (node != null) {
			if (i == firstNodePosition) {
				firstNode = node;
				firstNodePrev = prevNode;
			}
			if (i == secondNodePosition) {
				secondNode = node;
				secondNodePrev = prevNode;
			}
			if (firstNode != null && secondNode != null) {
				break;
			}
			prevNode = node;
			node = node.getNextNode();
			i++;
		}
		if (firstNode == null) {
			throw new Exception("First node does not exists");
		}
		if (secondNode == null) {
			throw new Exception("Second node does not exists");
		}

		if (firstNode != head && secondNode != head) {
			firstNodePrev.setNextNode(secondNode);
			secondNodePrev.setNextNode(firstNode);
		}

		if (firstNode == head) {
			head = secondNode;
			secondNodePrev.setNextNode(firstNode);
		} else if (secondNode == head) {
			head = firstNode;
			firstNodePrev.setNextNode(secondNode);
		}

		// This is needed because first node next should be now second node next
		// and vice versa.
		Node tempNode = secondNode.getNextNode();
		secondNode.setNextNode(firstNode.getNextNode());
		firstNode.setNextNode(tempNode);

	}

}
