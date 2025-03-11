
public class Assignment14 {

	public static void main(String[] args) {
		System.out.print("enter the size of array");
		int size = ConsoleInput.getInteger();
		int array [] = new int [size];
		
		for(int temp=0; temp<size; temp++)
		{
			System.out.print("enter the numbers of array");
			array [temp] = ConsoleInput.getInteger();
		}
		
		for(int temp=0;temp<size;temp++)
		{
			System.out.print(array[temp]);
		}
		
		System.out.println(" ");
		
		System.out.println("Enter the value of Key: ");
		int key = ConsoleInput.getInteger();
		
		boolean found = false;
		for(int temp=0;temp<array.length;temp++)
		{
			
			if(key==array[temp]) {
				System.out.println(temp);
				found=true;
			}
			
		}
		if(found) {
			System.out.println("key npot availanle");
		}

	}

}
