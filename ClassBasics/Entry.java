
public class Entry {

	public static void main(String[] args) {
		Student student1 = new Student();
		student1.setName("John");
		student1.setRollNo(2);
		
		Student student2 = new Student();
		student2.setName("Sam");
		student2.setRollNo(3);
		student2.setPhoneNo("9998887776");
		student2.setAddress("Pune");
		
		Student student3 = new Student();
		student3.setName("John");
		student3.setRollNo(4);
		student3.setPhoneNo("9999988888");
		student3.setAddress("Mumbai");

		System.out.println("Student 2 : Name-" + student2.getName() 
						+ " Roll No-" + student2.getRollNo()
						+ " Phone Number-" + student2.getPhoneNo() 
						+ " Address-" + student2.getAddress());
		
		System.out.println("Student 3 : Name-" + student3.getName() 
						+ " Roll No-" + student3.getRollNo()
						+ " Phone Number-" + student3.getPhoneNo() 
						+ " Address-" + student3.getAddress());
	}

}
