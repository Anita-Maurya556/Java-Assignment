package assignments;

class Class_1
{
	void add()
	{
		System.out.println("add");
	}
}

public class Single_Inheritance_NonStatic extends Class_1{
	void sub()
	{
		System.out.println("sub");
	}

	public static void main(String[] args) {
		 Single_Inheritance_NonStatic s1=new  Single_Inheritance_NonStatic();
				 s1.add();
				 s1.sub();
		

	}

}
