package interest;

public class SimpleInterestCalculate extends InterestCalculationProcess {
	SimpleInterestCalculate(double principalAmount, double rateOfInterest, double noOfYears) {
		super(principalAmount, rateOfInterest, noOfYears);
	}

	public double computeSimpleInterest()
	{
	  return (principalAmount*noOfYears*rateOfInterest)/100;
	}

}
