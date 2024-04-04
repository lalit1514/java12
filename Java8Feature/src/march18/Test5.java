package march18;
interface Arithmatic{
	public void show(int a,int b);
	
}

public class Test5 {

	public static void main(String[] args) {

Arithmatic a1=(int i,int j)->System.out.println("Addition is:"+i+j);
Arithmatic a2=(int i,int j)->System.out.println("Substraction is:"+(i-j));
Arithmatic a3=(int i,int j)->System.out.println("Multiplication is:"+i*j);
Arithmatic a4=(int i,int j)->System.out.println("Division is:"+i/j);

a1.show(10,20);
a2.show(10,5);
a3.show(2,2);
a4.show(10,2);

	}

}
