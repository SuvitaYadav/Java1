package Argument;

class Emp{
	String name;
	int id;
	void meth() {
		System.out.println("Suvita");
		System.out.println(10);
	}
}
public class Static {
	public static void main(String[] args) {
		Emp emp =  new Emp();
		emp.meth();
		
	}
}
