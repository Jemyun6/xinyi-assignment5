package com.coderscampus.arraylist;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CustomListTest {
	private CustomList<Integer> sut;
	
	@BeforeEach
	void beforeTests() {
		sut = new CustomArrayList<>();
		for(int i = 1; i < 50; i++) {
			sut.add(i);
		}
	}
	
	
	
	@Test
	void add_specified index_test() {
		sut.add(2, 2);
		
		//Assert
		Integer actual = sut.get(2)
		assertEquals(2, actual);
		
	}
	
	@Test
	void remove_from_middle_of_arraylist() {
		Integer itemRemoved = sut.remove(33);
		
		assertEquals(34, itemRemoved); 
		assertEquals(50, sut.get(49));
		assertEquals(0, sut.get(0));
	}
	
	@Test
	void getItem_out_of_bounds_test () {
		try {
			sut.get(100);
			fail("Expected an IndexOutOfBoundsException.");
		} catch (IndexOutOfBoundsException e) {
			return;
		}
		fail("Expected an IndexOutOfBoundsException .");
		
	}
	
	@Test
	void removing_out_of_bounds () {
		try {
			sut.remove(100);
			fail("Expected an IndexOutOfBoundsException .");
		} catch (IndexOutOfBoundsException e) {
			return;
		}
		fail("Expected an IndexOutOfBoundsException.");
		
	}

}
