package com.techno.arraylistinternalimplementation;

import java.util.Arrays;
import java.util.Iterator;

public class MyArrayList {
	Object[] array;
	int pos;

	public MyArrayList(int size) {
		array = new Object[size];

	}

	public Object get(int index) {
		return array[index];
	}

	public void remove(int index) {
		for (int i = index; i < pos; i++) {
			array[i] = array[i + 1];
		}
		pos--;
	}

	public Iterator iterator() {
		return new MyItr();
	}

	private class MyItr implements Iterator {
		int index;

		@Override
		public boolean hasNext() {
			return (index < pos) ? true : false;
		}

		@Override
		public Object next() {

			return array[index++];
		}

	}

	public void add(Object obj) {
		if (pos >= array.length) {
			increaseCapacity();
		}
		array[pos] = obj;
		pos++;

	}

	private void increaseCapacity() {
		Object[] temp = new Object[((array.length * 3) / 2) + 1];
		for (int i = 0; i < array.length; i++) {
			temp[i] = array[i];
		}
		array = temp;
	}

	@Override
	public String toString() {
		String s = "[" + array[0];
		for (int i = 1; i < pos; i++) {
			s += "," + array[i];
		}
		s += "]";
		return s;
	}

}
