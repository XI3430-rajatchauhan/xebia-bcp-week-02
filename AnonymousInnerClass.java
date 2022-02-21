abstract class Person {
	abstract void quote();
}
public class AnonymousInnerClass {

	public static void main(String[] args) {
		Person p=new Person() {
			void quote() {
				System.out.println("I am the Best");
			}
		};
		p.quote();

	}

}
