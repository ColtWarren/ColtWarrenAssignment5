package com.coderscampus.arraylist;

public class CustomListApplication {

	public static void main(String[] args) {
		CustomList<String> myCustomList = new CustomArrayList<>();

		   for (int i = 1; i <= 31; i++) {
	           myCustomList.add("element " + i);
	    }

		   for (int i = 0; i < myCustomList.getSize(); i++) {
	           System.out.println(myCustomList.get(i));
	    }
		System.out.println("The size of your list is: " + myCustomList.getSize());
	}

}
