package handson1;

public class GravityCalculator {
	
	public static double multi(double[] input){
		// method for multiplication
		double result = 1;
		
		for(int i = 0; i < input.length; i++ ){
			result = result * input[i];
		}
		return result;
		}
	
	// add 2 more methods for powering to square and summation (similar to multiplication)
	public static double square(double x){
	// method for printing out a result
		return x * x; 
	}
	
	public static double sum(double[] x){
		double result = 0;
	
	for(int i = 0; i < x.length; i++ ){
		result = result + x[i];
	}
	return result;
	}
	
	public static void outline(String x){
		// method for printing out a result
		System.out.print(x);
		}
	public static void line(){
		// method for printing out a result
		System.out.println();
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double gravity = -9.81; // Earth's gravity in m/s^2
		double fallingTime = 10.00 ;
		
		double initialVelocity = 0.0;
		// double finalVelocity = initialVelocity + gravity * fallingTime;
		double[] pro1 = {gravity , fallingTime};
		double[] sum1 = {multi(pro1), initialVelocity};
		double finalVelocity = sum(sum1);
		double initialPosition = 0.0;
		// double finalPosition = initialPosition + initialVelocity * fallingTime + 0.5 * gravity * fallingTime * fallingTime;
		double[] pro2 = { initialVelocity, fallingTime};
		double[] pro3 = { 0.5, gravity, square(fallingTime)};
		double[] sum2 = {initialPosition, multi(pro2), multi(pro3)};
		double finalPosition = sum(sum2);
		// System.out.println("The object's position after " + fallingTime + " seconds is " + finalPosition + " m.");

		// System.out.println("The object's velocity after " + fallingTime + " seconds is " + finalVelocity + " m/s.");
		int fallingTimeint= (int)fallingTime;
		outline("The object's position after " + fallingTimeint + " seconds is ");
		System.out.printf("%.2f",finalPosition);
		outline(" [m]");
		line();
		outline("The object's velocity after " + fallingTimeint + " seconds is ");
		System.out.printf("%.2f",finalVelocity);
		outline(" [m/s]");
	}

}
