package Assigment_3;

public class parameter_constructor {
	
	int x=20;
	int y;
	int z;
	

	public static void main(String[] args) 
	{
		parameter_constructor s=new parameter_constructor(12, 10, 8, 4d);

		parameter_constructor s1=new parameter_constructor(20.5, 10.5, 5);
	}
	
	parameter_constructor (int a,int b,int c,double d)
	{
		double add=(a+b+c)/d;
		System.out.println("constructo running");
		System.out.println(add);
		
		
	}
	parameter_constructor(double a,double b,int c)
	{
		double subs=a-b+c;
		System.out.println(subs);
	}
	

}
