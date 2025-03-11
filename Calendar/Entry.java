
public class Entry {

	public static void main(String[] args) {
		Menu.selectOption();
		int choice = ConsoleInput.getInteger();
		switch(choice)
		{
		case 1:
		{
			System.out.print("Enter the Day: ");
			int day = ConsoleInput.getInteger();
			System.out.print("Enter the Month: ");
			int month = ConsoleInput.getInteger();
			System.out.print("Enter the Year: ");
			int year = ConsoleInput.getInteger();

			Date objDate = new Date();
			objDate.setDate(day, month, year);
			
			objDate.getDate();
			break;
		}
		}
	}

}
