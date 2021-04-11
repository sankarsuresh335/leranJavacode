package getterYsetter;

public class NewDemo {
	
	
	private int id;
	
	private String name;
	
	public void setid(int id) {
		
		this.id=id;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getid() {
		
		return id;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		NewDemo ne= new NewDemo();
		
		ne.setid(25);
		ne.setName("sankar");
		System.out.println(ne.getid());
		System.out.println(ne.getName());

	}

}
