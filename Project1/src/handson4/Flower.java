package handson4;

public class Flower {
	String type;
	double[] dimensionalParameter = new double[4];
	
	public Flower(String type, double sepalLength, double sepalWidth, double petalLength, double petalWidth ){
		
		this.type = type;
		dimensionalParameter[0] = sepalLength;
		dimensionalParameter[1] = sepalWidth;
		dimensionalParameter[2] = petalLength;
		dimensionalParameter[3] = petalWidth;
				
	}

}
