interface Test1 {
	default void show() {
		System.out.println("Default Test1");
	}
}
interface Test2 {
	default void show() {
		System.out.println("Default Test2");
	}
}
class Student implements Test1, Test2 {
	public void show() {
		Test1.super.show();
		Test2.super.show();
	}
}

public class Interface {

	public static void main(String[] args) {
		Student s1=new Student();
		s1.show();

	}

}
