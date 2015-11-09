package com.ap;

public class LinkedListMain {

	static Node head;
	
	public static void main(String[] args) {
		
		LinkedListMain linkedListMain = new LinkedListMain();
		
		linkedListMain.head = new Node(1);
		Node node2 = new Node(2);
		Node node3 = new Node(3);
		
		head.setNextNode(node2);
		node2.setNextNode(node3);
		printList();
	}
	
	public static void printList() {
		
		Node node;
		
		node = head;
		while(node != null) {
			System.out.println(node.getData());
			node = node.getNextNode();
		}
	}

}
