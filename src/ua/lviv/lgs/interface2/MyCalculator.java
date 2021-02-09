package ua.lviv.lgs.interface2;

import ua.lviv.lgs.interface1.Numerable;

public class MyCalculator implements Numerable{
	
	int a, b;
	int res;
public MyCalculator(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}

	@Override
	public void add() {
		System.out.println( res = a + b );
	}

	
	@Override
	public void subtract() {
		System.out.println( res = a - b );
	}

	@Override
	public void multiply() {
		System.out.println( res = a * b );
	}

	@Override
	public void devide() {
		if (b == 0) {
			System.out.println("Cannot devide");
			
		} else {
System.out.println( res = a / b );
		}
		
	}

}
