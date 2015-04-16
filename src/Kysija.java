import java.util.*;
public class Kysija
{
	Scanner in = new Scanner(System.in);
	double a;
	double b; 
	double c;
	int h;
	String answer;
	double enterA()
	{
		System.out.println("A vaartus: ");
		a = in.nextDouble();
		return a;
	}
	double returnA()
	{
		return a;
	}
	double enterB()
	{
		System.out.println("B vaartus: ");
		b = in.nextDouble();
		return b;
	}
	double returnB()
	{
		return b;
	}
	double enterC()
	{
		System.out.println("C vaartus: ");
		c = in.nextDouble();
		return c;
	}
	double returnC()
	{

		return c;
	}	
	String askAnswer()
	{
		System.out.println("\nValime ise funktsiooni?[jah/ei]");
		answer = in.nextLine();
		return answer;
	}
	String returnAnswer()
	{
		return answer;
	}
	int askH()
	{
		System.out.println("\nValige valemi ja kirjutage a ja b asemel vaartused.\n1) y=ax^2\n2) y=ax^2+c\n3) y=ax^2+bx");
		h = in.nextInt();
		return h;
	}
}