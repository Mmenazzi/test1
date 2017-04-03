package handson2;

public class Employee {
	String name;
	double basePay;
	double hoursWorked;
	
	public Employee(){
		name = "employee";
		basePay = 10;
		hoursWorked = 8;
	}
	public void salary(){
		double salary;
		salary = basePay * hoursWorked;
		System.out.println(name + "'s Salary is " + salary + " $");
	}

}

