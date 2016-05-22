public class employee_encapsulation {
	
	private String name;
	private int emp_id;
	private String designation;
	private double salary;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getEmp_id() {
		return emp_id;
	}
	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}
	
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public static void main(String[] args) {
		
		employee_encapsulation obj = new employee_encapsulation();
		obj.setName("Ram");
		obj.setEmp_id(123);
		obj.setDesignation("Manager");
		obj.setSalary(50000.00);
		
		System.out.println("The details of the Employee are :");
		System.out.println("Name : "+obj.getName());
		System.out.println("Employee Id : "+obj.getEmp_id());
		System.out.println("Designation : "+obj.getDesignation());
		System.out.println("Salary : "+obj.getSalary());		
	}
}
