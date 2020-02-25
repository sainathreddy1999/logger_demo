package loggers;
import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class CompoundInterestMain {
	private static final Logger LOGGER=LogManager.getLogger(log_demo.class);
	public static void main(String args[])
	{
		double p,r;
		int t,n;
		Scanner s=new Scanner(System.in);
		LOGGER.debug("Enter Principle Amount:");
		p=s.nextDouble();
		LOGGER.debug("Enter time in terms of Months:");
		t=s.nextInt();
		LOGGER.debug("Enter interest:");
		r=s.nextDouble();
		LOGGER.debug("Enter number of times Interest should be compounded:");
		n=s.nextInt();
		CompoundInterest ci=new CompoundInterest(p,t,r,n);
		LOGGER.debug("Compound interest with principle amount "+p+" for the time of "+t+" months with interest "+r+" is:");
		LOGGER.debug(ci.c_interest);
		s.close();
    }

}
