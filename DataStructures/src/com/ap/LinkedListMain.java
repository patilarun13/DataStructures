package com.ap;

public class LinkedListMain {

	static Node head;
	
	public static void main(String[] args) {
		
		add(1);
		add(2);
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
	
	public static void add(int data) {
		
		Node n = new Node(data);
		n.setNextNode(head);
		head = n;
	}

}
