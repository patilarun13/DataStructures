package com.ap;

public class LinkedListMain {

	static Node head;
	
	public static void main(String[] args) {
		
		Node node = new Node(1);
		add(node);
		printList();
		
		add(new Node(3));
		
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
	
	public static void add(Node n) {
		
		Node node;
		
		if(head == null) {
			head = n;
			return;
		}
		node = head;
		
		while(node.getNextNode() != null) {
			node = node.getNextNode();
		}
		
		node.setNextNode(n);
	}

}
