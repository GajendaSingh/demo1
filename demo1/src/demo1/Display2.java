package demo1;

public class Display2 {
static int a =5;
	public Display2() {
		System.out.println("you are in display2 class " );
		System.out.println("static varible " +a);
	}

	static void disp(){
		System.out.println("Variable access with class " +Display2.a);
		a= a-2;
		System.out.println("Variable access without class  " +a);
	}
	static void disp1(){
		System.out.println("Variable access with class in disp2   " +Display2.a);
		a= a*3;
		System.out.println("Variable access without class in disp2   " +a);
	}
	public void add1(int a, int b)
	{
		//this.a = a;
		System.out.println("addition is " +a +" and " +b +"is" +(a+b));
	}
	
}
