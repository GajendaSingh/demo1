package demo1;

public class Disply1 {
;
	private int a =5;
	public Disply1() {
		System.out.println("hi let start");
	}

	public void add(int a, int b)
	{
		this.a = a;
		System.out.println("addition is " +a +" and " +b +"is " +(a+b));
	}
	public static void main(String[] args) {
		
		Disply1 d1 = new Disply1();
		d1.add(d1.a, 6); 
		
		Disply1 d2 = new Disply1();
		d2.add(d2.a, 6); 
		
		Disply1 d3 = new Disply1();
		d3.add(d3.a, 6); 
		
		Display2 dx2 = new Display2();
		dx2.disp();
		dx2.disp1();
		dx2.add1(4, 3);
		
				Display2.disp();
				Display2.disp1();
				dx2.add1(4, 3);

				Display2 dx3 = new Display2();
				dx3.disp();
				dx3.disp1();
				dx3.add1(Display2.a, 3);
				
				Display2 dx4 = new Display2();
				dx4.disp();
				
		
		
		

	}

}
