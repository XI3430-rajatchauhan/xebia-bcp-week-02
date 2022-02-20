class Add {
	public int Add(int a, int b) {
		return(a+b);
	}
	public int Add(int a, int b, int c) {
		return(a+b+c);
	}
}
public class Overloading {

	public static void main(String[] args) {
		Add obj=new Add();
		int res1, res2;
		res1=obj.Add(4,1);
		res2=obj.Add(6,8,2);
		System.out.println(res1);
		System.out.println(res2);

	}

}
