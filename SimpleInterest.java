package loggers;
public class SimpleInterest {
	
	double principle_amount;
	double rate_of_interest;
	double s_interest;
	int time;
	SimpleInterest(double p,int y, double r)
	{
		this.principle_amount=p;
		this.time=y;
		this.rate_of_interest=r;
        s_interest=(p*y*r)/100;
   
	}
}
