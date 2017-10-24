package linkedList;

import node.Node;

public class LinkedList<T> {
	private Node<T> sentinel=null;
	
	public LinkedList() {
		sentinel= new Node<T>();
		sentinel.setIndex(-1);
		
	}
	public LinkedList(T value) {
		this();
		Node<T> tmp = new Node<T>(value);
		tmp.setIndex(0);
		sentinel.setNext(tmp);
	}
	public void addBefore(T value) {
		Node<T> tmp = sentinel.getNext();
		Node<T> _new = new Node<T>(value);
		_new.setNext(tmp);
		sentinel.setNext(_new);
		_new.setNext(tmp);
	}
	private void reIndex() {
		Node tmp= sentinel;
		int i =0;
		while(tmp.getNext()!=null) {
			tmp=tmp.getNext();
			tmp.setIndex(i++);
		}
	}
	public void printer() {
		printer(sentinel);
	}
	private void printer(Node<T> tmp) {
		if(tmp.getNext()==null) {
			return;
		}else {
			System.out.println(""+tmp.getNext().getValue());
			printer(tmp.getNext());
		}
	}
	public void pronter() {
		Node<T> tmp = sentinel;
		while(tmp.getNext()!=null) {
			tmp= tmp.getNext();
			System.out.println(tmp.getValue());
		}
	}
	
	public void addLast(T value) {
		Node<T> tmp = sentinel;
		//Node<T> _new = new Node<T>(value);
		while(tmp.getNext()!=null) {
			tmp=tmp.getNext();
		}
		tmp.setNext(new Node<T>(value));
	}
	public void addLast2(T value) {
		Node<T> tmp = sentinel;
		/*Node<T> niu = new Node<T>(value);
		if(tmp.getNext()!=null) {
			tmp=tmp.getNext();
			addLast2(tmp.getValue(), niu);
		}else {
			tmp.setNext(niu);
		}*/
		addLast2(value, sentinel);
	}
	private void addLast2(T value, Node<T> list) {
		if(list.getNext()==null) {
			list.setNext(new Node<T>(value));
			return;
		}else {
			addLast2(value,list.getNext());
		}
	}
}