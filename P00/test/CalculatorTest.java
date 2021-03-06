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
		int a = 10;
		int b = 2;
		Calculator cal = new Calculator();
					
		//act
		double actual = cal.divide(a, b);
					
		//assert
		double expected = 5.0;
		int error = 2; //put integer for 'error' ("filled in the 'error' gap" below)
		assertEquals(expected, actual, error);
		
	}
	
	@Test
	public void testDivideWith0Denominator () {
		//fail("Not yet implemented");
		
		try {
			Calculator cal = new Calculator();
			cal.divide(5, 0);
			fail("Expected an IllegalArgumentException to be thrown");
			}catch(IllegalArgumentException e) {
				assertEquals("Division by zero is not supported", e.getMessage() );
			}catch(Throwable t) {
				assertEquals("Expected an IllegalArgumentException to be thrown", t.getMessage());
			}
	}

}
