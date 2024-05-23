package LinkedListPart;

public class LL {
     Node head;
	class Node{
		String data;
		Node nex;
		
		Node(String data){
			this.data=data;
			this.nex=null;
		}
	}
	
	//add - first
	public void addFirst(String data) {
		Node newNode = new Node(data);
		if(head == null) {
			head = newNode;
			return;
		}
		newNode.nex=head;
		head = newNode;
		
	}
	
	//add Last
	public void addLast(String data) {
		Node newNode = new Node(data);
		if(head == null) {
			head = newNode;
			return;
		}
		
		Node currNode = head;
		while(currNode.nex != null) {
			currNode = currNode.nex;
		}
		currNode.nex= newNode;
	}
	// delete first 
	public void deleteFirst() {
		if(head == null) {
			System.out.println("list is empty");
			return;
		}
		head = head.nex;
	}
	
	//delete last
	public void deleteLast() {
		if(head == null) {
			System.out.println("list is empty");
			return;
		}
		
		if(head.nex==null) {
			head = null;
			return;
		}
		
		Node secondLast=head;
		Node lastNode=head.nex;
		while(lastNode.nex != null) {
			lastNode= lastNode.nex;
			secondLast= secondLast.nex;
		}
		secondLast.nex= null;
	}
	// print
	public void printList() {
		if(head == null) {
			System.out.println("list is empty");
			return;
		}
		Node currNode = head;
		while(currNode != null) {
			System.out.print(currNode.data
					+"->");
			currNode = currNode.nex;
		}
		System.out.println("null");
	}
	
	public static void main(String[] args) {
        LL list = new LL();
		list.addFirst("a");
		list.addFirst("is");
		list.addFirst("this");
		list.printList();
		
		list.addLast("list");
		list.printList();
		
		list.deleteFirst();
		list.printList();
		
		list.deleteLast();
		list.printList();
	}

}
