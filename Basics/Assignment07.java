
public class Assignment07 {

	public static void main(String[] args) {
		int array[]= null;
		System.out.print("How many Number you want to enter: ");
		int size = ConsoleInput.getInteger();
		
		array = new int[size];
		
		if(size>2)
		{
			for(int temp=0;temp<size;temp++)
			{
				System.out.print("Enter the number: ");
				array[temp]=ConsoleInput.getInteger();
			}
			if(array[0]==array[size-1])
				System.out.print("Both Numbers are same!!!");
		
			else
				System.out.print("Numbers are Different!!!");
		}
		else
			System.out.print("Error: Insufficient Data!!");
	}

}
