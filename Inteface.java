interface birds {
	void show();
}
public class Inteface {

	public static void main(String[] args) {
		birds obj=new birds() {
			public void show() {
				System.out.println("in show");
			}
		};
		obj.show();

	}

}
