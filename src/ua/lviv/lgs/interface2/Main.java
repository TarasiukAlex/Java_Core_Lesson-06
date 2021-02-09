package ua.lviv.lgs.interface2;

import ua.lviv.lgs.interface1.Numerable;

public class Main {

	public static void main(String[] args) {

		Numerable calc = new MyCalculator(15, 0);

		calc.add();
		calc.subtract();
		calc.multiply();
		calc.devide();

	}

}
