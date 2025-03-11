
public class Assignment10 {

	public static void main(String[] args) {
		System.out.print("Enter size of First array: ");
		int size1 = ConsoleInput.getInteger();
		System.out.print("Enter size of Second array: ");
		int size2 = ConsoleInput.getInteger();
		
		int array1 []= new int [size1];
		int array2 []= new int [size2];
		
		for(int temp=0;temp<size1;temp++)
		{
			System.out.print("Enter the Values of First Array: ");
			array1 [temp] = ConsoleInput.getInteger(); 
		}
		
		for(int temp=0;temp<size2;temp++)
		{
			System.out.print("Enter the Values of Second Array: ");
			array2 [temp] = ConsoleInput.getInteger(); 
		}
		
		System.out.println();
		System.out.print("First Array: ");
		
		for(int temp=0;temp<size1;temp++)
		{
			System.out.print(array1[temp]);
		}
		
		System.out.println();
		System.out.print("Second Array: ");
		
		for(int temp=0;temp<size2;temp++)
		{
			System.out.print(array2[temp]);
		}
		
		System.out.println();
		System.out.print("Array After Multiplication: ");
		
		System.out.println("[");
		for(int temp=0;temp<size2;temp++)
		{
			System.out.print(array1[temp]*array2[temp]);
			System.out.print(" ");
		}
		System.out.print("]");
		
	}

}
