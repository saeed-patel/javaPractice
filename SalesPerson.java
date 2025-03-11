
public class SalesPerson extends Employee {
	protected float commission;
	
	public SalesPerson(String name, String address, int age, char gender, float basicSalary, float commission)
	{
		super(name, address, age, gender, basicSalary);
		this.commission = commission;
	}
	
	@Override
	public void display()
	{
		super.display();
		System.out.println("Commission: " + this.commission);
	}

	public float getComission() {
		return commission;
	}

	public void setComission(float comission) {
		this.commission = comission;
	}
	
	
}
