package feb28;
class Student{
	String name="Rahul";
	String address="Thane";
	String qualification="BE CSE";
	
}
class Course extends Student{
	String cName="Java Full Stack";
	int fees=50000;
	
}
class Placement extends Student{
	String compName="Capgemini";
	String ctc="5lakh";
}
public class HierarchicalInheritanceImpl {

	public static void main(String[] args) {
Course c1=new Course();
Placement p1=new Placement();
System.out.println("Student Name:"+c1.name+"\nStudent address:"+c1.address+"\nStudent qualification:"+c1.qualification+"\nCourse Name:"+c1.cName+"\ncourse fees:"+c1.fees+"\nCompany name:"+p1.compName+"\nCTC:"+p1.ctc);


	}

}
