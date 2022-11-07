package linkedlist;

import java.util.LinkedList;

public class LinkedListExmp {

	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<>();
		list.add(12);
		list.add(13);
		list.add(21);
		list.add(34);
		list.removeFirst();
		list.removeLast();
		System.out.println(list);
	}
}
