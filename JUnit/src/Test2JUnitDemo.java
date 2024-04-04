import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;

public class Test2JUnitDemo {
	@Test
	public void disp() {
		System.out.println("This is disp method");
	}
	@Before
	public void accept() {
		/*
		 * if expression is true then test case pass
		 */
		assertTrue(12>4);
		System.out.println("Condition for accept is true");
	}
	
	@Test
	public void accept1() {
		assertFalse(12<4);
		System.out.println("consition for accept is false");
	}
	@Before
	public void accept2() {
		String a="Edubridge";
		assertNotNull(a);
		System.out.println("Value for a:"+a);
}
	@Test
	public void accept3() {
		String b=null;
		assertNull(b);
		System.out.println("Value for b:"+b);
}
	@AfterClass
	public static void cleanUp() {
		System.out.println("After all cleanup() method called");
	}
}