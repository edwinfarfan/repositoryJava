package com.pe.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ListExample {
	
	public static void main(String args[]) {
		List list = getList();
		
		System.out.println(list);
		
		Collections.sort(list);
		System.out.println("Ordenando la lista.... ");
		System.out.println(list);

		System.out.println("2: " + list.get(2));
		System.out.println("0: " + list.get(0));

		
		//LinkedList
		LinkedList queue = getLinkedList();

		System.out.println(queue);

		queue.removeLast();
		queue.removeLast();

		System.out.println(queue);
	}

	private static LinkedList getLinkedList() {
		LinkedList queue = new LinkedList();
		queue.addFirst("Bernaldo");
		queue.addFirst("Elizabeth2");
		queue.addFirst("Gandhi");
		queue.addFirst("Lisset1");
		queue.addFirst("Pily");
		return queue;
	}

	private static List getList() {
		List list = new ArrayList();
		list.add("Benny");
		list.add("Elizabeth");
		list.add("Mathias");
		list.add("Jhonny");
		list.add("Elsa");
		list.add("Clara");
		return list;
	}
}
