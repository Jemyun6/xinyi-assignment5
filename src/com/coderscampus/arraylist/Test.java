package com.coderscampus.arraylist;

public class Test {
	public static void main(String[] args) {
		CustomList<String> customers = new CustomArrayList<>();
		
		for(int i = 0; i < 50; i++) {
			customers.add("person" + i);
		}
		
		for(int i = 0; i < customers.getSize() - 1; i++) {
			System.out.println(customers.get(i));
		}
		
		
	}

}
