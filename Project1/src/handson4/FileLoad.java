package handson4;

import java.util.*;
import java.io.*;
public class FileLoad {
public static void main(String[] args){
	
	String dataFile = "C:\\Users\\Matteo\\workspace\\Project1\\src\\handson4\\iris.csv";
	
	// Define buffer and split element
	// Create and ArrayList for Flowers (flowerList)
	ArrayList<Flower> flowerList = new ArrayList<Flower>();
	
	try {
		FileReader fr = new FileReader(dataFile);
		BufferedReader br;  
		br = new BufferedReader(fr); // load a file into buffer
		
		// Cycle through the file
		String line;
		while ((line = br.readLine()) != null) {
		// Read each line of file and store data into database
			String[] lineArray = line.split(",");
			String type = lineArray[4];
			double sepalLength  = Double.parseDouble(lineArray[0]);
			double sepalWidth  = Double.parseDouble(lineArray[1]);
			double petalLength  = Double.parseDouble(lineArray[2]);
			double petalWidth  = Double.parseDouble(lineArray[3]);
			Flower newFlower = new Flower( type, sepalLength, sepalWidth, petalLength, petalWidth);
			flowerList.add(newFlower);
	}
	br.close();
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	} catch (IOException e) {
		e.printStackTrace();
	}
	// Print out fields of flowerList elements. To get element of ArrayList, command
	// flowerList.get(i) can be used. Remember to read fields of the objects.
	for (int i=0; i < flowerList.size(); i++ ){
		Flower flowers = flowerList.get(i);
		System.out.println("flower type: " + (String) flowers.type + ", sepal length: " +
				flowers.dimensionalParameter[0] + ", sepal width: " + flowers.dimensionalParameter[1] + 
				", petal length: " + flowers.dimensionalParameter[2] + ", petal width: " + flowers.dimensionalParameter[3] );
	}
	}
}
