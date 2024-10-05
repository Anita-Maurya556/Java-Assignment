package assignments;
class Class_0
{
	 static void add()
	{
		System.out.println("add");
	}
}
class Class_2 extends Class_0
{
	void sub()
	{
		System.out.println("sub");
	}
}
class Class_3 extends Class_2
{
	void mul()
	{
		System.out.println("mul");
	}
}
public class Multi_Inheritance extends Class_3{
	static void div()
		{
			System.out.println("div");
		}
	}
	class Class_4 extends Multi_Inheritance
	{
		 static void mod()
		{
			System.out.println("mod");
		}
	
	
	public static void main(String[] args) {
		Multi_Inheritance m1=new Multi_Inheritance();
		m1.sub();
		m1.mul();
		add();
		div();
		mod();
		

	}

}
