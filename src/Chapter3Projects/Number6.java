package Chapter3Projects;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Number6
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		DecimalFormat fmt = new DecimalFormat("0.####");

		int radius;
		double volume;
		double surfaceArea;

		System.out.println("Enter a radius value: ");
		radius = scan.nextInt();

		volume = ((4.0 / 3.0) * (Math.PI) * (Math.pow(radius, 3.0)));
		surfaceArea = ((4.0) * (Math.PI) * (Math.pow(radius, 2.0)));

		System.out.println("Volume: " + fmt.format(volume));
		System.out.println("Surface Area: " + fmt.format(surfaceArea));

	}

}
//Made by Tanuj Gaikwad