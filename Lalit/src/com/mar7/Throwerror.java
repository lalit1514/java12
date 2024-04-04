package com.mar7;
class ThrowError{
	public static int dividenumber(int m,int n) throws ArithmeticException {
		int div=m/n;
		return div;
		}
public class Throwerror {

	public static void main(String[] args) {
		ThrowError t=new ThrowError();
		try {
		System.out.println(ThrowError.dividenumber(10, 0));
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
	}
	
	}

