package Package1;

public class GravityCalculator {
	
	public static double multi(double x1 , double x2){
		// method for multiplication
		return x1 * x2;
		}
	
	// add 2 more methods for powering to square and summation (similar to multiplication)
	public static double square(double x){
	// method for printing out a result
		return x * x; 
	}
	
	public static double sum(double x1, double x2){
		return x1 + x2;
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
		double finalVelocity = sum(initialVelocity,multi(gravity,fallingTime));
		double initialPosition = 0.0;
		// double finalPosition = initialPosition + initialVelocity * fallingTime + 0.5 * gravity * fallingTime * fallingTime;
		double finalPosition = sum(initialPosition, sum(multi(initialVelocity, fallingTime), multi(0.5, multi(gravity, square(fallingTime)))));
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
