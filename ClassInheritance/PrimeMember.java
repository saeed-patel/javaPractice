
public class PrimeMember extends Member {

	protected int joiningYear;
	protected int joiningFees;
	protected char isActive;
	
	public PrimeMember(String name, int age, String phoneNo, String address, float salary, int joiningYear, int joiningFees, char isActive) {
		super(name, age, phoneNo, address, salary);
		this.joiningYear = joiningYear;
		this.joiningFees = joiningFees;
		this.isActive = isActive;
	}
	
	public void displayMemberData() {
		super.displayMemberData();
		System.out.println("Joining Year: " + joiningYear);
		System.out.println("Joining Fees: " + joiningFees);
		System.out.println("Is Active: " + isActive);
	}
	
	public int getJoiningYear() {
		return joiningYear;
	}

	public void setJoiningYear(int joiningYear) {
		this.joiningYear = joiningYear;
	}

	public int getJoiningFees() {
		return joiningFees;
	}

	public void setJoiningFees(int joiningFees) {
		this.joiningFees = joiningFees;
	}

	public char getIsActive() {
		return isActive;
	}

	public void setIsActive(char isActive) {
		this.isActive = isActive;
	}

	public PrimeMember(String name, int age, String phoneNo, String address, float salary) {
		super(name, age, phoneNo, address, salary);
		
	}

}
