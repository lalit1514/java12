class Stud

{
	private int age;
	private String name;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
public class Student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stud s1=new Stud();
		
		s1.setAge(23);
		s1.setName("lalit");
		
		System.out.println(s1.getAge()+" "+s1.getName());
	}

}
