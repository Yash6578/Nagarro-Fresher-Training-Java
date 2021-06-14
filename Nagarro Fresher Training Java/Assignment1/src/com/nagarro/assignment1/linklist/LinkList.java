package com.nagarro.assignment1.linklist;

public class LinkList<T> {
	protected class Node<N>{
		public T data;
		public Node<N> next;
		
		public Node(T data) {
			this.data = data;
			this.next = null;
		}
		
		public Node(T data, Node<N> next) {
			this.data = data;
			this.next = next;
		}
	}
	
	protected Node<T> head,tail;
	protected int size;
	
	public LinkList()
	{
		this.head = null;
		this.tail = null;
		this.size = 0; 
	}
	
	public void addToHead(T dataToadd)
	{
		Node<T> newNode = new Node<T>(dataToadd);
		
		if(0 == this.size)
		{
			head = newNode;
			tail = newNode;
		}
		else
		{
			Node<T> tempHead = head;
			head = newNode;
			head.next = tempHead;
		}
		
		size++;
		return;
	}
	
	public void addToTail(T dataToadd)
	{
		Node<T> newNode = new Node<T>(dataToadd);
		
		if(0 == this.size)
		{
			head = newNode;
			tail = newNode;
		}
		else
		{
			this.tail.next = newNode;
			tail = tail.next;
		}
		
		size++;
		return;
	}
	
	public int getSize() {
		return size;
	}
	
	public void display()
	{
		Node<T> it = head;
		
		while(null != it)
		{
			System.out.println(it.data);
			it = it.next;
		}
		
		return;
	}
	
	public ListIterator<T> iterator() {
		return new ListIterator<T>(head);
	}
}
