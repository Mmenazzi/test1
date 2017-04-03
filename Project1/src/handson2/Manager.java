package handson2;

public class Manager extends Employee {
	String officeNumber;
	
	public Manager(){
		officeNumber = "A111";
	}
	
	public void office(){
		System.out.println(name + "'s office is " + officeNumber);
	}

}
