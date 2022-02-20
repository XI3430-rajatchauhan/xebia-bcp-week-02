class MyEmployee {
	private int id;
	private String name;
	
	public MyEmployee() {
		id=45;
		name="Rajat";
	}
	public String getName() {
		return name;
	}
	public void setname(String n) {
		this.name=n;
	}
	public void setId(int i) {
		this.id=i;
	}
	public int getId() {
		return id;
	}
}
public class Constructor {

	public static void main(String[] args) {
		MyEmployee e1=new MyEmployee();
		System.out.println(e1.getId());
		System.out.println(e1.getName());
	}

}
