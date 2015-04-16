import org.junit.*;
import static org.junit.Assert.*;
public class KalkulaatorTest
{
	Kalkulaator calc1 = new Kalkulaator(2,5,2);	
	@Test
	public void returns1()
	{
		calc1.calculation();
		assertEquals(2, calc1.a(), 0.01);	
		assertEquals(5, calc1.b(), 0.01);	
		assertEquals(2, calc1.c(), 0.01);
		assertEquals(-0.5, calc1.returnX1(), 0.01);	
		assertEquals(-2.0, calc1.returnX2(), 0.01);		
	}
	Kalkulaator calc2 = new Kalkulaator(2,2,2);
	@Test
	public void returns2()
	{
		calc2.calculation();
		assertEquals(2, calc2.a(), 0.01);	
		assertEquals(2, calc2.b(), 0.01);	
		assertEquals(2, calc2.c(), 0.01);
		assertEquals(0.0, calc2.returnX1(), 0.01);	
		assertEquals(0.0, calc2.returnX2(), 0.01);		
	}
	Funktsioonid func1 = new Funktsioonid(2);
	@Test
	public void returns3()
	{
		func1.calculation(0.5, 0, -2);
		assertEquals(2.0, func1.returnX1(), 0.01);
		assertEquals(-2.0, func1.returnX2(), 0.01);
	}
}

//java -cp junit-4.12.jar;hamcrest-core-1.3.jar;. org.junit.runner.JUnitCore KalkulaatorTest
//javac -cp junit-4.12.jar;. KalkulaatorTest.java