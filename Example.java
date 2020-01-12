class Example
{
	public static void main(String args[])
	{
		int i;
		int a;
		for(i = 0; i < 20; i++)
		{
			a = (int) (Math.random() * 21);
			if ((a % 3 == 0) && (a % 5 == 0)) System.out.println("Число " + a + " is a BigDick");
			else if (a % 3 == 0) System.out.println("Число " + a + " is a Big");
			else if (a % 5 == 0) System.out.println("Число " + a + " is a Dick");
		}
	}
}