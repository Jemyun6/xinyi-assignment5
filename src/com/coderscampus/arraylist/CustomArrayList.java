package com.coderscampus.arraylist;

public class CustomArrayList<T> implements CustomList<T> {
	Object[] items = new Object[10];
	int size = 0;

	@Override
	public boolean add(T item) { 
		return add(size, item);
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
		for(int i = 0; i < size; i++) {
			newArray[i] = items[i];
		}
		return  newArray;
		
	}
	
	@Override
	public T get(int index) {
		if(index >= size) {
			System.out.println("Error : Out of index");
			return null;
		}
		return (T)items[index];
	}

	@Override
	public boolean add(int index, T item) throws IndexOutOfBoundsException {
		if(index > size) {
			throw new IndexOutOfBoundsException("Out of bounds");
		}
		if(size == items.length) {
			items = doubleSize();
		}
		
		//move each items[i](i > index) to items[i + 1],then items[index] would be empty
		for(int i = size -1; i > index ; i-- ) {
			items[i + 1] = items[i];
		}
		
		items[index] = item;
		size++;
		return true;
	}

	@Override
	public T remove(int index) throws IndexOutOfBoundsException {
		if(index >= size) {
			throw new IndexOutOfBoundsException("Out of bounds");
		}
		
		T removedItem = (T)items[index];
		for(int i = index; i < size - 1; i++) {
			items[i] = items[i + 1]; 
		}
		
		size--;
		return removedItem;
	}
	
}
