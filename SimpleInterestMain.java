package loggers;
import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class SimpleInterestMain {
	private static final Logger LOGGER=LogManager.getLogger(log_demo.class);
	public static void main(String args[])
	{
		double p,r;
		int y;
		Scanner s=new Scanner(System.in);
		LOGGER.info("Enter Principle Amount:");
		p=s.nextDouble();
		LOGGER.debug("Enter time in terms of Months:");
		y=s.nextInt();
		LOGGER.info("Enter interest:");
		r=s.nextDouble();
		SimpleInterest si=new SimpleInterest(p,y,r);
		LOGGER.info("Simple Interest with principle amount "+p+" for the time of "+y+" months with interest "+r+" is:");
		LOGGER.info(si.s_interest);
		s.close();

	}

}
