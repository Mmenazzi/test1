package handson3;

public class Manager extends Employee {
	String officeNumber;
	
	public Manager(){
		officeNumber = "A111";
	}
	
	public Manager(String nm, double bp, double hw, char pl, String on){
		name = nm;
		basePay = bp;
		hoursWorked = hw;
		proLvl = pl;
		officeNumber = on;
	}
	
	public void office(){
		System.out.println(name + "'s office is " + officeNumber);
	}
	
	public void hasOffice(){
		if (proLvl=='A'){
			System.out.println(name + " has an individual office");
		}
		else {
			System.out.println("error, " + name + " should have an individual office");
		}
	}

}
