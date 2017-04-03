package handson3;

public class Employee {
	String name;
	double basePay;
	double hoursWorked;
	char proLvl;
	
	public Employee(){
		name = "employee";
		basePay = 10;
		hoursWorked = 8;
		proLvl = 'A';
	}
	
	public Employee(String nm, double bp, double hw, char pl){
		name = nm;
		basePay = bp;
		hoursWorked = hw;
		proLvl = pl;
	}
	
	public void salary(){
		double salaryval;
		
		if (basePay > 8){
		
			if (hoursWorked>40){
				salaryval = basePay * 40;
				salaryval = salaryval + basePay*1.5* (hoursWorked - 40 );
				System.out.println(name + "'s Salary is " + salaryval + " $");
			}
		
			else {
				salaryval = basePay * hoursWorked ;
			System.out.println(name + "'s Salary is " + salaryval + " $");
			}
		
		
		}
		
		else {
			System.out.println("base salary's too low");
		}
		
		
	}
	public void office(){
		
		String room;
		
		if (proLvl=='A'){
			room = "an individual office room";
		}
		else{
			room = "a cubicle";
		}
		
		System.out.println(name + " has " + room);
		
	}
	
	
	

}

