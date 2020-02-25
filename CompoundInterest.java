package loggers;

public class CompoundInterest {
	double principle_amount;
	double rate_of_interest;
	double c_interest;
	int time,n;
	CompoundInterest(double p,int t,double r,int n)
	{
	
			this.principle_amount=p;
			this.time=t;
			this.rate_of_interest=r;
			this.n=n;
			double A=p*Math.pow(1+(r/n),n*t);
			c_interest=A-p;
	}
}
