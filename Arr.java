package com.te.treesetdemo;

import java.util.ArrayList;

public class Arr {
	public static void main(String[] args) {

		ArrayList<Object> list = new ArrayList<>();
		list.add(10);
		list.add(45);
		list.add(35);
		list.add(25);
		list.add(55);

		System.out.println(list.isEmpty());
		System.out.println(list.contains(45));
		System.out.println(list.containsAll(list));

		System.out.println(list.size());
		boolean b = list.removeAll(list);
		System.out.println();
		
		System.out.println(b);
		System.out.println(list);

	}

}
