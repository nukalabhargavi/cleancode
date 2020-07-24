package interest;

public class InterestCalculationProcess{
	double principalAmount;
	double rateOfInterest;
	double noOfYears;
	InterestCalculationProcess(){}
	InterestCalculationProcess(double principalAmount,double rateOfInterest,double noOfYears)
	{
		this.principalAmount=principalAmount;
		this.rateOfInterest=rateOfInterest;
		this.noOfYears=noOfYears;
	}
	public String getSimpleInterest(double pricipalAmount, double rateOfInterest, double noOfYears)
	{
	  SimpleInterestCalculate simpleInterest=new SimpleInterestCalculate(principalAmount, rateOfInterest, noOfYears);
	  return String.valueOf(simpleInterest.computeSimpleInterest())+"Rs/-";
	}
	public String getCompoundInterest(double pricipalAmount, double rateOfInterest, double noOfYears)
	{
	  CompundInterestCalculated compoundInterest=new CompundInterestCalculated(pricipalAmount, rateOfInterest, noOfYears);
	  return String.valueOf(compoundInterest.computeCompoundInterest())+"Rs/-";
	}
	
}