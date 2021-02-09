package ua.lviv.lgs.Salary;

public class Main {
	
	public static void main(String[] args) {
		
		Salary worker1 = new HourSalaryEmploees();
		Salary worker2 = new FixedSalaryEmploees();
		
		
		worker1.countSalary();
		worker2.countSalary();
		
	}

}
