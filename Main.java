package linkedlist;

public class Main {

	public static void main(String[] args) {
		LL list = new LL();
		list.insertFirst(1);
		list.insertFirst(2);
		list.insertFirst(3);
		list.insertFirst(4);
		list.insertFirst(5);
		list.insertLast(99);
		list.insert(100,3);
		list.display();
		System.out.println(list.deleteFirst());
		list.display();
		System.out.println(list.deleteLast());
		list.display();
		System.out.println(list.delete(2));
		list.display();
		list.find(1);
	}

}
