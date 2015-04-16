public class Funktsioonid
{
	int h;
	double x1;
	double x2;
	public Funktsioonid(int h)
	{
		this.h = h;
	}
	int returnH()
	{
		return h;
	}
	void kalkulatsioon(double a, double b, double c)
	{
		if(h == 1)
		{
			x1 = 0;
			x1 = x2;			
		}
		if(h == 2)
		{
			x1 = Math.sqrt((-c)/a);
			x2 = -x1;
		}
		if(h == 3)
		{
			x1 = 0;
			x2 = (-b)/a;
		}
	}
	public double returnX1()
	{
		return x1;
	}
	public double returnX2()
	{
		return x2;
	}
}