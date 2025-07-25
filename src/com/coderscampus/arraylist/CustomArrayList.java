package com.coderscampus.arraylist;

public class CustomArrayList<T>  implements CustomList<T>{
	Object[] items = new Object[10];
    int size = 0;
    
	@Override
	public boolean add(T item) {
		if (size == items.length) {
			increaseArraySize();
		}
		items[size++] = item;
		return true;
		
	}
	
	@Override
	public int getSize() {
		return size;
		
	}
	
	@Override
	public T get(int index) {
		if (index < 0 || index >= size) {
			throw new IndexOutOfBoundsException("Index " + index + " is out of bounds for size" + size);	
		}
		return (T) items[index];
	}
    
	private void increaseArraySize() {
		int newSize = items.length * 2;
        Object[] newArray = new Object[newSize];
       for (int i = 0; i < items.length; i++) {
    	   newArray[i] = items[i];
       }
        items = newArray;

	}
}
