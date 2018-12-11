package Chapter8Projects;

public class Number5Methods
{
	float[] values, SDnums;
	float mean;

	public Number5Methods(float... wassup)
	{
		values = wassup;
		SDnums = wassup;
		if (values.length > 50)
		{
			increaseSize();
		}
	}

	public float calcMean()
	{
		float hold = 0;
		int counter = 0;

		while (counter < values.length)
		{
			hold += values[counter];
			counter++;
		}

		mean = hold / counter;

		// System.out.print("Mean: ");
		return mean;
	}

	private float calcSDMean()
	{
		float SDmean, hold = 0, hold1 = 0;
		int counter = 0;

		while (counter < SDnums.length)
		{
			hold1 = 0;
			hold1 += (Math.pow(((SDnums[counter]) - mean), 2));
			SDnums[counter] = hold1;
			counter++;
		}

		counter = 0;

		while (counter < SDnums.length)
		{
			hold += SDnums[counter];
			counter++;
		}

		SDmean = hold / counter;

		return SDmean;
	}

	public String calcSD()
	{
		float SD;

		SDnums = new float[values.length];

		SDnums = values;

		SD = this.calcSDMean();

		return "Standard Deviation: " + SD;
	}

	private void increaseSize()
	{
		float[] temp = new float[values.length * 2];
		for (int whatDis = 0; whatDis < values.length; whatDis++)
			temp[whatDis] = values[whatDis];
		values = temp;
	}
}
