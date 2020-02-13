
public class node {
	private int element;
	private node next;
	
	public node() {
		this.element = 0;
		this.next = null;
	}
	
	public node(int d, node n) {
		this.element = d;
		this.next = n;
	}
	
	public int getElement() {
		return this.element;
	}
	
	public node getNext() {
		return this.next;
	}
	
	public void setElement(int d) {
		this.element = d;
	}
	
	public void setNext(node n) {
		this.next = n;
	}
}

