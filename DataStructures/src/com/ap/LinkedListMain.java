package com.ap;

public class LinkedListMain {

	static Node head;
	
	public static void main(String[] args) throws Exception {
		
		add(1);
		add(2);
		add(3);
		add(4);
		//printList();
		//removeNodeAt(0);
		//removeNodeAt(1);
		//printList();
		//removeNodeAt(2);
		//removeNodeAt(3);
		//printList();
		//System.out.println("Linked list size: " +getSize());
		swapNodes(1,2);
		printList();
	}
	
	public static void printList() {
		
		Node node;
		System.out.println("*****************");
		node = head;
		while(node != null) {
			System.out.println(node.getData());
			node = node.getNextNode();
		}
		System.out.println("*****************");
	}
	
	public static void add(int data) {
		
		Node n = new Node(data);
		n.setNextNode(head);
		head = n;
	}
	
	public static void removeNodeAt(int position) throws Exception {
		
		if(head == null){
			throw new Exception("Linked list empty");
		}
		
		Node node;
		Node prevNode;
		int i=0;
		
		node = head;
		prevNode = node;
		while(node != null) {
			if(position == 0) {
				head = node.getNextNode();
				return;
			}else if(i == position){
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
		if(head == null) {
			return 0;
		}else{
			Node node;
			node = head;
			int i=0;
			while(node != null) {
				i++;
				node = node.getNextNode();
			}
			return i;
		}
	}

	//FIXME: WIP
	public static void swapNodes(int firstNodePosition, int secondNodePosition) throws Exception {
		
		
		if(head == null) {
			throw new Exception("Linked list empty");
		}
		if(firstNodePosition == secondNodePosition) {
			System.out.println("Why you doing this :P");
		}
		
		Node node = head;
		Node firstNode = node;
		Node secondNode = node;
		Node prevNode = node;
		Node firstNodePrev = null;
		Node secondNodePrev = null;
		
		int i = 0;
		
		while(node != null) {
			if(i == firstNodePosition) {
				firstNode = node;
				firstNodePrev = prevNode;
			}
			if(i == secondNodePosition) {
				secondNode = node;
				secondNodePrev = prevNode;
			}
			if(firstNodePrev != null && secondNodePrev != null) {
				break;
			}
			prevNode = node;
			node = node.getNextNode();
			i++;
		}
		if(firstNodePrev == null) {
			throw new Exception("First node does not exists");
		}
		if(secondNodePrev == null) {
			throw new Exception("Second node does not exists");
		}
		
		
		if(firstNode != head && secondNode != head) {
			firstNodePrev.setNextNode(secondNode);
			secondNodePrev.setNextNode(firstNode);
		}
		
		if(firstNode == head) {
			secondNode.setNextNode(head.getNextNode());
			head = secondNode;
			secondNodePrev.setNextNode(firstNode);
		}
		
		if(secondNode == head) {
			firstNode.setNextNode(head.getNextNode());
			head = firstNode;
			firstNodePrev.setNextNode(secondNode);
		}
		
	}

}
