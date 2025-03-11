
public class Engineer extends Employee {
	protected float overTime;
	
	public Engineer(String name, String address, int age, char gender, float basicSalary, float overTime)
	{
		super(name, address, age, gender, basicSalary);
		this.overTime = overTime;
	}
	
	@Override
	public void display()
	{
		super.display();
		System.out.println("Over-time: " + this.overTime);
	}

	public float getOverTime() {
		return overTime;
	}

	public void setOverTime(float overTime) {
		this.overTime = overTime;
	}
	
	
}
