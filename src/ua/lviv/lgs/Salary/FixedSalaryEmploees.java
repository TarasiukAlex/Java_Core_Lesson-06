package ua.lviv.lgs.Salary;

public class FixedSalaryEmploees implements Salary {
	
	int monthlyPayment = 3000;


	@Override
	public void countSalary() {
		System.out.println("Monthly salary = " + monthlyPayment);
	}
	

}
