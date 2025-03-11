public class Entry 
{
	public static void main(String[] args)
	{
		SelectChoice.optchoice();
		int choice = 0;
	
		while (choice !=9)
		{
			choice=ConsoleInput.getInteger();
			switch (choice)
			{
				case 1:
				{
					System.out.println("Enter the first integer Number: ");
					int num1 = ConsoleInput.getInteger();
					System.out.println("Enter the second integer Number: ");
					int num2 = ConsoleInput.getInteger();
					int result = Operation.add(num1, num2);
					System.out.println("Result: "+ result);
					SelectChoice.optchoice();
					break;
				}
				case 2:
				{
					System.out.println("Enter the first Float Number: ");
					float num1 = ConsoleInput.getFloat();
					System.out.println("Enter the second Float Number: ");
					float num2 = ConsoleInput.getFloat();
					float result = Operation.add(num1, num2);
					System.out.println("Result: "+ result);
					SelectChoice.optchoice();
					break;
				}
				case 3:
				{
					System.out.println("Enter the first integer Number: ");
					int num1 = ConsoleInput.getInteger();
					System.out.println("Enter the second integer Number: ");
					int num2 = ConsoleInput.getInteger();
					int result = Operation.sub(num1, num2);
					System.out.println("Result: "+ result);
					SelectChoice.optchoice();
					break;
				}
				case 4:
				{
					System.out.println("Enter the first Float Number: ");
					float num1 = ConsoleInput.getFloat();
					System.out.println("Enter the second Float Number: ");
					float num2 = ConsoleInput.getFloat();
					float result = Operation.sub(num1, num2);
					System.out.println("Result: "+ result);
					SelectChoice.optchoice();
					break;
				}
				case 5:
				{
					System.out.println("Enter the first integer Number: ");
					int num1 = ConsoleInput.getInteger();
					System.out.println("Enter the second integer Number: ");
					int num2 = ConsoleInput.getInteger();
					int result = Operation.mul(num1, num2);
					System.out.println("Result: "+ result);
					SelectChoice.optchoice();
					break;
				}
				case 6:
				{
					System.out.println("Enter the first Float Number: ");
					float num1 = ConsoleInput.getFloat();
					System.out.println("Enter the second Float Number: ");
					float num2 = ConsoleInput.getFloat();
					float result = Operation.mul(num1, num2);
					System.out.println("Result: "+ result);
					SelectChoice.optchoice();
					break;
				}
				case 7:
				{
					System.out.println("Enter the first integer Number: ");
					int num1 = ConsoleInput.getInteger();
					System.out.println("Enter the second integer Number: ");
					int num2 = ConsoleInput.getInteger();
					int result = Operation.div(num1, num2);
					System.out.println("Result: "+ result);
					SelectChoice.optchoice();
					break;
				}
				case 8:
				{
					System.out.println("Enter the first Float Number: ");
					float num1 = ConsoleInput.getFloat();
					System.out.println("Enter the second Float Number: ");
					float num2 = ConsoleInput.getFloat();
					float result = Operation.div(num1, num2);
					System.out.println("Result: "+ result);
					SelectChoice.optchoice();
					break;
				}
				case 9:
				{
					System.out.println("bye");
					break;
				}
			}		
		}
	}
}
