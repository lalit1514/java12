package march18;

import java.util.function.BiFunction;

class Op{
	public int add(int a1,int b1) {
		return a1+b1;
	}
	
	public int sub(int a1,int b1) {
		return a1-b1;
	}
	
	public int mul(int a1,int b1) {
		return a1*b1;
	}
	
	public int div(int a1,int b1) {
		return a1/b1;
	}
	
	
}
public class MethodReference2 {

	public static void main(String[] args) {

		BiFunction<Integer,Integer,Integer>bb=new Op()::add;

		int result=bb.apply(10, 20);
		System.out.println("Addition:"+result);
		
		
		BiFunction<Integer,Integer,Integer>bb1=new Op()::sub;

		int result1=bb1.apply(30, 20);
		System.out.println("Subtraction:"+result1);
		
		
		BiFunction<Integer,Integer,Integer>bb2=new Op()::mul;

		int result2=bb2.apply(10, 20);
		System.out.println("Multiplication:"+result2);
		
		
		BiFunction<Integer,Integer,Integer>bb3=new Op()::div;

		int result3=bb3.apply(10, 20);
		System.out.println("Division:"+result3);
		
	}

}
