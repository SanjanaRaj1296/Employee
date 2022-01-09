package com.te.arrayListImpl;

import java.util.Arrays;
import java.util.Iterator;

public class MyArrayList {
	Object[] array;
	int position;

	public MyArrayList(int size) {
		array = new Object[size];
	}

	public void add(Object obj) {
		if (position >= array.length) {
			increaseCapacity();
		}
		array[position] = obj;
		position++;
	}

	private void increaseCapacity() {
		Object[] temp = new Object[array.length + 3];
		for (int i = 0; i < array.length; i++) {
			temp[i] = array[i];
		}
		array = temp;
	}

	public Object get(int index) {
		return array[index];
	}

	@Override
	public String toString() {
		String s = "[" + array[0];
		for (int i = 1; i < position; i++) {
			s += "," + array[i];
		}
		s += "]";
		return s;
	}
	public void remove (int index) {
		for(int i=index ; i<position;i++) {
			array[i] = array[i+1];
		}
		position--;
		}

	public Iterator<Object> iterator() {
		// TODO Auto-generated method stub
		return null;
	}
	}

	// public Iterator iterator() {

	// return null;
	// }

