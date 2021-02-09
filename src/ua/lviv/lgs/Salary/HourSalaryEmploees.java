package ua.lviv.lgs.Salary;

public class HourSalaryEmploees  implements Salary{
	
	int rate = 25;
	int hour = 160;

	public void countSalary() {
		System.out.println("Monthly salary = " + rate * hour);
		
	}

	
}
