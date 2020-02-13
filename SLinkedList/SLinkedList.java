public class SLinkedList {
	node head;
	node tail;
	
	public SLinkedList() {
		head = tail = null;
	}
	
	void printAll() {
		if(head == null) {
			System.out.println("null");
		}
		else {
			node cursor = head;
			
			while(cursor.getNext() != null) {
				System.out.print(cursor.getElement() + "-");
				cursor = cursor.getNext();
			}
			System.out.print(cursor.getElement());
		}
	}
	
	public int first() {
		return head.getElement();
	}
	
	public int last() {
		return tail.getElement();
	}
	
	public void addFirst(int d) {
		head = new node(d, head);
		
		if(tail == null) {
			tail = head;
		}
	}
	
	public void addLast(int d) {
		if(head == null) {
			node newnode = new node(d, null);
			head = tail = newnode;
		}	
		else {
			node cursor = tail;
			node newnode = new node(d, null);
			
			cursor.setNext(newnode);
			tail = newnode;
		}
	}
	
	public void removeFirst() {
		if(head == null) return ;
		
		head = head.getNext();
		
		if(head == null) {
			tail = null;
		}
	}
	
	public void removeLast() {
		if(head == null) return ;
		if(head == tail) {
			removeFirst();
		}
		else {
			node cursor = head;
			while(cursor.getNext() != tail) {
				cursor = cursor.getNext();
			}
			
			cursor.setNext(null);
			tail = cursor;
		}
	}
	
	public static void main(String[] args) {
		SLinkedList s = new SLinkedList();
		s.addFirst(1);
		s.addFirst(2);
		s.addFirst(3);
		s.addFirst(4);
		s.printAll();
		System.out.println();
		s.removeLast();
		s.removeLast();
		s.removeLast();
		s.removeLast();
		s.printAll();
	}
}
