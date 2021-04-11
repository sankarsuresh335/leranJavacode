package getterYsetter;

public class Employee_Data {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee_Demo ans= new Employee_Demo();
		
		ans.setAge(25);
		ans.setEmployeeName("sankar suresh");
		ans.setCity("pondicherry");
		ans.setemployeID(785303);
		ans.setSalary(30000);
		ans.setSex("male");
		System.out.println("age of the emp  :"+ans.getAge());
		System.out.println("City of the emp  :"+ans.getCity());
		System.out.println(" salary of the emp :"+ans.getSalary());
		System.out.println(ans.getEmployeID());
		System.out.println(ans.getSex());

		

	}

}
