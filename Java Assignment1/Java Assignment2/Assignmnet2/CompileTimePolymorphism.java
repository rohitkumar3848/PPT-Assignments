
public class CompileTimePolymorphism {
	public static void show(int num1)
	{
		System.out.println("number 1 : " + num1);
	}

	public static void show(int num1, int num2)
	{
		System.out.println("number 1 : " + num1+ " number 2 : " + num2);
	}

	public static void main(String[] args)
	{
		show(3);
		show(4, 5);
	}
}

