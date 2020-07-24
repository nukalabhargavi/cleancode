package interest;

import static org.junit.Assert.*;
import org.junit.*;
public class InterestCalculationProcessTest {

	InterestCalculationProcess interestCalculation;
	@Before
	public void objectCreation()
	{
		interestCalculation=new InterestCalculationProcess();
	}
	@Test
	public void test(){
		assertEquals("160.00Rs/-",interestCalculation.getSimpleInterest(2000.00,4.0,2.0));
	}
	@Test
	public void test1(){
		assertEquals("81.60000000000014Rs/-",interestCalculation.getCompoundInterest(1000.00,4.0,2.0));
	}

}
