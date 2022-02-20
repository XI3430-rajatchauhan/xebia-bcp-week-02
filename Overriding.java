class base {
	public void show() {
		System.out.println("Its a base class");
	}
}
class derived extends base {
	public void show() {
		System.out.println("Its a derived class");
	}
}
public class Overriding {

	public static void main(String[] args) {
		base b=new base();
		derived d=new derived();
		b.show();
		

	}

}
