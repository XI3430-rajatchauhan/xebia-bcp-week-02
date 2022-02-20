class Number {
	int a;
	
	public int getA() {
		return a;
	}
	
	Number(int n) {
		this.a=n;
	}
}
class Number2 extends Number {
	Number2(int e) {
		super(e);
		System.out.println("Its a constructor");
	}
}
public class SuperKeyword {

	public static void main(String[] args) {
		Number n1=new Number(43);
		Number2 n2=new Number2(21);
		System.out.println(n1.getA());

	}

}
