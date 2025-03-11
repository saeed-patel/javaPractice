
public class Assignment09 {

	public static void main(String[] args) {
		
		System.out.print("enter the size of array");
		int size = ConsoleInput.getInteger();
		int array [] = new int [size];
		
		for(int temp=0; temp<size; temp++)
		{
			System.out.print("enter the numbers of array");
			array [temp] = ConsoleInput.getInteger();
		}
		
		for(int temp=0; temp<size; temp++)
		{
			System.out.print(array[temp]);
		}
		
		int lastIndex=array[0];
		array[0]=array[size-1];
		array[size-1]=lastIndex;
		
		System.out.println(" ");
		
		for(int temp=0; temp<size; temp++)
		{
			System.out.print(array[temp]);
		}
		
	}

}
