class Number {
	int a;
	public int getA() {
		return a;
	}
	Number(int n) {
		this.a=n;
	} 
}
public class thisKeyword {

	public static void main(String[] args) {
		Number n1=new Number(32);
		System.out.println(n1.getA());
	}

}
