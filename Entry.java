
public class Entry {

	public static void main(String[] args) {
		Employee arrEmployee [] = new Employee[50];
		Employee emp = null;
		int index = 0;
		
		int choice = 0;
		
		final int ADD = 1;
		final int DISPLAY = 2;
		final int SORT = 3;
		final int LOAD = 4;
		final int SAVE = 5;
					
		while (choice != 6)
		{
			System.out.println("1. Add");
			System.out.println("2. Display");
			System.out.println("3. Sort");
			System.out.println("4. Load");
			System.out.println("5. Save");
			System.out.println("6. Exit");
			System.out.println("Enter your choice (1-6): ");
			choice = ConsoleInput.getInteger();
			
			if (choice == 6)
			{
				System.out.println("Exiting the program. Goodbye!!");
				break;
			}
			
			switch (choice)
			{
				case ADD:
				{	
					final int MANAGER = 1;
					final int ENGINEER = 2;
					final int SALESPERSON = 3;
					
					System.out.println("Select Employee Category (1/2/3): ");
					System.out.println("1. Manager");
					System.out.println("2. Engineer");
					System.out.println("3. Sales Person");
					int category = ConsoleInput.getInteger();
					
					System.out.println("Enter Name: ");
					String name = ConsoleInput.getString();
					
					System.out.println("Enter Address: ");
					String address = ConsoleInput.getString();
					
					System.out.println("Enter Age: ");
					int age = ConsoleInput.getInteger();
					
					System.out.println("Enter Gender: ");
					char gender = ConsoleInput.getCharacter();
					
					System.out.println("Enter Basic Salary: ");
					float basicSalary = ConsoleInput.getFloat();
					
					switch (category)
					{
						case MANAGER:
						{
							System.out.println("Enter HRA: ");
							float hra = ConsoleInput.getFloat();
							
							emp=new Manager(name, address, age, gender, basicSalary, hra);
							arrEmployee[index++]=emp;
						}
						break;
						
						case ENGINEER:
						{
							System.out.println("Enter Overtime: ");
							float overTime = ConsoleInput.getFloat();
							
							emp=new Engineer(name, address, age, gender, basicSalary, overTime);
							arrEmployee[index++]=emp;
						}
						break;
						
						case SALESPERSON:
						{
							System.out.println("Enter Commission: ");
							float commission = ConsoleInput.getFloat();
							
							emp=new SalesPerson(name, address, age, gender, basicSalary, commission);
							arrEmployee[index++]=emp;
						}
						
						default:
						{
							System.out.println("Invalid choice input!");
						}
						break;
					}
					
					System.out.println("Data Added!!");
					
				}
				break;
				
				case DISPLAY:
				{
					for (int tmp=0; tmp<index; tmp++)
					{	
						System.out.println("------------");
						System.out.println("Employee" + (tmp+1));
						arrEmployee[tmp].display();
					}
					System.out.println("End of list");
				}
				break;
				
				case SORT:
				{
					System.out.println("SORT");
				}
				break;
				
				case LOAD:
				{
					System.out.println("LOAD");
				}
				break;
				
				case SAVE:
				{
					System.out.println("SAVE");
				}
				break;
				
				default:
				{
					System.out.println("Invalid choice input! Please enter choice from 1-6 only!");
				}
				break;
			}		
		}
	}
}
