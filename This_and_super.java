package Assigment_3;

public class This_and_super extends  Super_method {
	
	
	
	
	int a=10;

	public static void main(String[] args) 
	{
		This_and_super s=new This_and_super();
		s.add();
	}
	public void add()
	{
		int a=11;
		System.out.println(a);
		System.out.println(this.a);
		System.out.println(super.a);
	}

}
