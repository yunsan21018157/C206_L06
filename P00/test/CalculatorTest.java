import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/*
 * I declare that this code was written by me. 
 * I do not copy or allow others to copy my code. 
 * I understand that copying code is considered as plagiarism.
 * 
 * Student Name: Sze Yunsan
 * Student ID: 21018157
 * Class: W64N
 * Date/Time created: Thursday 26-05-2022 11:21
 */

/**
 * @author 21018157
 *
 */
public class CalculatorTest {
	//updated final

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testAdd() {
		//fail("Not yet implemented");
		
		//arrange 
		int a = 4321;
		int b = 1234;
		Calculator cal = new Calculator();
		
		//act
		int actual = cal.add(a, b);
		
		//assert
		int expected = 5555;
		assertEquals(expected, actual);
	}
	
	@Test
	public void testSubtract() {
		//fail("Not yet implemented");
			
		//arrange 
		int a = 10;
		int b = 5;
		Calculator cal = new Calculator();
			
		//act
		int actual = cal.subtract(a, b);
				
			
		//assert
		int expected = 5;
		assertEquals(expected, actual);
		
}	
	@Test
	public void testMultiply() {
		//fail("Not yet implemented");
				
		//arrange 
		int a = 2;
		int b = 4;
		Calculator cal = new Calculator();
				
		//act
		int actual = cal.multiply(a, b);
				
				
		//assert
		int expected = 8;
		assertEquals(expected, actual);
	}	
	@Test
	public void testDivide() {
		//fail("Not yet implemented");
					
		//arrange 
		int a = 4;
		int b = 3;
		Calculator cal = new Calculator();
					
		//act
		int actual = cal.divide(a, b);
					
		//assert
		int expected = 12;
		assertEquals(expected, actual);
		
	}

}
