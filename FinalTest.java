// final class A{
	class A{
	final void display(){}
	}

class B extends A{
}


class FinalTest 
{

	final int n = 10;
	final FinalTest(){}

	public static void main(String[] args) 

	{
		final int n = 10;
		System.out.println(n);
		n = 11;
		System.out.println(n);

        FinalTest obj = new FinalTest();
		System.out.println(obj.n);
		obj.n = 12;
		System.out.println(obj.n);


	}
}
