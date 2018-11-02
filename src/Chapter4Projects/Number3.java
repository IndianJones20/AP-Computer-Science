package Chapter4Projects;

public class Number3
{
	double sphereDiameter;
	double sphereVolume;
	double sphereSurfaceArea;

	public Number3(double number)
	{
		sphereDiameter = number;
	}

	public void setsphereDiameter(double number)
	{
		this.sphereDiameter = number;
	}

	public double getsphereDiameter()
	{
		return sphereDiameter;
	}

	public double getsphereVolume()
	{
		sphereVolume = ((4.0 / 3.0) * (Math.PI * Math.pow((sphereDiameter / 2.0), 3.0)));
		return sphereVolume;
	}

	public double getsphereSurfaceArea()
	{
		sphereSurfaceArea = (4.0 * Math.PI * Math.pow((sphereDiameter / 2.0), 2.0));
		return sphereSurfaceArea;
	}
}
//Made by Tanuj Gaikwad