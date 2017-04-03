package handson3;
import java.util.ArrayList;

public class FooCorporation {
	public static void main(String[] args) {
		
		String[] employeeName = new String[6];
		employeeName[0] = "John";
		employeeName[1] ="Graham";
		employeeName[2] ="Annabel";
		employeeName[3] ="Margaret";
		employeeName[4] ="Bill";
		employeeName[5] ="Gregory";
		
		char[] employeeLevel = new char[6];
		employeeLevel[0] = 'B';
		employeeLevel[1] = 'B';
		employeeLevel[2] = 'A';
		employeeLevel[3] = 'B';
		employeeLevel[4] = 'A';
		employeeLevel[5] = 'A';
		
		double[] employeePay = new double[6];
		employeePay[0] = 8.50;
		employeePay[1] = 9.00;
		employeePay[2] = 9.20;
		employeePay[3] = 7.80;
		employeePay[4] = 15.00;
		employeePay[5] = 16.50;
		
		
		double[] employeeHours = new double[6];
		employeeHours[0] = 35;
		employeeHours[1] = 37;
		employeeHours[2] = 43;
		employeeHours[3] = 45;
		employeeHours[4] = 49;
		employeeHours[5] = 47;
		
		String[] managerOffice = new String[2];
		managerOffice[0] = "A332";
		managerOffice[1] = "A415";
				
		ArrayList<Employee> employeeList = new ArrayList<Employee>();
		
		for (int i=0; i<employeeName.length; i++){
			
			if(i < (employeeName.length - managerOffice.length)){
			
				Employee newEmployee = new Employee(employeeName[i], employeePay[i], employeeHours[i], employeeLevel[i] );
				employeeList.add(newEmployee);
			}
			else{
				Manager newManager = new Manager(employeeName[i], employeePay[i], employeeHours[i], employeeLevel[i], managerOffice[(i- employeeName.length + managerOffice.length )] );
				employeeList.add(newManager);
			}
		}
		
		
		for (int i=0; i<employeeName.length; i++) { // Use enhance looping
			
			if(i < (employeeName.length - managerOffice.length)){
				
				Employee employee = employeeList.get(i);
				System.out.println("The employee's name is " + employee.name + "\n");
				// Compute salary and define a working place for each employee
				employee.salary();
				System.out.println();
				employee.office();
				System.out.println();
			}
			else{
				Manager manager = (Manager) employeeList.get(i);
				System.out.println("The manager's name is " + manager.name + "\n");
				// Compute salary and define a working place for each employee
				manager.salary();
				System.out.println();
				manager.hasOffice();
				System.out.println();
			}
			
			}
				
	}
}