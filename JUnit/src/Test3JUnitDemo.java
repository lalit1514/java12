import org.junit.Test;
import org.junit.jupiter.api.RepeatedTest;

public class Test3JUnitDemo {
	@Test
public void disp() {
	System.out.println("This is disp method");
}
@RepeatedTest(3)
public void calci() {
	for(int i=10;i<=20;i++) {
		System.out.println(i);
	}
}
}
