package com.coderscampus.arraylist;

public class CustomArrayList<T> implements CustomList<T> {
	Object[] items = new Object[10];
	int size = 0;

	@Override
	public boolean add(T item) {
		if(size == items.length) {
			items = this.doubleSize();
		}
		items[size] = item;
		size++;
		
		return true;
	}

	@Override
	public int getSize() {
		 
		return size;
	}
	
	/*
	 * When adding a new element, if the backing Object array is full, we'd have the
	 * array double in size.
	 */
	public Object[] doubleSize() {
		Object[] newArray = new Object[size * 2];
		return  newArray;
		
	}
	
	@Override
	public T get(int index) {
		if(index >= size) {
			System.out.println("Error : out of index");
			return null;
		}
		return (T)items[index];
	}
	
}
