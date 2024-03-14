package com.capgemini;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) {
		HashSet<String>h1=new HashSet<String>();
			h1.add("red");
			h1.add("black");
			h1.add("red");
			h1.add("brown");
			h1.add("white");
			System.out.println(h1);
			LinkedHashSet<String>h2=new LinkedHashSet<String>();
			h2.add("red");
			h2.add("black");
			h2.add("red");
			h2.add("brown");
			h2.add("white");
			System.out.println(h2);
			TreeSet<String>h3=new TreeSet<String>();
			h3.add("red");
			h3.add("black");
			h3.add("red");
			h3.add("brown");
			h3.add("white");
			System.out.println(h3);
	}

}
