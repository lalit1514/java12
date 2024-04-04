import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class TestJUnitDemo {
@Test
	
	public void show() {
		String name="Lalit";
		/*assertEquals(assumed value,actual value)
		 * if assume value and actual value both are equal
		 * then test case is true otherwise false
		 **/
		assertEquals("Lalit",name);
		System.out.println("Name is:"+name);
	}

@Before
/*
 * Before method execute before test method
 */
public void add() {
	int i=10,j=20;
	System.out.println("Addition:"+(i+j));
}
@After
/*
 * After method execute after test method
 */
public void sub() {
	int i=20,j=10;
	System.out.println("Substraction:"+(i-j));
}
@Ignore
public void mul() {
	int i=20,j=10;
	System.out.println("Multiplication:"+(i*j));
}
}