package com.te.treesetdemo;

import java.util.Iterator;
import java.util.NavigableSet;
import java.util.TreeSet;

import com.te.hashsetimpl.Student;

public class Treesea {
	public static void main(String[] args) {
		NavigableSet t = new TreeSet().descendingSet();
		t.add(2);
		t.add(9);
		t.add(20);
		t.add(9);
		t.add(8);
		System.out.println(t);
		
		for(Object o: t) {
			System.out.println(o);
		}
		
		Iterator<Treesea> itr=t.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		} 
		
	}
}
		
		