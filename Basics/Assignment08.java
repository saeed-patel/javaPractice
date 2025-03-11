
public class Assignment08 {

	public static void main(String[] args) {
	
		System.out.print("Enter the size of array: ");
		int size = ConsoleInput.getInteger();
		
		int array[] = new int[size];
		
		for(int temp=0;temp<size;temp++)
		{
			System.out.print("Enter your Numbers: ");
			array[temp] = ConsoleInput.getInteger();
		}
		
		for(int temp=0;temp<size;temp++)
		{
			System.out.print(array[temp]);
		}
		
		System.out.println();
		
		for(int temp=size-1;temp!=-1;temp--)
		{
			System.out.print(array[temp]);
		}

	}

}
