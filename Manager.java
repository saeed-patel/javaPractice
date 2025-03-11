
public class Manager extends Employee{
	protected float hra;
	
	public Manager(String name, String address, int age, char gender, float basicSalary, float hra)
	{
		super(name, address, age, gender, basicSalary);
		this.hra = hra;
	}
	
	@Override
	public void display()
	{
		super.display();
		System.out.println("HRA: " + this.hra);
	}

	public float getHra() {
		return hra;
	}

	public void setHra(float hra) {
		this.hra = hra;
	}

	
}

