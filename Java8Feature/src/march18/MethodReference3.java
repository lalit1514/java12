package march18;

import java.util.function.Function;
interface info{
CourseInfo	get(String info);
}
class CourseInfo{
CourseInfo(String info){
	System.out.println(info);
}
}
class Company{
Company(String name){
	System.out.println("Comany Name:"+name);
}
}
public class MethodReference3 {

	public static void main(String[] args) {
		
		Function<String,Company>bb=Company::new;
		 
		 bb.apply("Capgemini");

	}

}
