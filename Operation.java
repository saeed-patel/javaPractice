
public class Operation {

	public static int add(int num1, int num2)
	{
		return num1+num2;
	}
	
	public static float add(float num1, float num2)
	{
		return num1+num2;
	}
	
	public static int sub(int num1, int num2)
	{
		return num1-num2;
	}
	
	public static float sub(float num1, float num2)
	{
		return num1-num2;
	}
	
	public static int mul(int num1, int num2)
	{
		return num1*num2;
	}
	
	public static float mul(float num1, float num2)
	{
		return num1*num2;
	}
	
	public static int div(int num1, int num2)
	{
		try
		{
			return num1/num2;
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return num1;
	}
	
	public static float div(float num1, float num2)
	{
		try
		{
			return num1/num2;
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return num1;
	}
}
