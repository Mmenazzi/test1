package handson2;

public class FooCorporation {
	public static void main(String[] args) {
		
		Employee John = new Employee();
		John.name = "John";
		John.basePay = 7.50;
		John.hoursWorked = 38;
		John.salary();
		
		Employee Annabel = new Employee();
		Annabel.name = "Annabel";
		Annabel.basePay = 8.20;
		Annabel.hoursWorked = 42;
		Annabel.salary();
		
		Employee Graham = new Employee();
		Graham.name = "Graham";
		Graham.basePay = 10.50;
		Graham.hoursWorked = 41;
		Graham.salary();
		
		Manager Bill = new Manager();
		Bill.name = "Bill";
		Bill.basePay = 15.50;
		Bill.hoursWorked = 39;
		Bill.officeNumber = "A332";
		Bill.salary();
		Bill.office();
		
		Manager Gregory = new Manager();
		Gregory.name = "Gregory";
		Gregory.basePay = 18.20;
		Gregory.hoursWorked = 40;
		Gregory.officeNumber = "A415";
		Gregory.salary();
		Gregory.office();
		
	}
}