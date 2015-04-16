public class Programm
{
	public static void main(String[] arg)
	{
		Kysija kysija = new Kysija();
		if(kysija.askAnswer().equals("ei"))
		{
			Kalkulaator calc = new Kalkulaator(kysija.enterA(), kysija.enterB(), kysija.enterC());
			calc.kalkulatsioon();
			if(calc.returnX1() == 0 && calc.returnX2() == 0)
			{
				System.out.println("Lahendused puuduvad!");
			}
			else
			{
				System.out.println("X1= "+calc.returnX1()+" ja X2= "+calc.returnX2());
			}
		}
		else if(kysija.returnAnswer().equals("jah"))
		{
			Funktsioonid func = new Funktsioonid(kysija.askH());
			kysija.enterA();
			if(func.returnH() == 2)
			{
				kysija.enterC();
			}
			else if(func.returnH() == 3)
			{
				kysija.enterB();
			}
			func.kalkulatsioon(kysija.returnA(), kysija.returnB(), kysija.returnC());
			if(Double.isNaN(func.returnX1()))
			{
				System.out.println("Lahendused puuduvad!");
			}
			else
			{
				System.out.println("X1= " + func.returnX1() + " ja X2= " + func.returnX2());
			}
		}
		else
		{
			System.out.println("Vastus ei ole korrektne.");
		}
	}
}