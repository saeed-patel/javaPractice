
public abstract class Employee {
	protected String name;
	protected String address;
	protected int age;
	protected char gender;
	protected float basicSalary;

	public Employee(String name, String address, int age, char gender, float basicSalary) {
		this.name = name;
		this.address = address;
		this.age = age;
		this.gender = gender;
		this.basicSalary = basicSalary;
	}

	public void display() {
		System.out.println("Name: " + this.name);
		System.out.println("Address: " + this.address);
		System.out.println("Age: " + this.age);
		System.out.println("Gender: " + this.gender);
		System.out.println("Basic Salary: " + this.basicSalary);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if (age < 18 || age > 60)
			this.age = -1;
		else
			this.age = age;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		if (gender != 'M' || gender != 'F' || gender != 'T')
			this.gender = 'M';
		else
			this.gender = gender;
	}

	public float getBasicSalary() {
		return basicSalary;
	}

	public void setBasicSalary(float basicSalary) {
		this.basicSalary = basicSalary;
	}

}
