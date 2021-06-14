package com.nagarro.assignment1.linklist;

public class ListIterator<T> {
	LinkList<T>.Node<T> current;
	
	public ListIterator(LinkList<T>.Node<T> head) {
		this.current = head;
	}
	
	public boolean hasNext() {
		return null != this.current;
	}
	
	public T next() {
		LinkList<T>.Node<T> temp = this.current;
		this.current = this.current.next;
		return temp.data;
	}
}
