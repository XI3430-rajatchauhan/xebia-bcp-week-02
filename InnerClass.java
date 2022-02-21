class Test {
	private int data=21;
	class Inner {
		void msg() {
			System.out.println("data is " + data);
		}
	}
}
public class InnerClass {

	public static void main(String[] args) {
		Test obj1=new Test();
		Test.Inner in=obj1.new Inner();
		in.msg();

	}

}
