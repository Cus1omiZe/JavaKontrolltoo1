class Kalkulaator implements Vaartused
{
	private double a;
	private double b;
	private double c;
	private double x1;
	private double x2;
	private double d;
	public Kalkulaator(double a, double b, double c)
	{
		this.a = a;
		this.b = b;
		this.c = c;
	}
	public double calcD()
	{
		d = Math.pow(b,2)-4*a*c;
		return d;
	}
	public void kalkulatsioon()
	{		
		calcD();
		if(d > 0)
		{
			x1 = (-b+Math.sqrt(d))/(2*a);
			x2 = (-b-Math.sqrt(d))/(2*a);
		}
		if(d == 0)
		{
			x1 = -b /(2*a);
			x2 = x1;
		}
	}
	public double a()
	{
		return a;
	}
	public double b()
	{
		return b;
	}
	public double c()
	{
		return c;
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