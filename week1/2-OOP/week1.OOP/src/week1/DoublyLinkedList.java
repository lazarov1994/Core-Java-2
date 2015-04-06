package week1;

import java.awt.List;
import java.util.ArrayList;
import java.util.LinkedList;

import javax.xml.soap.Node;

public class DoublyLinkedList {
	MyNode first;
	MyNode last;
	int size;

	DoublyLinkedList() {
		// first = new MyNode(null);
		first = null;
		last = first;
		size = 0;
	}

	public boolean isEmpy() {
		return first == null;// for eq with 0 it is better to use the "=="
	}

	public int size() {
		int counter = 0;
		while (first != null) {
			first = first.getNextNode();
			counter++;
		}
		return counter;
	}

	public int indexOf(Object data) {
		int index = 0;
		if (first.getData().equals(data)) {
			return index;
		} else {
			MyNode temp = first;
			while (!temp.getNextNode().getData().equals(data)) {
				temp = temp.getNextNode();
				index++;
			}
			return index;
		}
	}

	public boolean contains(Object data){
		MyNode temp = first;
		while(!temp.getData().equals(data)){
			temp = temp.getNextNode();
		}
		if(!temp.getData().equals(null)) return true;
		
		else return false;
	}
	
	public Object addIndex(int i, Object data) {
		MyNode temp;
		MyNode add = new MyNode(data, null, null);

		if (i >= size / 2) {
			temp = last;
			i = size - i - 1;
			while (i != 0) {
				temp = temp.getPrevNode();
			}
			add.setNextNode(temp);
			add.setPrivNode(temp.getPrevNode());
			temp.getPrevNode().setNextNode(add);
			temp.setPrivNode(add);
		} else {
			temp = first;
			while (i != 0) {
				temp = temp.getNextNode();
			}
			add.setNextNode(temp);
			add.setPrivNode(temp.getPrevNode());
			temp.getPrevNode().setNextNode(add);
			temp.setPrivNode(add);
		}

		return data;
	}

	public Object addLast(Object data) {
		if (this.first == null) {
			first = new MyNode(data, null, null);
			last = first;
			size++;
		} else {
			MyNode newNode = new MyNode(data, null, null);
			newNode.setPrivNode(last);
			last.setNextNode(newNode);
			last = newNode;
			size++;
		}
		return data;
	}

	public Object addFirst(Object data) {
		if (this.first == null) {
			first = new MyNode(data, null, null);
			last = first;
			size++;
		} else {
			MyNode newNode = new MyNode(data, null, null);
			newNode.setNextNode(first);
			first.setPrivNode(newNode);
			first = newNode;
			size++;
		}
		return data;
	}

	public Object getIndex(int i) {
		MyNode temp;
		if (i >= size / 2) {
			temp = last; // to not change where last points;
			i = size - i - 1;
			while (i != 0) {
				temp = temp.getPrevNode();
				i--;
			}
			return temp.getData();
		} // a b c d d e e 1
			// 4
		else {
			temp = first;
			while (i != 0) {
				temp = temp.getNextNode();
				i--;
			}
			return temp.getData();
		}
	}

	public Object getFirst() {
		return first.getData();
	}

	public Object getLast() {
		return last.getData();
	}

	public Object removeFirst() {
		// MyNode returned = new MyNode(first.getData());
		Object returned = first.getData();
		MyNode temp = first.getNextNode();
		first.setNextNode(null);
		first = temp;
		first.setPrivNode(null);
		size--;
		return returned;
	}

	public Object removeLast() {
		Object returned = last.getData();
		MyNode temp = last.getPrevNode();
		last.setPrivNode(null);
		last = temp;
		last.setNextNode(null);
		size--;
		return returned;
	}

	public Object removeIndex(int i) {
		MyNode temp;
		if (i >= size / 2) {
			temp = last;
			i = size - i - 1;
			while (i != 0) {
				temp = temp.getPrevNode();
				i--;
			}
			Object returned = temp.getData();
			temp.getNextNode().setNextNode(temp.getPrevNode());
			temp.getPrevNode().setNextNode(temp.getNextNode());
			temp.setNextNode(null);
			temp.setPrivNode(null);
			return temp.getData(); // returned

		} else {
			temp = first;
			while (i != 0) {
				temp = temp.getNextNode();
				i--;
			}
			temp.getPrevNode().setNextNode(temp.getNextNode());
			temp.getNextNode().setPrivNode(temp.getPrevNode());
			temp.setNextNode(null);
			temp.setPrivNode(null);
			return temp.getData();
		}

	}

	public void clear() {
		first = null;
		last = null;
	}
}