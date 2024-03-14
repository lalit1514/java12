package com.capgemini;

import java.util.LinkedList;

public class LinkedListRemoveMethod {

	public static void main(String[] args) {
		LinkedList<String>l1=new LinkedList<String>();
		l1.add("Ramesh");
		l1.add("Suresh");
		l1.add("Ramesh");
		l1.add("Ajay");
		l1.add("Amit");
		System.out.println(l1);
		//bydefault first index is delete
		l1.remove();
		System.out.println(l1);
		l1.removeLast();
		System.out.println(l1);
		l1.removeFirst(); 
		System.out.println(l1);
		l1.add("Ramesh");
		l1.add("Ajay");
		System.out.println(l1);
		l1.add("Ramesh");
		System.out.println(l1);
		l1.removeLastOccurrence("Ramesh");
		System.out.println(l1);
		l1.remove(1);
		System.out.println(l1);
		l1.clear();
		System.out.println(l1);
		
		LinkedList<Integer>l11=new LinkedList<Integer>();
		l11.add(10000);
		l11.add(20000);
		System.out.println(l11);
		LinkedList<Integer>l12=new LinkedList<Integer>();
		l12.add(500);
		l12.add(600);
		l11.addAll(l12);
		System.out.println(l11);
		l11.removeAll(l12);
		System.out.println(l11);
		
	}

}
