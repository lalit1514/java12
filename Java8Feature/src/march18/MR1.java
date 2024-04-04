package march18;

import java.util.function.BiFunction;

public class MR1 {

	public static void main(String[] args) {
		
		
		BiFunction<Integer,String,Student>b=Student::new;

		System.out.println(b.apply(101,"lalit pawar"));

	}

}
