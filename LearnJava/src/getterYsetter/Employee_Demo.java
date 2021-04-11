package getterYsetter;

public class Employee_Demo {
	
	private	String employeeName;
	private	int employeID;
	private	String sex;
	private	int age;
	private	String city;
	private	double salary;
		
	public void setemployeeName(String employeeName) {
		
		this.employeeName=employeeName;	
	}
	
	public void setemployeID(int employeID) {
		
		this.employeID=employeID;
			
		}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public int getEmployeID() {
		return employeID;
	}

	public void setEmployeID(int employeID) {
		this.employeID = employeID;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	


}
