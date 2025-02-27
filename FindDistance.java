//Find Distance Code by Cole Miller

import java.util.Scanner;
import java.text.DecimalFormat;

public class FindDistance {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		double x1 = 0, y1 = 0, x2 = 0, y2 = 0;
		
		System.out.println("This program will calculate the distance between two points");
		
		//Prompts user to enter x1 and y1 values and stores them
		System.out.println("Please enter the x and y values for the first point");
		System.out.println("x:");
		x1 = input.nextDouble();
		System.out.println("y:");
		y1 = input.nextDouble();
		
		//Prompts user to enter x2 and y2 values and stores them
		System.out.println("Please enter the x and y values for the second point");
		System.out.println("x:");
		x2 = input.nextDouble();
		System.out.println("y:");
		y2 = input.nextDouble();
		
		//calls the method that calculates distance and returns the distance value
		getDistance(x1,y1,x2,y2);
		
		//calls the method that classifies the distance
		classifyDistance();
		
		input.close();
	}
	static double distance;
	//Takes the values entered and calculates their Euclidean distance
	public static void getDistance(double x1, double y1, double x2, double y2)
	{
		//Ensures final distance is rounded to 2 decimal places.
		DecimalFormat df = new DecimalFormat("#.##");
		
		distance = Math.sqrt(Math.pow((x2-x1), 2) + Math.pow((y2-y1), 2));
		System.out.println("The distance between these two points is " + df.format(distance));
		
		return;
	}
	
	//Classifies distance as short, medium, or long based on the distance calculated from the getDistance method
	public static void classifyDistance() {
		if(distance<5)
		{
			System.out.println("Classification: Short");
		}else if(distance >= 5 && distance <= 15)
		{
			System.out.println("Classification: Medium");
		}else if(distance > 15)
		{
			System.out.println("Classification: Long");
		}
	}

}
