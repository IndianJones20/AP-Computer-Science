package Chapter4Projects;

public class Number8
{
	String planeName;
	String planeInitials;
	int flightNumber;
	String flightOrigins;
	String planeDestination;

	public Number8(String name, String initials, int number, String origins, String destination)
	{
		planeName = name;
		planeInitials = initials;
		flightNumber = number;
		flightOrigins = origins;
		planeDestination = destination;
	}
	public void setPlaneName(String planeName)
	{
		this.planeName = planeName;
	}

	public String getPlaneName()
	{
		return planeName;
	}

	public String getPlaneInitals()
	{
		return planeInitials;
	}

	public void setPlaneInitals(String planeInitals)
	{
		this.planeInitials = planeInitals;
	}

	public int getFlightNumber()
	{
		return flightNumber;
	}

	public void setFlightNumber(int flightNumber)
	{
		this.flightNumber = flightNumber;
	}

	public String getFlightOrigins()
	{
		return flightOrigins;
	}

	public void setFlightOrigins(String flightOrigins)
	{
		this.flightOrigins = flightOrigins;
	}

	public String getDestination()
	{
		return planeDestination;
	}

	public void setDestination(String destination)
	{
		this.planeDestination = destination;
	}

	public String toString()
	{
		return "Flight Details/Itinerary: " + planeName + " Flight " + planeInitials + flightNumber + "\nComing from "
				+ flightOrigins + "\nGoing to " + planeDestination + "\n";
	}

}
//Made by Tanuj Gaikwad