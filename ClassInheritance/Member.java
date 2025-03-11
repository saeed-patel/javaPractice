
public class Member {
	protected String name;
	protected int age;
	protected String phoneNo;
	protected String address;
	protected float salary;
	
	public Member(String name, int age, String phoneNo, String address, float salary) {
		this.name = name;
		this.age = age;
		this.phoneNo = phoneNo;
		this.address = address;
		this.salary = salary;
	}
	
	public void printSalary() {
		System.out.println("Salary" + salary);
	}
	
	public void displayMemberData() {
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
		System.out.println("Phone Number: " + phoneNo);
		System.out.println("Address: " + address);
		printSalary();
	}
	
	
}
