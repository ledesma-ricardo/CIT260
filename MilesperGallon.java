/*
 * CIT 260: Ricardo Ledesma
 * Create a program that will prompt the user for and get at least two inputs
 * values from the console, save the values in variables, and the use the
 * variables in one or more equations.
 *
 * This program calculate the miles traveled per gallon on a trip. 
 *
*/

import java.util.Scanner;

public class MilesperGallon
{
    public static void main(String[] args)
    {
        
    	Scanner in = new Scanner(System.in);
		// prompt the user for amount of miles driven
    	System.out.print("How many miles were driven?");
    	double miles = in.nextDouble();
		// prompt the user for amount of gallons used
    	System.out.print("How many gallons were used?");
    	double gallon = in.nextDouble();
    	double distance = miles / gallon;
		double roundOff = (double) Math.round(distance*100)/100;
		// start the output
    	System.out.println("The Miles-Per-Gallon used in this trip are: "+roundOff);
    }
}