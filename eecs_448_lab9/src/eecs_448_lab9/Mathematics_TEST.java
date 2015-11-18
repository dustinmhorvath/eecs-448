package eecs_448_lab9;

import static org.junit.Assert.assertEquals; 

import java.awt.List;
import java.util.ArrayList;

import org.junit.AfterClass;
import org.junit.BeforeClass; 
import org.junit.Test;

public class Mathematics_TEST { 

	@Test   
	public void testAddition() {
		Mathematics tester = new Mathematics(1,2,3);
		assertEquals("1 + 2 + 3 must be 6", 6, tester.addition());
	}
	
	@Test   
	public void testSubtraction() {
		Mathematics tester = new Mathematics(1,2,3);
		assertEquals("2 - 1 must be 1", 1, tester.subtraction());
	}	
	
	@Test   
	public void testList() {
		Mathematics tester = new Mathematics(1,2,3);
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		assertEquals("List has 1, 2, 3", list, tester.randomList());
	}
}
